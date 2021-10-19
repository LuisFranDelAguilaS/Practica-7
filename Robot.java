public abstract class Robot implements Cortando,Cocinando {

    public String nombre;
    public int nBateria;
    public int id;
    public String AccionRealizada=" ";

    public Robot(){
        System.out.println("--Datos--");
        setNombre(CapturaEntrada.capturarCadena("Dame el nombre del robot"));
        setId(CapturaEntrada.capturarEntero("Numero de identificacion del robot"));
        setNBateria(CapturaEntrada.capturarEntero("Cual es el nivel de bateria?"));

    }

    public void setNBateria(int nivel){
        nBateria = nivel;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setAccion(String AccionRealizada){
        this.AccionRealizada = AccionRealizada;
    }

    public int getNBateria(){
        return nBateria;
    }
    public String getNombre(){
        return nombre;
    }
    public int getId(){
        return id;
    }
    public String getAccion(){
        return AccionRealizada;
    }

    //Metodos

    public void BajaDeBateria(){
        setNBateria(getNBateria()-5);
    }

    public void estadoRobot(){
        System.out.println(" ");
        System.out.println("---------------------Estado del robot-----------------");
        System.out.println(" ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Identificacion: "+ getId());
        System.out.println("Bateria: " + getNBateria());
        System.out.println("Ultima accion realizada: " + getAccion());

    }

}
