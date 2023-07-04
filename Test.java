package MusicApp;


public class Test {
		
		 public static void main(String[] args) {
		        Spotify spotify = new Spotify();

		  
		        spotify.altaUsuario("usuario1@gmail.com", "Pérez", 25, CategoriaUsuario.GRATUITO);
		        spotify.altaUsuario("usuario2@gmail.com", "Gómez", 30, CategoriaUsuario.ESTANDAR);
		        spotify.altaUsuario("usuario3@gmail.com", "López", 40, CategoriaUsuario.PREMIUM);

		        spotify.altaCancion("Canción 1", "Autor 1", "Rock", 100, 10);
		        spotify.altaCancion("Canción 2", "Autor 2", "Pop", 50, 5);
		        spotify.altaCancion("Canción 3", "Autor 3", "Electrónica", 200, 15);

		       
		        ResultadoEscucharCancion resultado1 = spotify.escucharCancion("usuario1@gmail.com", "Canción 1", "Autor 1");
		        System.out.println("Resultado 1: " + resultado1); 

		        ResultadoEscucharCancion resultado2 = spotify.escucharCancion("usuario2@gmail.com", "Canción 2", "Autor 2");
		        System.out.println("Resultado 2: " + resultado2); 

		        ResultadoEscucharCancion resultado3 = spotify.escucharCancion("usuario3@gmail.com", "Canción 3", "Autor 3");
		        System.out.println("Resultado 3: " + resultado3); 

		        ResultadoEscucharCancion resultado4 = spotify.escucharCancion("usuario1@gmail.com", "Canción 2", "Autor 2");
		        System.out.println("Resultado 4: " + resultado4);

		        ResultadoEscucharCancion resultado5 = spotify.escucharCancion("usuario2@gmail.com", "Canción 1", "Autor 1");
		        System.out.println("Resultado 5: " + resultado5); 

		        ResultadoEscucharCancion resultado6 = spotify.escucharCancion("usuario1@gmail.com", "Canción 4", "Autor 4");
		        System.out.println("Resultado 6: " + resultado6); 

		        
		        System.out.println("Lista de usuarios:");
		        spotify.listarUsuarios();

		   
		        System.out.println("Canciones escuchadas por usuario usuario1@gmail.com:");
		        spotify.listarCancionesPorUsuario("usuario1@gmail.com");

	}

}
