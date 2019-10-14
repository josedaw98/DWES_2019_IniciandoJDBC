package view.cines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import modelo.cines.CinesDelete;
import modelo.cines.CinesUpdate;
import negocio.beans.CineBean;

public class DeleteCineView {
	
	public static void BorrarCine(CineBean cine) throws IOException {
	
	CinesDelete cu = new CinesDelete();
	cu.deleteCine(cine);
	

}
}
