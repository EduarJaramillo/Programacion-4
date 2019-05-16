/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

import co.edu.utp.isc.pro4.ajedrez.controlador.Ajedrez;

/**
 *
 * @author utp
 */
public class Jugador {

    private Ajedrez ajedrez;
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void jugar() {
        // TODO: Mover ficha de forma inteligente
    }

    public void setAjedrez(Ajedrez ajedrez) {
        this.ajedrez = ajedrez;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void rendirse() {
        // No me gusta pero los estudiantes lo pidieron
        ajedrez.rendirse();
    }

}
