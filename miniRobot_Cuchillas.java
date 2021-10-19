public class miniRobot_Cuchillas extends Robot implements Cortando{

    public miniRobot_Cuchillas(){
        super();

    }

    public void preparacionIngredientes(){
        if(getAccion().equals(" ")) {
            System.out.println("-------El mini robot de cuchillas empieza a trabajar-------");
            System.out.println("La maquina prepara los ingredientes con los que trabajara");
            System.out.println("Corta las verduras y las carnes");
            System.out.println("Los ingredientes estan listos para cocinar");
            setAccion("1");
            BajaDeBateria();
            System.out.println("La bateria bajo");
        }
        else
            System.out.println("Este proceso ya se realizo, usar otra opcion (Cortado)");
    }


    @Override
    public void Cocinar() {

    }
}
