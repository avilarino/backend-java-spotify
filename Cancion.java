package MusicApp;

public class Cancion {
	private String nombre;
	private String autor;
	private String genero;
	private int cantReproducciones;
	private int cantDias;
	
	
	public Cancion(String nombre, String autor, String genero, int cantReproducciones, int cantDias) {
	
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.cantReproducciones = cantReproducciones;
		this.cantDias = cantDias;
	}


	public String getNombre() {
		return nombre;
	}


	public String getAutor() {
		return autor;
	}


	public int getCantReproducciones() {
		return cantReproducciones;
	}


	public void setCantReproducciones(int cantReproducciones) {
		this.cantReproducciones = cantReproducciones;
	}


	public int getCantDias() {
		return cantDias;
	}


	
	
	
}
