package MusicApp;

import java.util.ArrayList;

public class Usuario {
	
	private String email;
	private String apellido;
	private int edad;
	private int cantidadEscuchadas = 0;
	private CategoriaUsuario categoria;
	private ArrayList <Cancion> cancionesEscuchadas = new ArrayList<>();
	
	
	public Usuario(String email, String apellido, int edad, CategoriaUsuario categoria) {
		this.email = email;
		this.apellido = apellido;
		this.edad = edad;
		this.categoria = categoria;

	}
	
	public Usuario(int cantidadEscuchadas) {
		this.cantidadEscuchadas = cantidadEscuchadas;
	}

	public String getEmail() {
		return email;
	}

	public CategoriaUsuario getCategoria() {
		return categoria;
	}

	public int getCantidadEscuchadas() {
		return cantidadEscuchadas;
	}

	public void cancionesEscuchadas() {
		for(Cancion cancion : cancionesEscuchadas) {
			System.out.print(cancion);
		}
	}
	
	

	
	

	
}
