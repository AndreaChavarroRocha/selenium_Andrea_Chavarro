package Clase6.Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaSoftware {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        //ingreso del tester
        System.out.println("Va a ingresar información para crear un tester");
        String nombreTester=pedirNombreEmpleado();
        int telefonoTester=pedirNroTelefono();
        int sueldoTester=pedirSueldoEmpleado();
        boolean tipTesterM=tipoTesterManual();
        boolean tipTesterA=tipoTesterAutomatizador();
        Tester test1 = new Tester(nombreTester,telefonoTester,sueldoTester,tipTesterM,tipTesterA);

        //ingreso de los dos developers

        System.out.println("\nva ingresar información para crear dos Developers");
        List <Developer> listaDevelopers = new ArrayList<>();
        Developer dev1 = new Developer(pedirNombreEmpleado(),pedirNroTelefono(),pedirSueldoEmpleado(),pedirLenguajeDEv());
        Developer dev2 = new Developer(pedirNombreEmpleado(),pedirNroTelefono(),pedirSueldoEmpleado(),pedirLenguajeDEv());
        listaDevelopers.add(dev1);
        listaDevelopers.add(dev2);


        //ingreso del o la manager
        System.out.println("\nVa a ingresar información de un manager");
        String nombreManager=pedirNombreEmpleado();
        int telefonoManager=pedirNroTelefono();
        int sueldoManajer=pedirSueldoEmpleado();
        System.out.println("Ingrese el área del manager");
        String area=input.next();
        Manager man1 = new Manager(nombreManager,telefonoManager,sueldoManajer,area);

        System.out.println("Los datos de los empleados de la empresa son: "+
                "\n"+test1+
                "\n"+listaDevelopers+
                "\n"+man1);
    }

    //metodos para la clase main
    private static String pedirNombreEmpleado(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Empleado: ");
        String nombreEmpleado=input.next();
        return nombreEmpleado;
    }
    private static int pedirNroTelefono(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número de teléfono del Empleado: ");
        int telefonoEmpleado=input.nextInt();
        return telefonoEmpleado;
    }
    private static int pedirSueldoEmpleado(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el sueldo del Empleado: ");
        int sueldoEmpleado=input.nextInt();
        return sueldoEmpleado;
    }
    private static String pedirLenguajeDEv(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el lenguaje de programación");
        String lenguaje=input.next();
        return lenguaje;
    }
    private static boolean tipoTesterManual() {
        Scanner input = new Scanner(System.in);
        boolean testerM = false;
        char tipoTester='n';

        System.out.println("el tester es manual? " +
                "\nIngrese S para SI o N para NO");
                tipoTester=input.next().charAt(0);
            while (tipoTester != 'S' && tipoTester != 's' && tipoTester != 'N' && tipoTester != 'n' ) {
                System.out.println("Opción inválida, ingrese de nuevo");
                tipoTester=input.next().charAt(0);
        }
        if (tipoTester=='S' || tipoTester=='s') {
            testerM = true;
        } else {
            testerM = false;

        }
        return testerM;
    }

    private static boolean tipoTesterAutomatizador(){
        Scanner input = new Scanner(System.in);
        boolean testerA=false;
        char tipoTester='n';

        System.out.println("el tester es Automatizador? " +
                "\n S ó N" );
                tipoTester=input.next().charAt(0);
        while (tipoTester != 'S' && tipoTester != 's' && tipoTester != 'N' && tipoTester != 'n' ){
                System.out.println("Opción inválida, ingrese de nuevo");
                tipoTester=input.next().charAt(0);
        }
        if(tipoTester=='S' || tipoTester=='s'){
            testerA=true;
        }else {
            testerA=false;
        }
        return testerA;
    }
}