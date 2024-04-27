package main;

import clases.Empleado;
import clases.Factorial;
import clases.Galleta;
import clases.Persona;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*CLASE FACTORIAL
        Factorial factorial = new Factorial();

        long resultado1 = factorial.factorialRecursivo(10);
        System.out.println("Resultado factorialRecursivo: " + resultado1);

        long resultado2 = factorial.factorialIterativo(5);
        System.out.println("Resultado factorialIterativo: " + resultado2);*/

        /*CLASE BLOQUES ANONIMOS
        Galleta galleta1 = new Galleta();
        System.out.println("ID de Galleta: " + galleta1.getIdGalleta());

        System.out.println("");

        Galleta galleta2 = new Galleta();
        System.out.println("ID de Galleta2: " + galleta2.getIdGalleta());

        System.out.println("");

        Galleta galleta3 = new Galleta();
        System.out.println("ID de Galleta3: " + galleta3.getIdGalleta());*/

        /*CLASE COLECCIONES - HASH SET 1
        HashSet<String> paises = new HashSet<>();

        // agregamos elementos a la colección
        paises.add("España");
        paises.add("Italia");
        paises.add("Portugal");
        paises.add("Francia");
        paises.add("Alemania");
        paises.add("Belgica");

        // imprimir el hashset
        System.out.println("HashSet: " + paises);

        // buscamos si contiene un elemento específico
        System.out.println("Existe el pais Ecuador:  " + paises.contains("Ecuador"));
        System.out.println("Existe el pais España:  " + paises.contains("España"));

        // eliminar elemento del HashSet
        paises.remove("Italia");

        // imprimir el hashset
        System.out.println("HashSet: " + paises);

        // iteramos la colección
        for(String pais: paises) {
            System.out.println(" " + pais);
        }

        // vaciamos el Hashset
        paises.clear();

        System.out.println("HashSet: " + paises);*/

        /*CLASE COLECCIONES - HASH SET 2
        HashSet<Persona> personas = new HashSet<>();

        Persona persona1 = new Persona("Edwin", 37);
        Persona persona2 = new Persona("Fernando", 27);

        personas.add(persona1);
        personas.add(persona2);
        personas.add(new Persona("Karen", 31));
        personas.add(new Persona("Sofia", 25));

        for(Persona p : personas) {
            System.out.println(p);
        }

        personas.remove(persona2);
        System.out.println("");

        for(Persona p : personas) {
            System.out.println(p);
        }

        System.out.println("Existe Fernando: " + personas.contains(persona2));*/

        /*CLASE COLECCIONES - TREE SET 1
        TreeSet<String> paises = new TreeSet<>();

        paises.add("España");
        paises.add("Italia");
        paises.add("Portugal");
        paises.add("Francia");
        paises.add("Belgica");

        System.out.println(paises);

        System.out.println(paises.contains("Italia"));

        paises.remove("Portugal");

        System.out.println(paises);

        for(String pais : paises) {
            System.out.println(pais);
            System.out.println(paises.);
        }

        paises.clear();

        System.out.println(paises);*/

        /*CLASE COLECCIONES - TREE SET 2
        TreeSet<Empleado> empleados = new TreeSet<>();

        empleados.add(new Empleado("Vladimir", 35));
        empleados.add(new Empleado("Alex", 40));
        empleados.add(new Empleado("Juan", 25));
        empleados.add(new Empleado("Luis", 30));

        for(Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " " + empleado.getEdad());
        }

        System.out.println("");

        Iterator<Empleado> iterator1 = empleados.iterator();
        while (iterator1.hasNext()) {
            Empleado empleado = iterator1.next();
            System.out.println(empleado.getNombre() + " " + empleado.getEdad());
        }

        Empleado primerEmpleado = empleados.first();

        Empleado ultimoEmpleado = empleados.last();

        System.out.println("primerEmpleado: " + primerEmpleado);
        System.out.println("ultimoEmpleado: " + ultimoEmpleado);

        System.out.println("");
        System.out.println("Empleados menores de 30:");

        TreeSet<Empleado> empleadosMenoresDe30 = (TreeSet<Empleado>) empleados.headSet(new Empleado("", 30));
        for(Empleado e : empleadosMenoresDe30) {
            System.out.println(e.toString());
        }

        System.out.println("");
        System.out.println("Empleados mayores de 30:");

        TreeSet<Empleado> empleadosMayoresDe30 = (TreeSet<Empleado>) empleados.tailSet(new Empleado("", 30));
        for(Empleado e : empleadosMayoresDe30) {
            System.out.println(e.toString());
        }

        System.out.println("");

        Iterator<Empleado> iterator2 = empleados.iterator();

        System.out.println("Mostramos mayores de 30 v2:");
        TreeSet<Empleado> empleadosMayoresDe30v2 = new TreeSet<>();

        while (iterator2.hasNext()) {
            Empleado empleado = iterator2.next();
            if (empleado.getEdad() >= 30) {
                empleadosMayoresDe30v2.add(empleado);
            }
        }

        for(Empleado e : empleadosMayoresDe30v2) {
            System.out.println(e.toString());
        }*/

        /*CLASE COLLECTIONS - LinkedHashSet 1
        // mantiene el orden de inserción
        LinkedHashSet<String> coleccion = new LinkedHashSet<>();

        coleccion.add("Hola");
        coleccion.add("que");
        coleccion.add("tal?");

        System.out.println(coleccion);

        coleccion.add("Hola");

        System.out.println(coleccion);

        coleccion.remove("que");

        System.out.println(coleccion);*/

        /*CLASE COLLECTIONS - LinkedHashSet 1 - 2da parte

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su texto: ");

        String texto = scanner.nextLine();

        String[] palabras = texto.split(" ");

        Set<String> palabrasUnicas = new LinkedHashSet<>(Arrays.asList(palabras));

        System.out.println(palabrasUnicas);*/

        /*CLASE COLLECTIONS - ArrayList 1*/


    }
}
