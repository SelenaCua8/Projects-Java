package juegoTres;

import javax.swing.JOptionPane;

class JuegoTres {

    public static void main(String[] args) {
        int pato, puntaje = 0;

        for (int i = 1; i <= 3; i++) {
            pato = (int)(Math.random() * 6 + 1); // Genera un número del 1 al 6
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

            // Mostrar el resultado de este disparo
            JOptionPane.showMessageDialog(null,
                "Disparo #" + i +
                "\nSalió el pato número " + pato +
                "\n" + mensajePato +
                "\nPuntaje de este disparo: " + puntosDelPato);
        }

        // Resultado final
        if (puntaje >= 20) {
            JOptionPane.showMessageDialog(null, "🎉 ¡GANASTE! Puntaje total: " + puntaje);
        } else {
            JOptionPane.showMessageDialog(null, "😞 PERDISTE. Puntaje total: " + puntaje);
        }
    }
}

