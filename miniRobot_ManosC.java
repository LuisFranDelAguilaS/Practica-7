

public class miniRobot_ManosC extends Robot implements Cocinando {

    public miniRobot_ManosC(){
        super();
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


    @Override
    public void preparacionIngredientes() {

    }
}
