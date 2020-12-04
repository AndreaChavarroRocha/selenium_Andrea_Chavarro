package Clase6.Empresa;

public class Tester extends Empleado  {
//ATRIBUTOS
    private boolean manual;
    private boolean automatizador;

//CONSTRUCTORES

    public Tester (String unNombre, int unTelefono, int unSueldo){
        super(unNombre,unTelefono,unSueldo);
        this.manual=true;
        this.automatizador=false;
    }

    public Tester (String unNombre, int unTelefono, int unSueldo, boolean manual, boolean automatizador){
        super(unNombre, unTelefono, unSueldo);
        this.automatizador=automatizador;
        if(this.automatizador==true){
            this.manual=true;
        }else{
            this.manual=manual;
        }

    }
//METODOS
    public void setManual(boolean esManual){
        if(this.automatizador==true){
            this.manual=true;
        }else{
            this.manual=esManual;
        }

    }
    public boolean getManual(){
        return this.manual;
    }

    public void setAutomatizador(boolean esAutomatizador){
        this.automatizador=esAutomatizador;
        if (this.automatizador==true){
            this.manual=true;
        }
    }
    public boolean getAutomatizador(){
        return this.automatizador;
    }

    public String toString (){
        String tipoTester= super.toString()+"\ntiene el cargo de tester, ";


        if(this.manual==true){
            tipoTester+="\nes un tester manual";
        }else{
            tipoTester="\nno es tester manual";
        }
        if(this.automatizador==true){
            tipoTester+=" y es tester automatizador";
        }else{
            tipoTester+=" y no es tester automatizador";
        }
        return tipoTester;
    }
}
