package reto2;

import javax.swing.JOptionPane;


public class Validaciones 
{
	
//Metodo para leer numeros enteros positivos
    public static int leerEntero(String mensaje) 
    {
        int num = 0;
        do {
            try {

                num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                if (num <= 0) {
                    JOptionPane.showMessageDialog(null, "ERROR, el número debe ser mayor que cero");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR - OJO la Excepcion es: " + e);
                num = 0;
                //(Reto2.punto4();
               
            }
        } while (num <= 0);
        return num;
    }//fin leer entero
 
}//fin clase validaciones
