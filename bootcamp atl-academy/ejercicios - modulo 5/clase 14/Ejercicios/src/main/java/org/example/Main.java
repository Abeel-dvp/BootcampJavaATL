package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        jugarAlAmigoSecreto();


    }

    private static void jugarAlAmigoSecreto() {
        System.out.println("Cuantas personas van a jugar al Amigo secreto?");
        Scanner teclado = new Scanner(System.in);
        int cantidadPersonas = teclado.nextInt();

        String[] listaDeNombres = new String[cantidadPersonas];
        ingresarNombresDeJugadores(teclado, cantidadPersonas, listaDeNombres);

        String[] listaAgasajados = new String[cantidadPersonas];
        asignarAgasajadosAPersonas(cantidadPersonas, listaDeNombres, listaAgasajados);


        mostrarAgasajadosAJugadores(teclado, cantidadPersonas, listaDeNombres, listaAgasajados);
    }

    private static void mostrarAgasajadosAJugadores(Scanner teclado, int cantidadPersonas, String[] listaDeNombres, String[] listaAgasajados) {
        for (int i = 0; i < cantidadPersonas; i++) {
            String nombreDeLaPersona = listaDeNombres[i];
            System.out.println("Que " + nombreDeLaPersona + " se acerque a la computadora y escriba LISTO para continuar.");
            teclado.next();
            String nombreDelAgasajado = listaAgasajados[i];
            System.out.println("Le tienes que hacer un regalo  "+ nombreDelAgasajado  +" escriba LISTO para continuar.");
            teclado.next();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }

    private static void asignarAgasajadosAPersonas(int cantidadPersonas, String[] listaDeNombres, String[] listaAgasajados) {
        for (int i = 0; i < cantidadPersonas; i++){
            int indice = i + 1;
            if( indice>= cantidadPersonas){
                indice = 0;
            }
            listaAgasajados[i] = listaDeNombres[indice];
        }
    }

    private static void ingresarNombresDeJugadores(Scanner teclado, int cantidadPersonas, String[] listaDeNombres) {
        for (int i = 0; i < cantidadPersonas; i++){
            System.out.println("Ingrese el nombre de una persona: " );
            String nombreDeLaPersona = teclado.next();
            listaDeNombres[i] = nombreDeLaPersona;
        }
    }
}