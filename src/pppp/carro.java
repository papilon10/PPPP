/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pppp;

import java.awt.Color;

/**
 *
 * @author Apple
 */
public class carro {
    String nombre;
    String marca;
    Color color;
    
    public carro(){};

    public carro(String nombre, String marca, Color color) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
    }

    @Override
    public String toString() {
        return "carro{" + "nombre=" + nombre + ", marca=" + marca + ", color=" + color + '}';
    }
    
    
}
