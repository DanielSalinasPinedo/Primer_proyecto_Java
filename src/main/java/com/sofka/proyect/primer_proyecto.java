package com.sofka.proyect;

import java.util.Scanner;

public class primer_proyecto {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario: ");
        String nombre_usuario = captura.nextLine();

        System.out.println("Ingrese el numero de celular: ");
        String celular = captura.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = captura.nextInt();

        System.out.println("Bienvenido señor "+nombre_usuario+", es un placer para nosotros contar con una " +
                            "persona de "+edad+" años.\n" +"Próximamente nos comunicaremos con usted al numero " +
                            celular+".\n" +"Feliz día");
    }
}
