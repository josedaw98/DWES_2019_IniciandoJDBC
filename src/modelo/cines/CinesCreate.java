package modelo.cines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.util.BDConect;
import negocio.beans.CineBean;

public class CinesCreate {

	public void createCine(CineBean cine) {
		Connection conexion = BDConect.getConexion(); 
       	PreparedStatement stmt;
       	
       	String sql ="insert into cines (nombre, responsable, telefono,direccion ) "
   				+ "values('" +cine.getNombre()+ "','"+cine.getResponsable()+ "','"+cine.getTelefono()+ "','"+cine.getDireccion()+ "')";
       	
		try {
			stmt = conexion.prepareStatement(sql);
	       	stmt.execute(sql);
	       	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}
