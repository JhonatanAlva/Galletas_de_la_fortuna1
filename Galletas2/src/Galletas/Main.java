package Galletas;

import Galletas.Galletasfortuna;
import Galletas.VentanaBoton;

import javax.swing.*;
import java.util.Scanner;

public class Main extends Galletasfortuna{
    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaBoton funcion = new VentanaBoton();
                funcion.setVisible(true);
            }
        });
    }
}
