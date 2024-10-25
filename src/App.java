public class App {
    public static void main(String[] args) throws Exception {
        App main = new App();
        main.inicializarProductorConsumidor();
    }

    public void inicializarProductorConsumidor(){
        Array lista = new Array();
        Producer producer = new Producer("Producer", lista);
        producer.start();
        Consumer consumer = new Consumer("Consumer", lista);
        consumer.start();
    }
}
