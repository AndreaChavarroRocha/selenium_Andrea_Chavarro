package Clase6.Empresa;

public class Manager extends Empleado{
//ATRIBUTOS
    private String area;
//CONSTRUCTOR
    public Manager(String unNombre, int unTelefono, int unSueldo, String unaArea){
        super(unNombre, unTelefono, unSueldo);
        this.area=unaArea;
    }
//METODOS
    public void setArea(String unArea){
        this.area=unArea;
    }
    public String getArea(){
        return this.area;
    }

    public String toString(){
        return super.toString()+"\ntiene el cargo de Manager, y su área es: "+this.getArea();
    }

}
