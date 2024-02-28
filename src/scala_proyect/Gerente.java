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
// Clase Gerente que hereda de Empleado
public class Gerente extends Empleado {
    private Saco saco;

    public Gerente(String nombre, double altura, Saco saco) {
        super(nombre, altura);
        this.saco = saco;
    }

    public void entrevistar(Persona persona) {
        System.out.println(getNombre() + " está entrevistando a " + persona.getNombre() + ".");
    }

    public void vestirse() {
        System.out.println(getNombre() + " se está vistiendo.");
    }

   
}
