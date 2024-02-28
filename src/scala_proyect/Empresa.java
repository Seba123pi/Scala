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
// Clase Empresa
public class Empresa {
    private Gerente gerente;

    public void contratar(Gerente gerente) {
        this.gerente = gerente;
        System.out.println("La empresa ha contratado a " + gerente.getNombre() + " como gerente.");
    }
}

