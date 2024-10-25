public class Array {

    private final int CAPACIDAD = 10;
    private int lista[] = new int[CAPACIDAD];
    private int contadorCapacidad = 0;
    private int temporal = 0;
    private boolean lleno = false;

    public synchronized int getNumeroFromLista() {
        while (!lleno) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        temporal = lista[contadorCapacidad -1];
        contadorCapacidad--;
        if(contadorCapacidad == 0){
            lleno = false;
            notify();
        }
        return temporal;
    }
    public synchronized void setNumeroToLista(int numero) {
        while (lleno) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lista[contadorCapacidad] = numero;
        contadorCapacidad++;

        if(contadorCapacidad == CAPACIDAD){
            lleno = true;
            notify();
        }
    }
}
