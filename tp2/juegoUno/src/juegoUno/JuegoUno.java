package juegoUno;

import javax.swing.JOptionPane;

class JuegoUno {

	public static void main(String[] args) {
		
		int apuesta, total, vaso, jugador;
		String pregunta;
		
		pregunta = JOptionPane.showInputDialog("Desea continuar: ");
	
		jugador = Integer.parseInt(JOptionPane.showInputDialog("Donde cree que se encuentra el vaso: \n Opción 1 - Izquierda \n Opción 2 - Medio \nOpcion 3 - Derecha"));
		apuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su apuesta: "));
		
			for (int i = 1; i <= 3; i++) {
				
				vaso = (int)(Math.random()*3+1);
				
			if (vaso==jugador) {
				apuesta = apuesta*2;
				JOptionPane.showMessageDialog(null, "Ganaste se duplica tu apuesta" + apuesta);
				break;
				
			} else {
				JOptionPane.showMessageDialog(null, "Perdiste pero tenes otra oportunidad de elegir donde esta el vaso: ");
				jugador = Integer.parseInt(JOptionPane.showInputDialog("Donde cree que se encuentra el vaso: \n Opción 1 - Izquierda \n Opción 2 - Medio \nOpcion 3 - Derecha"));

			}
				}
				
			
			
		}
		
}

