package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    private static Persona[] lista = new Persona[]{
            new Persona("juan","veliz",21),
            new Persona("cristian","ramos",23),
            new Persona("josue","cordoba",15),
            new Persona("alaster","nehemias",15),};

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static void buscar() {
    }


    

    public static String buscarNombre(String busqueda) {
        String persona = "";

        for(int a = 0; a < lista.length; ++a) {
            Pattern valida = Pattern.compile(busqueda);
            Matcher comprobacion = valida.matcher(lista[a].nombre + " " + lista[a].apellido);
            if(comprobacion.find()) {
                persona = persona + lista[a].nombre + " " + lista[a].apellido + " " + lista[a].edad + "\n";


            }
        }

        return persona;
    }

}
