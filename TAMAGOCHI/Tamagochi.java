package TAMAGOCHI;
import java.util.Scanner;

public class Tamagochi{

    Scanner scanner;
    // atributes
    private String name;
    private int age;
    private int weight;
    private int awake; 
    private boolean alive;

    // empty constructors
    public Tamagochi(){}

    // full constructors
    public Tamagochi(String name, int age, int weight, int awake, boolean alive){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.awake = awake;
        this.alive = alive;
    }

    // getters
    public String getName(){return this.name;} // return the name
    public void setName(String name){this.name = name;} // set the new name

    public int getAge(){return this.age;} // return the age
    public void setAge(int age){this.age = age;} 

    public int getWeight(){return this.weight;} // return the weight
    public void setWeight(int weight){this.weight = weight;}

    public int getAwake(){return this.awake;} // return is awake or not
    public void setAwake(int awake){this.awake = awake;}

    public boolean getAlive(){return this.alive;} // return if tamagochi is alive or not
    public void setAlive(boolean alive){this.alive = alive;}
    
    // WHISHES OF TAMAGOCHI
    // fell sleepy
    public void fellSleepy(){
        
        Scanner scanner = new Scanner(System.in);
        
        int stayedAwake = 0; // times of stayed awake

        System.out.println("Your pet " + getName() + " is sleepy. Age: " + getAge() + " days. Choose:");
        System.out.println("1. Sleep\n2. Stay awake");

        int choiceSleep = scanner.nextInt();

        while(this.alive == true){
            switch (choiceSleep) {
                case 1: // user chose to sleep
                    this.age = this.getAge() + 1; // add 1 day in age
                    System.out.println("Your pet is days old: " + getAge());                
                    break;
            
                case 2: // user chose to stay awake (limit 5 times)
                    if (stayedAwake < 5) {
                        stayedAwake += 1;
                        System.out.println("Your pet has already been awake " + stayedAwake + " times. The limit is 5 times.");;
                    }
                    break;
    
                default:
                    System.out.println("Please choose the number 1 or 2.");
                    break;
            }

            if(this.age > 15){
                this.alive = false;
                System.out.println("Your pet is dead!");
            }
        }
        

         scanner.close();    
    }

    // fell hungry
    public void fellHungry(){ // can eat a lot / eat a bit / dont eat
        
        if(alive == true){ // verify if alive
            while(getWeight() < 20){
                
            }
        }

    }

    // felget bored
    public void getBored(){ // can run 10 minutes / can walk 10 minutes
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Your pet " +getName()+ " is bored. Weight: " +getWeight()+ "Kg.");
        System.out.println("Choose:\n1. Run 10 minutes (lose 4 of weight and eat a lot)\n2. Walk 10 minutes (lose 1 weight and gets hungry");

        int choiceGym = scanner.nextInt();
        
        switch (choiceGym) {
            case 1: // choice run
                this.weight = this.getWeight() + 1; // get 1 of weight because lose 4 and eat 5
                System.out.println(this.getName() + " ran and ate a lot. Current weight: " +getWeight()+ "Kg.");
                break;
            
            case 2: // choice walk
                this.weight = getWeight() - 1; // only lose 1 of weight
                System.out.println(this.getName()+ " walked and gets hungry.");
                fellHungry();
                break;

            default:
                System.out.println("Please choose between the options 1 or 2."); // if not typed 1 or 2, return to ask 
                // verify how to return to ask 

            scanner.close();
        }
            
    } 



    // toString for the class
    @Override
    public String toString(){
        return "Your pet with the name: " + this.getName()+", stayed alive for " +this.getAge()+ " days and had weight of " +this.getWeight()+ "Kg.";
    }
}