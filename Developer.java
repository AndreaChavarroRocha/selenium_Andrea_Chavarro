package Clase6.Empresa;

public class Developer extends Empleado{
//ATRIBUTOS
    private String lenguaje;
//CONTRUCTOR
    public Developer(String unNombre, int unTelefono, int unSueldo, String unLenguaje){
        super(unNombre,unTelefono,unSueldo);
        this.lenguaje=unLenguaje;
    }
//METODOS
    public void setLenguaje(String unLenguaje){
        this.lenguaje=unLenguaje;
    }
    public String getLenguaje(){
        return this.lenguaje;
    }

    public String toString (){
        return super.toString()+"\ntiene el cargo de Developer y su lenguaje de programación es: "+this.getLenguaje()+"\n";
    }

}
