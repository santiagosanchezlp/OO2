package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
	private DatabaseRealAccess database;
	private boolean sesionIniciada;
	private String contrasena;
	
	public DatabaseProxy (DatabaseRealAccess unaDatabase, String unaContrasena) {
		this.database = unaDatabase;
		this.sesionIniciada = false;
		this.contrasena = unaContrasena;
	}

	public void iniciarSesion(String unaContrasena) {
		if(!this.sesionIniciada) {
			if(this.contrasena.equals(unaContrasena)) {
				this.sesionIniciada = true;
			} else {
				throw new RuntimeException("Contraseña invalida");
			}
		} else {
			throw new RuntimeException("Su sesion ya se encuentra iniciada");
		}
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.sesionIniciada)
			return this.database.getSearchResults(queryString);
		throw new IllegalArgumentException("Debe iniciar sesion");
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.sesionIniciada)
			return this.database.insertNewRow(rowData);
		throw new IllegalArgumentException("Debe iniciar sesion");
	}

}
