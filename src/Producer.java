import java.util.Random;

public class Producer extends Thread {

    private Array lista;
    private Random random = new Random();

    public Producer(String name, Array lista) {
        super(name);
        this.lista = lista;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            int numero = random.nextInt(1,10);
            System.out.println(Thread.currentThread().getName() + " : " + numero);
            lista.setNumeroToLista(numero);
            
        } 
    }
}
