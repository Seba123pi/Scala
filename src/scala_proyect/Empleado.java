/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scala_proyect;

/**
 *
 * @author chevy
 */
// Clase Empleado que hereda de Persona
public class Empleado extends Persona {
    private double altura;

    public Empleado(String nombre, double altura) {
        super(nombre);
        this.altura = altura;
    }

    public void trabajar() {
        System.out.println(getNombre() + " está trabajando.");
    }
}