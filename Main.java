import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        GetEnterPressed getEnterPressed = new GetEnterPressed();
        getEnterPressed.start();
        while(true){
            LocalTime localTime = LocalTime.now();
            System.out.println("Time: "+localTime);
            System.out.println("Press enter to exit");

            Thread.sleep(500);
            clearScreen();

            if(!getEnterPressed.isAlive()){
                break;
            }
        }
    }

    public static void clearScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}

class GetEnterPressed extends Thread{
    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
    }
}
