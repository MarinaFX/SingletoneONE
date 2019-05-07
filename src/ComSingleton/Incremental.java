package ComSingleton;

public class Incremental {
    private static Incremental instancia;
    private static int countInstancias = 0;
    private int numero;

    private Incremental() {}

    public static Incremental getInstancia() {
        if (instancia == null){
            countInstancias++;
            instancia = new Incremental();
            return instancia;
        }
        else{
            return instancia;
        }
    }

    public String toString() {
        numero = countInstancias;
        return "Incremental " + numero;
    }
}