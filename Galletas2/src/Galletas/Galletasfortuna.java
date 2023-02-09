package Galletas;

import java.util.ArrayList;

public class Galletasfortuna implements Frases{

    public Galletasfortuna() {

    }


    public Object frases() {
        ArrayList palabras = new ArrayList();
        palabras.add("Hoy sera un gran dia");
        palabras.add("Mañana ganaras la loteria");
        palabras.add("Messi campeon del mundo");
        palabras.add("Hoy te sucedera algo incleible");
        palabras.add("Tu crush te hablara");
        //System.out.println("Valor 1 "+ palabras.get(1));

        int a = (int) (Math.random() * 5);
        return palabras.get(a);

    }

}
