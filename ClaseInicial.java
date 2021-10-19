import javax.tools.OptionChecker;
import java.util.Scanner;

public class ClaseInicial {
    public static void main (String []  arg){

        magnumOpus mag=new magnumOpus();
        miniRobot_Cuchillas cuchi =new miniRobot_Cuchillas();
        miniRobot_ManosC mano=new miniRobot_ManosC();


    int opcion;
        Scanner sc= new Scanner(System.in);
    do {
        System.out.println("-----------Menu----------");
        System.out.println("Opcion 1: Cortar ");
        System.out.println("Opcion 2: Cocinar ");
        System.out.println("Opcion 3: Servir ");
        System.out.println("Opcion 4: Estado del robot");
        System.out.println("Salir");

    opcion=sc.nextInt();
    switch (opcion){

        case 1:
            cuchi.preparacionIngredientes();
            mano.setAccion(cuchi.getAccion());
            break;

        case 2:
            mano.Cocinar();
            mag.setAccion(mano.getAccion());
            break;

        case 3:
            mag.Servir();
            break;

        case 4:
            mag.estadoRobot();
            mano.estadoRobot();
            cuchi.estadoRobot();
            break;

    }

    }while(opcion!=5);

    System.out.println("Todo esta terminado bon apettite");

    }
}
