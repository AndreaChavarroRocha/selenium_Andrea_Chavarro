package Clase6.Empresa;

public class Empleado {
//ATRIBUTOS
    private String nombre;
    private int telefono;
    private int sueldo;

//CONSTRUCTORES

    public Empleado(){
        this.nombre="Desconocido";
        this.telefono=5555555;
        this.sueldo=0;
    }
    public Empleado (String unNombre, int unTelefono, int unSueldo){
        this.nombre=unNombre;
        this.telefono=unTelefono;
        this.sueldo=unSueldo;
    }

//MÉTODOS

    public void setNombre(String unNombre){
        this.nombre=unNombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int unTelefono){
        this.telefono=unTelefono;
    }
    public int getTelefono() {
        return this.telefono;
    }

    public void setSueldo(int unSueldo){
        this.sueldo=unSueldo;
    }
    public int getSueldo(){
        return this.sueldo;
    }

    public String toString(){
        return this.getNombre() +
                "\ncon nro de teléfono: "+ this.getTelefono() +
                "\ntiene un sueldo de: " +this.getSueldo();
    }
}
