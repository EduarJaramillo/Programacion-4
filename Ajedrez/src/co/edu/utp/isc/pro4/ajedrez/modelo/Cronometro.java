/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

import java.time.LocalTime;

/**
 *
 * @author utp
 */
public class Cronometro {
    private LocalTime[] tiempo;
    private int turno;

    public Cronometro() {
        tiempo = new LocalTime[2];
        turno = 0;
    }
    
    public void iniciar(){
        //TODO: Iniciar el cronometro para el jugador actual
    }
    
    public void cambio(){
        //TODO: Parar el cronometro para el jugador actual
        turno = (turno == 0 ? 1 : 0);
        //TODO: Iniciar el cronometro para el jugador actual
    }
    
    public void parar() {
        //TODO: Parar el cronometro 
        
    }
    
}
