/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scala_proyect;

import java.util.Scanner;

/**
 *
 * @author chevy
 */
public class SCala_Proyect {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del gerente:");
        String nombreGerente = scanner.nextLine();

        // Crear una instancia de Saco
        Saco saco = new Saco(3);

        // Crear una instancia de Gerente con el nombre ingresado y el saco creado
        Gerente gerente = new Gerente(nombreGerente, 1.80, saco);

        // Crear una instancia de Persona para la entrevista
        Persona persona = new Persona("Persona entrevistada");

        // Mostrar acciones del gerente
        gerente.vestirse();
        gerente.entrevistar(persona);

        // Ejemplo de agregar el gerente a una empresa
        Empresa empresa = new Empresa();
        empresa.contratar(gerente);

        scanner.close();
    }
    
}
