import TAMAGOCHI.Tamagochi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Tamagochi t1 = new Tamagochi();

        System.out.println("Name of your pet: ");
        t1.setName(scanner.nextLine());
        t1.setWeight(1);
        t1.setAge(0);
        
        // System.out.println("Name: " + t1.getName() + ", weight: " + t1.getWeight() + ", age: " + t1.getAge());
        
        t1.fellSleepy();

        scanner.close();


    }
}
