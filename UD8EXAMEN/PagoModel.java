package ud8.examen.llano;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PagoModel {

    // ------------------ INSERTAR PAGO ------------------
    public static void insertPago(Connection con, Pago p) throws SQLException {
    	String sql= "INSERT INTO payments VALUES (?,?,?,?)";
    	
    	PreparedStatement sentencia = con.prepareStatement(sql);
    	
    	sentencia.setInt(1, p.getCustomerNumber());
    	sentencia.setString(2, p.getCheckNumber());
    	sentencia.setString(3, p.getPaymentDate());
    	sentencia.setDouble(4, p.getAmount());
    	
    	sentencia.executeUpdate();

    }

    // ------------------ CONSULTAR IMPORTE ------------------
    public static double getImporte(Connection con, int customerNumber, String checkNumber)
            throws SQLException {
    	
    		double importe = 0;
    		
    		String sql ="SELECT amount FROM payments AS importe WHERE customerNumber=? AND checkNumber=?";
    		
    		PreparedStatement sentencia = con.prepareStatement(sql);
    		
    		sentencia.setInt(1, customerNumber);
    		sentencia.setString(2, checkNumber);
    		
    		ResultSet rs = sentencia.executeQuery();
    		
    		importe = rs.getDouble("amount");
    		
    		return importe;
    		
    }

    // ------------------ ACTUALIZAR IMPORTE ------------------
    public static void updateImporte(Connection con, int customerNumber, String checkNumber, double nuevoImporte)
            throws SQLException {

    		String sql = "UPDATE payments SET amount=? WHERE customerNumber=? AND checkNumber=?";
    		
    		PreparedStatement sentencia = con.prepareStatement(sql);
    		
    		sentencia.setDouble(1, nuevoImporte);
    		sentencia.setInt(2, customerNumber);
    		sentencia.setString(3, checkNumber);
    		
    		sentencia.executeUpdate();
    }

    // ------------------ ELIMINAR PAGO ------------------
    public static void deletePago(Connection con, int customerNumber, String checkNumber)
            throws SQLException {
    	
    		String sql = "DELETE FROM payments WHERE customerNumber=? AND checkNumber=?;";
    		
    		PreparedStatement sentencia = con.prepareStatement(sql);
    		
    		sentencia.setInt(1, customerNumber);
    		sentencia.setString(2, checkNumber);
    		
    		sentencia.executeUpdate();
    }
}

