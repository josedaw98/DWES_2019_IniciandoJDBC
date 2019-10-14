package modelo.cines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.util.BDConect;
import negocio.beans.CineBean;

public class CinesDelete {
	
	public void deleteCine(CineBean cine) {
		Connection conexion = BDConect.getConexion(); 
       	PreparedStatement stmt;
       	
       	String sql = 	"DELETE from cines where idcines= " + cine.getIdCine();
       	
       	
		try {
			stmt = conexion.prepareStatement(sql);
	       	stmt.execute(sql);
	       	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}
