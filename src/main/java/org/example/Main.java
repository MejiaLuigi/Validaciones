package org.example;

import org.example.modelos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        //Usuario objetoUsuario=new Usuario();

        //System.out.print("Digite su nombre y apellidos: ");
        //objetoUsuario.setNombre(teclado.nextLine());

       // System.out.println("Su nombre es: " +objetoUsuario.getNombre());

        //Creando Un obj de la class Samurai, //todo obj ES UNA VARIABLE
        //Samurai objetoCinco=new Samurai(); //se supone solo los d4tos
        //System.out.println(objetoCinco);

        //Herramienta objetoSeis=new Herramienta();
        //System.out.println(objetoSeis);

        //Alimento objetoSiete=new Alimento();
        //System.out.println(objetoSiete);

        Oferta formatoFecha = new Oferta();
        System.out.println("Digite Fecha");
        formatoFecha.setFormatoFecha(teclado.nextLine());

        System.out.println("Digite Inicio");
        formatoFecha.setFormatoFecha(teclado.nextLine());

        System.out.println("la fecha es: " +formatoFecha.getFormatoFecha());


    }
}