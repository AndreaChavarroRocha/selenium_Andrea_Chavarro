package Clase6.ColegioP;

public class Profesor extends Persona {
    //la herencia se define con la palabra clave extends
    //nombre => atributo definido en una clase padre: Persona
    //dni => atributo definido en una clase padre: Persona
    //edad => atributo definido en una clase padre: Persona
    //Salario => este por ser un atributo netamente del profesos es definido en esta clase
//ATRIBUTOS
    private int salario;
//CONSTRUCTORES
    public Profesor(String unNombre, int unDni, int unaEdad){ //aqui le ingreso los parametros que recibe el cons de la clase padre
        super(unNombre, unDni, unaEdad); //con esto estoy llamando al constructor de la clase padre que es persona
        this.salario=20000;
    }
    public Profesor(String unNombre, int unDni, int unaEdad ,int unSalario){
        super(unNombre, unDni, unaEdad);
        this.salario=unSalario;
    }
//METODOS
    public void setSalario(int unSalario){
        this.salario=unSalario;
    }
    public int getSalario(){
        return this.salario;
    }

    public String toString(){
        return "El profesor " +super.toString() + "\ny su salario es: " + this.salario;
        //aqui en el tostring se adiciono el super, para traer el tostring de la clase padre persona
    }

}