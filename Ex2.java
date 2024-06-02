public class Ex2 {
    public static class threadTest implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running gay");
        }
        // b
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new threadTest());
        Thread thread2 = new Thread(new threadTest());
        thread.start();
        //this is sam
    }
}
