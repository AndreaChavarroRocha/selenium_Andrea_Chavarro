package Clase6.ColegioP;

import java.util.ArrayList;
import java.util.List;

import Clase7.Refactoring.ArrayListUtils;

public class Colegio {

    public static void main (String args []){
        List <Profesor> listaProfesores = new ArrayList<>();
        List <Alumno> listaAlumnos = new ArrayList<>();
        List <Persona> listaPersonas = new ArrayList<>();

        Profesor profe1 = new Profesor("Andrea", 31894774, 51, 300000000);
        System.out.println(profe1);
        listaProfesores.add(profe1);
       /* System.out.println(profe1.getDni());
        System.out.println(profe1.getNombre());
        System.out.println(profe1.getEdad()); //aqui el objeto es creado para la clase profesor pero por la herencia
                                              //me puedo traer los metodos que están en la clase padre Persona

        */
        //la herencia se utiliza para poder acceder a los metodos de las clases padres mas no a modificar
        //directamente los atributos, por que para eso cada clase tiene los metodos get y set que hacen eso
        // y los metodos se han creado como public, si se llegan a crear como private tampoco podria ver los metos
        //de las otras clases

        System.out.println("\n");
        Alumno alumno1 = new Alumno("Victoria", 1023554006, 2, "Jardin");
        Alumno alumno2 = new Alumno("Juan", 1034665007,6,"Primero");

        System.out.println(alumno1);
        System.out.println(alumno2);

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        //listaAlumnos.add(profe1); //esto es un error por que en la lista de clase alumnos no puedo poner profesor

        listaPersonas.add(profe1);
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2); //aqui si puedo por que personas es una clase padre y tanto alunmo cmo profesor estan heredando de persona
        // Esto es para mostrar la aplicabilidad de las listas y el uso de la herencia
        alumno1.getGrado();//con la herencia de este modo sin polimorfismo se puede llamar los metodos de la clase hija

        // POLIMORFISMO
        // Creacion de objetos de clases que heredan de otra clase
    //  Clasepadre nomObj new Clasehija
        Persona profe2 = new Profesor("Andrea", 31894774, 51, 3000000);
        Persona alumno3 = new Alumno("Victoria", 1023554006, 2, "Jardin");
        Persona alumno4 = new Alumno("Juan", 1034665007,6,"Primero");
        System.out.println(profe2);
        //listaProfesores.add(profe2); // aqui sale error por que aqui es es una persona de tipo profesor

        System.out.println(alumno3);
        System.out.println(alumno4);
        //listaAlumnos.add(alumno3); // aqui sale error por que aqui es una persona tipo alumno
        //listaAlumnos.add(alumno4); // aqui sale error por que aqui es una persona tipo alumno
                                    // pues cuando se creó el objeto se dijo que profe2 es una persona
                                    // solo con herencia sin polimorfismo el objeto queda profe 2 es un Profesor
        listaPersonas.add(profe2);
        listaPersonas.add(alumno3);
        listaPersonas.add(alumno4);
            // por eso  estos llamados si son correctos
            // con polimorfismo no puedo acceder a los metodos de a clase hija
        // Clase  var   lista
        for(Persona p:listaPersonas){
            System.out.println(p);
        }//otra forma de imprimir la ista de personas, cuando tenemos una clase dedicada a eso
        // como estáen otra clase de otro packager se importa
        ArrayListUtils.imprimirListaPersonas(listaPersonas);
    }

}


