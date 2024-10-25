public class Consumer extends Thread {

    private Array lista;

    public Consumer(String name, Array lista) {
        super(name);
        this.lista = lista;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            System.out.println(Thread.currentThread().getName() + " : " + lista.getNumeroFromLista());
        }
    }

}
