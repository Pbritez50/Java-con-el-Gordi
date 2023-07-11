package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Prueba {


    //vector: connjunto de datos de un tipo especifico ejemplo texto

    //Arrays: conjunto de objetos;

    //variables: objeto de un tipo de dato que pueden ser modificadas;/

    //constantes: objeto de un tipo de dato que no puede ser modificable
    public static void main(String[] args) throws ParseException {
        String[] pame = {"Pame ", "y "," Pablo"," amor"," por siempre"};

        List<Persona> personas = new ArrayList<>();


        System.out.println(pame.length);
        String texto = "hola amor";
        System.out.println(texto);
        texto = pame[0] + pame[1] + pame[2] + pame[3] + pame[4];
        System.out.println(texto);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Persona persona = new Persona("pablo", "Rapp", 38,sdf.parse("05/07/1984"));
        Persona pamela = new Persona("Pamela", "Britez", 25,sdf.parse("04/01/1998"));
        System.out.println(persona.getApellido());

        personas.add(persona);
        personas.add(pamela);



        System.out.println(personas);


        int numero = 0;
        long numeroGrande = 3;
        double numeroDecimal = 1.5;
        float numeroEnorme = 1;

        int[] pablo = {1,2,3,4,5};

    }



}
