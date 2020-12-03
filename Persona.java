package Clase6.ColegioP;

public class Persona {
//atributos
    private String nombre;
    private int dni;
    private int edad;

// constructores
    public Persona (){
        this.nombre="Desconocido";
        this.dni=1234;
        this.edad=0;
    }
    public Persona (String unNombre, int unDni){
        this.nombre=unNombre;
        this.dni=unDni;
    }
    public Persona (String unNombre, int unDni, int unaEdad){
        this.nombre=unNombre;
        this.dni=unDni;
        this.edad=unaEdad;
    }

//metodos
    public void setNombre (String unNombre){
        this.nombre=unNombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setDni (int unDni){
        this.dni=unDni;
    }
    public int getDni(){
        return this.dni;
    }

    public void setEdad (int unaEdad){
        this.edad=unaEdad;
    }
    public int getEdad (){
        return this.edad;
    }

    public String toString (){
        String mensaje = this.getNombre();

            if(this.edad>0){
                mensaje += "\ntiene " + this.getEdad() + " años, ";
            }
        mensaje += "\nsu dni es: " + this.getDni();

        return mensaje;
    }

}
