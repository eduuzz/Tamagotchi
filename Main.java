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
        
        if(t1.getWeight() <= 0 || t1.getWeight() >= 20 || t1.getAge() >= 20){
            System.out.println(t1);
        }else{
            while(t1.getAlive() == true){
                // drawing numbers 
                int number = (int)(Math.random() * 10); // 0 to 9
                if(number >= 0 && number <= 3){
                    t1.fellSleepy();
                }else if(number >= 4 && number <= 6){
                    t1.fellHungry();
                }else if(number >= 7 && number <= 9){
                    t1.getBored();
                }
            }
            
        }
        
        scanner.close();
    }
}
