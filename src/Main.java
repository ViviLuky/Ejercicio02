import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        /*2. Crea una clase Java que utilice 5 hilos para contar el número de vocales que hay en un
        determinado texto. Cada hilo se encargará de contar una vocal diferente, actualizando todos
        los hilos la misma variable común que representa el número de vocales totales. Para evitar
        condiciones de carrera se deben utilizar semáforos.**/
        Semaphore semaphore = new Semaphore(5);

        HiloVocalesSemaforo h1=new HiloVocalesSemaforo("a",semaphore);
        HiloVocalesSemaforo h2=new HiloVocalesSemaforo("e",semaphore);
        HiloVocalesSemaforo h3=new HiloVocalesSemaforo("i",semaphore);
        HiloVocalesSemaforo h4=new HiloVocalesSemaforo("o",semaphore);
        HiloVocalesSemaforo h5=new HiloVocalesSemaforo("u",semaphore);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();

        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
            h5.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        System.out.println();
    }
}