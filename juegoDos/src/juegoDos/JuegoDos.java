package juegoDos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JuegoDos {

    public static void main(String[] args) {
        int opcion, apuesta;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Qué juego quiere realizar? (ingrese número 1-3): " +
                "\n 1 - Juego de Vasos" +
                "\n 2 - Mini envido" +
                "\n 3 - Tiro al pato" +
                "\n 0 - Salir"));
            apuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuanto quiere apostar: "));

            if (opcion == 2) {
                // MINI ENVIDO
            	JOptionPane.showMessageDialog(null, "Elegiste el juego: \nMINI ENVIDO. \n"
            			+ "El juego es al azar, en la proxima imagen apretas aceptar y vamos a ver que cartas te salen \nLas reglas para ganar son:"
            			+ "\nSi te tocan dos cartas del mismo palo o del mismo numero, GANAS y se duplica tu apuesta. \n si la suma de los 3 da 30, no ganaste ni perdiste se te devuelve la apuesta"
            			+ "\nEn el peor de los casos perdes y perdes todos tus ahorros");
            	

				JOptionPane.showMessageDialog(null, "¿Estas listo?", "Risa malvada", JOptionPane.DEFAULT_OPTION,
        				new ImageIcon(JuegoDos.class.getResource("/img/risamalvada.gif")));
            	
            	
            
                int cartaUno, cartaDos, cartaTres;
                int paloUno, paloDos, paloTres;
                String paloTexto1 = "", paloTexto2 = "", paloTexto3 = "";
                String resultado;

                cartaUno = (int) (Math.random() * 12 + 1);
                cartaDos = (int) (Math.random() * 12 + 1);
                cartaTres = (int) (Math.random() * 12 + 1);

                paloUno = (int) (Math.random() * 4 + 1);
                paloDos = (int) (Math.random() * 4 + 1);
                paloTres = (int) (Math.random() * 4 + 1);

                switch (paloUno) {
                    case 1: paloTexto1 = "Basto"; break;
                    case 2: paloTexto1 = "Oro"; break;
                    case 3: paloTexto1 = "Espada"; break;
                    case 4: paloTexto1 = "Copa"; break;
                }
                switch (paloDos) {
                    case 1: paloTexto2 = "Basto"; break;
                    case 2: paloTexto2 = "Oro"; break;
                    case 3: paloTexto2 = "Espada"; break;
                    case 4: paloTexto2 = "Copa"; break;
                }
                switch (paloTres) {
                    case 1: paloTexto3 = "Basto"; break;
                    case 2: paloTexto3 = "Oro"; break;
                    case 3: paloTexto3 = "Espada"; break;
                    case 4: paloTexto3 = "Copa"; break;
                }

                int suma = cartaUno + cartaDos + cartaTres;

                if ((paloUno == paloDos || paloUno == paloTres || paloDos == paloTres) ||
                    (cartaUno == cartaDos || cartaUno == cartaTres || cartaDos == cartaTres)) {
                    resultado = "¡Ganaste!, se duplica tu apuesta";
                    apuesta = apuesta*2;
                } else if (suma > 30) {
                    resultado = "Se te devuelve tu apuesta";
                    apuesta = apuesta;
                } else {
                    resultado = "Perdiste, perdiste, no hay nadie peor que vos";
                    apuesta = 0;
                }

                String mensaje = "Tus cartas son:\n"
                        + cartaUno + " de " + paloTexto1 + "\n"
                        + cartaDos + " de " + paloTexto2 + "\n"
                        + cartaTres + " de " + paloTexto3 + "\n\n"
                        + "Resultado: " + resultado
                        + "\nApuesta: " + apuesta;
                		

                JOptionPane.showMessageDialog(null, mensaje);

            } else if (opcion == 1) {
                // JUEGO DE VASOS
            	int vaso, jugador;

            	JOptionPane.showMessageDialog(null, "Elegiste: \n JUEGO DE VASOS. \nEl juego consiste en que tenes que adivinar en donde se encuentra la pelotita, tenes 3 oportunidades, vas a tener que elegir entre las opciones \n1(izquierda) \n2(medio) \n3(derecha)");

            	JOptionPane.showMessageDialog(null, "Buena suerte", "Good luck", JOptionPane.DEFAULT_OPTION,
            	        new ImageIcon(JuegoDos.class.getResource("/img/goodluck.gif")));

            	jugador = Integer.parseInt(JOptionPane.showInputDialog(
            	        "¿Dónde cree que se encuentra el vaso? \nOpción 1 - Izquierda \nOpción 2 - Medio \nOpción 3 - Derecha"));

            	for (int i = 1; i <= 3; i++) {
            	    vaso = (int) (Math.random() * 3 + 1);

            	    String imagen = "";
            	    switch (vaso) {
            	        case 1:
            	            imagen = "vaso_izquierda.png";
            	            break;
            	        case 2:
            	            imagen = "vaso_medio.png";
            	            break;
            	        case 3:
            	            imagen = "vaso_derecha.png";
            	            break;
            	    }

            	    if (vaso == jugador) {
            	        apuesta *= 2;
            	        JOptionPane.showMessageDialog(
            	                null,
            	                "¡Ganaste! Se duplica tu apuesta: $" + apuesta,
            	                "¡Acierto!",
            	                JOptionPane.INFORMATION_MESSAGE,
            	                new ImageIcon(JuegoDos.class.getResource("/img/" + imagen))
            	        );
            	        break;
            	    } else {
            	        if (i < 3) {
            	            JOptionPane.showMessageDialog(
            	                    null,
            	                    "Fallaste, te queda otra oportunidad...",
            	                    "La pelota estaba: ",
            	                    JOptionPane.INFORMATION_MESSAGE,
            	                    new ImageIcon(JuegoDos.class.getResource("/img/" + imagen))
            	            );

            	            jugador = Integer.parseInt(JOptionPane.showInputDialog(
            	                    "¿Dónde cree que se encuentra el vaso? \nOpción 1 - Izquierda \nOpción 2 - Medio \nOpción 3 - Derecha"));

            	        } else {
            	            JOptionPane.showMessageDialog(
            	                    null,
            	                    "Perdiste las 3 oportunidades.\nLa pelotita estaba en la posición: " ,
            	                    "Resultado",
            	                    JOptionPane.INFORMATION_MESSAGE,
            	                    new ImageIcon(JuegoDos.class.getResource("/img/" + imagen))
            	            );
            	        }
            	    }
            	}


            

            } else if (opcion == 3) {
                // TIRO AL PATO
                int pato, puntaje = 0;
                JOptionPane.showMessageDialog(null, "Tiro al pato", "Tiro al pato", JOptionPane.DEFAULT_OPTION,
            	        new ImageIcon(JuegoDos.class.getResource("/img/tiroalpato.jpg")));
                JOptionPane.showMessageDialog(null, "Bienvenido al juego de: TIRO AL PATO. \nEl juego constiste en que apretas aceptar y sale un 'disparo'. \nTres patos tienen puntaje = 0"
                		+ "\nDos tienen puntaje = 5 \nY uno tiene puntaje = 10." + 
                		"\nSi la suma de los patos te da igual o mayor a 20, ganaste y se duplica tu apuesta, en caso contrario perdiste y no recibis nada.");

                for (int i = 1; i <= 3; i++) {
                    pato = (int) (Math.random() * 6 + 1); // 1 a 6
                    int puntosDelPato = 0;
                    String mensajePato = "";

                    switch (pato) {
                        case 1:
                        case 2:
                        case 3:
                            puntosDelPato = 0;
                            mensajePato = "Te salió un pato sin puntos 😅";
                            break;
                        case 4:
                        case 5:
                            puntosDelPato = 5;
                            mensajePato = "¡Buen tiro! Pato de 5 puntos 🦆";
                            break;
                        case 6:
                            puntosDelPato = 10;
                            mensajePato = "¡Increíble! Le diste al pato de 10 puntos 🎯🦆";
                            break;
                    }

                    puntaje += puntosDelPato;

                    JOptionPane.showMessageDialog(null,
                        "Disparo #" + i +
                        "\nSalió el pato número " + pato +
                        "\n" + mensajePato +
                        "\nPuntaje de este disparo: " + puntosDelPato);
                }

                if (puntaje >= 20) {
                    JOptionPane.showMessageDialog(null, "🎉 ¡GANASTE! Puntaje total: " + puntaje);
                } else {
                    JOptionPane.showMessageDialog(null, "😞 PERDISTE. Puntaje total: " + puntaje);
                }

            } else if (opcion != 0) {
                JOptionPane.showMessageDialog(null, "Error: ingrese un número válido entre 1 y 3 (o 0 para salir)");
            }

        } while (opcion != 0);

        JOptionPane.showMessageDialog(null, "Gracias por jugar. ¡Hasta la próxima!");
    }
}


