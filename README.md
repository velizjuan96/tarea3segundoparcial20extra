# tarea3segundoparcial20extra

lo primero que hago en el for es declarar una variable int a que la inicializo
en cero lo cual me ara el recorrido de donde tengo la lista de las personas 
el pattern y el matcher que son librerias que nos ayudaran con expresiones regulares
la combinacion de esto nos ayuda a apliaciones bastante potente

La clase Pattern define el patron, el cual despues mediante Matcher crearemos el
objeto encargado de indicar si un elemento pertenece a nuestro lenguaje o no.
Pattern compile (String expreg)
Crea un patrón a partir de la expresión regular dada por expreg.

Una vez definido el patrón con Pattern, tenemos que crearnos un objeto que al 
recibir una cadena de caracteres analice si dicha cadena o las subcadenas que
la componen pertenecen al lenguaje dado.

lo unico que realizo despues en un if si encuentra los caracteres que le envie 
para que me realize el proceso correspodiente para despues imprimirlo 
El método find() devuelve el valor del primer elemento del array que cumple
la función de prueba proporcionada. En cualquier otro caso se devuelve 
undefined
lo unico que realizo despues es imprimir en consola 

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

