package Clase6.ColegioP;

public class Alumno extends Persona {
    //nombre
    //dni
    //edad
//ATRIBUTOS
    private String grado;
//CONTRUCTORES
    public Alumno (String unNombre, int unDni, int unaEdad){
        super(unNombre, unDni, unaEdad);
        this.grado="Primero";

    }
    public Alumno (String unNombre, int unDni, int unaEdad, String unGrado){
        super(unNombre, unDni, unaEdad);
        this.grado=unGrado;
    }
//METODOS

    public void setGrado(String unGrado){
        this.grado=unGrado;
    }
    public String getGrado(){
        return this.grado;
    }

    public String toString (){
        return super.toString() + "\ny el grado de este alumno es: "+ this.getGrado();
    }

}
