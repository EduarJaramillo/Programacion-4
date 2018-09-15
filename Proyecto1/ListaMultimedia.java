/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author eduar
 */
public class ListaMultimedia {
  

    private Multimedia[] medialist;
    private int cont;

    public ListaMultimedia(int capacidad) {
        medialist = new Multimedia[capacidad];
        cont = 0;
    }

    public int size() {
        return cont;
    }

    private boolean llena() {
        return cont == medialist.length;
    }

    public boolean add(Multimedia m) {
        if (llena()) {
            return false;
        } else {
            medialist[cont] = m;
            cont++;
            return true;
        }
    }

    public Multimedia get(int posicion) {
        if (posicion == cont) {
            throw new IndexOutOfBoundsException();
        }
        return medialist[posicion];
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < cont; i++) {
            s += medialist[i].toString() + "\n";
        }
        return s;
    }
}

