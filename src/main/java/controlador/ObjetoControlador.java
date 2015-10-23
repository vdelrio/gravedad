package controlador;

import modelo.Espacio;
import modelo.Objeto;
import modelo.Vector;
import vista.EspacioPanel;

import javax.swing.*;

/**
 * Created by vdelrio on 10/20/15.
 */
public class ObjetoControlador {

    private static final int PERIODO = 5;


    public EspacioPanel inicializarElEspacio(int alto) {

        Espacio espacio = new Espacio();
        espacio.agregarObjeto(new Objeto(5.976e+12, new Vector(7, 5), Vector.NULO));
        espacio.agregarObjeto(new Objeto(5.976e+11, new Vector(6, 10), new Vector(-4, 0)));

        Timer timer = new Timer(PERIODO, espacio);
        timer.start();

        return new EspacioPanel(espacio, alto);
    }

}
