package videojuegos;

import java.util.ArrayList;
import java.util.List;




class Videojuego {

	public static void main(String[] args) {
		List<VideoJuegoUno> listaVideoJuegos = new ArrayList<VideoJuegoUno>();
		
		
		VideoJuegoUno video1 = new VideoJuegoUno(123, "Banjo Kanzooie", "Nintento 64", 4, "Plataforma");
		
		VideoJuegoUno video2 = new VideoJuegoUno(456, "Mario Party 3", "Nintento 64", 4, "Plataforma");
		
		VideoJuegoUno video3 = new VideoJuegoUno(789, "Age of Empire II", "PC", 4, "Estrategia");
		
		VideoJuegoUno video4 = new VideoJuegoUno(101, "Counter Strike", "PC", 4, "Shooter");
		
		VideoJuegoUno video5 = new VideoJuegoUno(100, "Mario Kart 64", "Nintento 64", 2, "Plataforma");
		
		
		
		listaVideoJuegos.add(video1);
		listaVideoJuegos.add(video2);
		listaVideoJuegos.add(video3);
		listaVideoJuegos.add(video4);
		listaVideoJuegos.add(video5);
		
		
		
		//COMO RECORRER LA LISTA
		for (VideoJuegoUno video : listaVideoJuegos) {
			System.out.println("Titulo: " + video.getTitulo() + "\nConsola: " + video.getConsola() + "\nCantidad de jugaodres: " + video.getCantJugadores() );
			
		}
	System.out.println("-------------------------------------------------------------------------------------");
		
		
		//CAMBIAR DE NOMBRES Y JUGADORES
		video1.setCantJugadores(10);
		video1.setTitulo("Banjo Kazooie II");
		
		video5.setTitulo("Super Mario Kart");
		video5.setCantJugadores(6);
		
		for (VideoJuegoUno video : listaVideoJuegos) {
			if (video.getConsola().equalsIgnoreCase("Nintento 64")) {
				System.out.println(video.toString());
				
			} 
		}
		
		
		//MOSTRAR ALGUNOS ELEMENTOS DE UNA LISTA
		System.out.println("--------------------------------------------------------------------------");
		for (VideoJuegoUno video : listaVideoJuegos) {
			System.out.println("Titulo: " + video.getTitulo() + "\nConsola: " + video.getConsola() + "\nCantidad de jugaodres: " + video.getCantJugadores() );
			
		}
		
		

	}

}
