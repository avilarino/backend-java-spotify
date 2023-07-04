package MusicApp;

import java.util.ArrayList;

public class Spotify {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Cancion> canciones;
	
	
	Spotify(){
		 usuarios = new ArrayList<>();
		 canciones = new ArrayList<>();
	}
	
	
	public Cancion buscarCancion(String nombre, String autor) {
		Cancion cancionBuscada = null;
		
		int i = 0;
		
		while(cancionBuscada == null && i < this.canciones.size()) {
			Cancion cancion = this.canciones.get(i);
			
			if(cancion.getNombre().equals(nombre) && cancion.getAutor().equals(autor)){
				cancionBuscada = cancion;
			}
			i++;
		}
		
		return cancionBuscada;
	}

	public boolean altaCancion(String nombre, String autor, String genero, int cantReproducciones, int cantDias) {
		
		Cancion cancionBuscada = this.buscarCancion(nombre, autor);
		boolean agregado = false;
		
		if(cancionBuscada == null) {
			Cancion cancionNueva = new Cancion(nombre,autor,genero,cantReproducciones, cantDias);
			this.canciones.add(cancionNueva);
			agregado = true;
		}
		return agregado;
			
	}
	
	
	public Usuario buscarUsuario(String email) {
		Usuario usuarioBuscado = null;
		
		int i = 0;
		
		while(usuarioBuscado == null && i < this.usuarios.size()) {
			Usuario usuario = this.usuarios.get(i);
			
			if(usuario.getEmail().equals(email)){
				usuarioBuscado = usuario;
			}
			i++;
		}
		
		return usuarioBuscado;
	}
	
	public boolean altaUsuario(String email, String apellido, int edad, CategoriaUsuario categoria) {
		
		Usuario usuarioBuscado = this.buscarUsuario(email);
		boolean agregado = false;
		
		if(usuarioBuscado == null) {
			Usuario usuarioNuevo = new Usuario(email,apellido,edad,categoria);
			this.usuarios.add(usuarioNuevo);
			agregado = true;
		}
		return agregado;
			
	}
	

	public ResultadoEscucharCancion escucharCancion(String email, String nombre, String autor) {
		ResultadoEscucharCancion resultado = ResultadoEscucharCancion.CANCION_ESCUCHADA;
		
		Usuario usuarioBuscado = this.buscarUsuario(email);
		Cancion buscarCancion = this.buscarCancion(nombre, autor);
		
		if (usuarioBuscado == null) {
	        resultado = ResultadoEscucharCancion.USUARIO_INEXISTENTE;
	    } else if (buscarCancion == null) {
	        resultado = ResultadoEscucharCancion.CANCION_INEXISTENTE;
	    } else {
	        if (usuarioBuscado.getCategoria() == CategoriaUsuario.GRATUITO) {
	            if (usuarioBuscado.getCantidadEscuchadas() >= 50) {
	                resultado = ResultadoEscucharCancion.LIMITE_ALCANZADO;
	            } else if (buscarCancion.getCantDias() <= 7 && buscarCancion.getCantReproducciones() >= 10) {
	                resultado = ResultadoEscucharCancion.CANCION_ESCUCHADA;
	            } else {
	                resultado = ResultadoEscucharCancion.CANCION_NO_DISPONIBLE;
	            }
	        } else if (usuarioBuscado.getCategoria() == CategoriaUsuario.ESTANDAR) {
	            if (buscarCancion.getCantReproducciones() >= 50) {
	                resultado = ResultadoEscucharCancion.CANCION_ESCUCHADA;
	            } else {
	                resultado = ResultadoEscucharCancion.CANCION_NO_DISPONIBLE;
	            }
	        }
	    }

	    return resultado;
	}
		
	
	
	public void listarUsuarios() {
		for(Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}
	
	public void listarCancionesPorUsuario(String email) {
		Usuario buscarUsuario = this.buscarUsuario(email);
		
		if(buscarUsuario != null) {
			buscarUsuario.cancionesEscuchadas();
		} else {
			System.out.println("el usuario es inexistente");
		}
	}
	
	
	
	
}
