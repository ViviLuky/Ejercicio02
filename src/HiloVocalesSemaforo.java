import java.util.concurrent.Semaphore;

public class HiloVocalesSemaforo  extends  Thread{
    private Semaphore semaphore;



    public static String texto;

    public HiloVocalesSemaforo(String name, Semaphore semaphore) {
        super(name);
        this.semaphore = semaphore;

    }

    @Override
    public void run() {
        super.run();
         char[] vocal = new char[5];




    }
}
