import TAMAGOCHI.Tamagochi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Tamagochi t1 = new Tamagochi();

        System.out.print("Name of your pet: "); // user given name
        t1.setName(scanner.nextLine()); 
        t1.setWeight(1); // predefined weight
        t1.setAge(0); // predefined age
        
        // drawing numbers 
        
        
        scanner.close();
    }
}
