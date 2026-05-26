package ud8.examen.llano;

import java.sql.Connection;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) {
    	
    	Connection con = Conexion.conectar();
    	

        // Comprobamos la conexión ANTES del try/catch
        if (con == null) {
            System.out.println("No se pudo establecer conexión con la BD.");
            return;
        }

        try {
        	
        	con.setAutoCommit(false);

            // TRANSACCIÓN 1: insertar dos pagos
            PagoModel.insertPago(con,
                    new Pago(103, "PAGO1", "2026-05-25", 200.00));
            System.out.println("Insertado PAGO1");

            PagoModel.insertPago(con,
                    new Pago(103, "PAGO2", "2026-05-26", 350.00));
            System.out.println("Insertado PAGO2");
            
            con.commit();

            System.out.println("Transacción 1 completada\n");
            
            System.out.println("Empezamos la segunda transaccion");

            // TRANSACCIÓN 2: actualizar importes con IVA 21%
            double imp1 = PagoModel.getImporte(con, 103, "PAGO1");
            double imp2 = PagoModel.getImporte(con, 103, "PAGO2");

            double iva = 1.21;

            PagoModel.updateImporte(con, 103, "PAGO1", imp1 * iva);
            System.out.println("Actualizado PAGO1 con IVA");

            PagoModel.updateImporte(con, 103, "PAGO2", imp2 * iva);
            System.out.println("Actualizado PAGO2 con IVA");
            
            con.commit();

            System.out.println("Transacción 2 completada\n");
            
            System.out.println("Empezamos la tercera transaccion");

            // TRANSACCIÓN 3: borrar ambos pagos
            
            PagoModel.deletePago(con, 103, "PAGO1");
            System.out.println("Borrado el primer pago");
            
            PagoModel.deletePago(con, 103, "PAGO2");
            System.out.println("Borrado el segundo pago");
            
            System.out.println("Borrados todos los pagos");
            System.out.println("Transacción 3 completada\n");
            
            con.commit();

        } catch (SQLException e) {

            System.out.println("Error detectado, intentando rollback...");

            try {
            	if (con!=null) {
					con.rollback();
					 System.out.println("Rollback realizado.");
				}
            }catch (SQLException g) {
                System.out.println("Error en rollback: " + g.getMessage());
            }

            System.out.println("Error: " + e.getMessage());
            
        } finally {
			try {
				if (con!=null) {
					con.close();
					System.out.println("Conexion cerrada correctamente!");
				}
			} catch (SQLException g) {
				System.out.println("Error al cerrar la conexion");
			}
		}
    }
}

