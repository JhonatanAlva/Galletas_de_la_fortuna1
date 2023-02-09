package Galletas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBoton extends JFrame {
    private JPanel Ventana;
    private JButton Boton1;

    public VentanaBoton(){
        add(Ventana);

        setSize(450, 350);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Galleta de la Fortuna");

        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Galletasfortuna galleta = new Galletasfortuna();
                String frases = galleta.frases().toString();
                JOptionPane.showMessageDialog(Ventana, frases);
            }
        });
    }
}
