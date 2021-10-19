import java.awt.desktop.SystemSleepEvent;

public class magnumOpus extends Robot implements Cocinando,Cortando {

    public magnumOpus(){
        super();
        System.out.println("Magnum Opus");
    }

    public void preparacionIngredientes(){
        if(getAccion().equals(" ")) {
            System.out.println("-------El mini robot de cuchillas empieza a trabajar-------");
            System.out.println("La maquina prepara los ingredientes con los que trabajara");
            System.out.println("Corta las verduras y las carnes");
            System.out.println("Todo esta preparado ");
            setAccion("1");
            BajaDeBateria();
            System.out.println("La bateria bajo");
        }
        else
            System.out.println("Este proceso ya se realizo, usar otra opcion (Cortado)");
    }

    public void Cocinar(){
        if(getAccion().equals("1")){
            System.out.println("-------El mini robot de manos caliente empieza a cocinar-------");
            System.out.println("Cocina los ingredientes cortados por el mini robot de cuchillas");
            setAccion("2");
            BajaDeBateria();
            System.out.println("La bateria bajo");
        }
        else
            System.out.println("Este proceso ya se realizo, usar otra opcion (Cocinado) o no se a realizado el anterior checar que se haya realizado");
    }

    public void Servir(){
        if(getAccion().equals("2")){
            System.out.println("-------El MagnumOpus empieza a servir-------");
            System.out.println("Se sirven los platillos terminados a los clientes");
            setAccion("3");
        }
        else
            System.out.println("Este proceso ya se realizo, usar otra opcion (Cocinado) o alguna las actividades anteriores no se han realizado");
    }

}
