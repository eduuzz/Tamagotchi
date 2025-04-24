package TAMAGOCHI;
import java.util.Scanner;

public class Tamagochi{
    Scanner scanner;
    // atributes
    private String name;
    private int age;
    private int weight;
    private int awake; 
    private boolean alive = true;
    private int stayedAwake;

    // empty constructors
    public Tamagochi(){}

    // full constructors
    public Tamagochi(String name, int age, int weight, int awake, boolean alive){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.awake = awake;
        this.alive = true;
        this.stayedAwake = 0;
    }

    // getters and setters
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
    public void fellSleepy(){ // needs implements the verification of age
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your pet " + getName() + " is sleepy. Age: " + getAge() + " days. Choose:");
        System.out.println("1. Sleep\n2. Stay awake");

        int choiceSleep = scanner.nextInt();

        if(this.alive == true){ // verify if pet is alive
            switch (choiceSleep) {
                case 1: // user chose to sleep
                    this.age++; // add 1 day in age
                    System.out.println("Your pet is days old: " + this.age);                
                    break;
            
                case 2: // user chose to stay awake (limit 5 times)
                    if (this.stayedAwake <= 5) {
                        this.stayedAwake++;
                        System.out.println("Your pet has already been awake " + this.stayedAwake + " times. The limit is 5 times.");;
                    }else{
                        System.out.println("Too tired to stay awake again.");
                    }        
                    break;

                default:
                    System.out.println("Please choose between the options 1 or 2.");
                    this.fellSleepy();
                    break;
            }
        }

        if (this.age >= 15) {
            this.alive = false;
            this.deadMessage();
        }
    }

    // fell hungry
    public void fellHungry(){ // can eat a lot / eat a bit / dont eat
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Your pet " +getName()+ " is hungry. Weight: " +getWeight()+ "Kg.");
        System.out.println("Choose: \n1. Eat a lot\n2. Eat a bit\n3. Don't eat");
        	
        int choiceHungry = scanner.nextInt();

        if(this.alive == true){
            switch (choiceHungry) {
                case 1: // eat a lot and sleep
                    this.weight = this.weight + 5;
                    System.out.println(this.getName() + " ate and went sleep. Current weight: " + this.getWeight() + "Kg.");
                    this.fellSleepy();
                    break;
            
                case 2: // eat a bit
                    this.weight++;
                    System.out.println(this.getName() + " ate a bit, current weight: " + this.getWeight() + "Kg.");
                    break;

                case 3: // don't eat
                    this.weight = this.weight - 2;
                    System.out.println(this.getName() + " didn't eat, current wheght: " + this.getWeight() + "Kg.");
                    break;
                
                default:
                    this.fellHungry();
                    break;
            }
        }

        if(this.weight >= 20){
            this.alive = false;
            System.out.println(this.getName() + " exploded of wheight.");
            this.deadMessage();
            
        }else if(this.weight <= 0){
            this.alive = false;
            System.out.println(this.getName() + " became malnourished and died");
            this.deadMessage();
        }
    }

    // felget bored
    public void getBored(){ // can run 10 minutes / can walk 10 minutes
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Your pet " +getName()+ " is bored. Weight: " +getWeight()+ "Kg.");
        System.out.println("Choose:\n1. Run 10 minutes (lose 4 of weight and eat a lot)\n2. Walk 10 minutes (lose 1 weight and gets hungry)");

        int choiceGym = scanner.nextInt();
        
        switch (choiceGym) {
            case 1: // choice run
                this.weight++; // get 1 of weight because lose 4 and eat 5
                if(this.weight >= 20){
                    this.alive = false;
                    System.out.println(this.getName() + " exploded of wheight.");
                    this.deadMessage();
                    break;
                }
                System.out.println(this.getName() + " ran and ate a lot. Current weight: " +getWeight()+ "Kg.");
                break;
            
            case 2: // choice walk
                this.weight = getWeight() - 1; // only lose 1 of weight
                if(this.weight <= 0){
                    this.alive = false;
                    System.out.println(this.getName() + " became malnourished and died");
                    this.deadMessage();
                    break;
                }
                System.out.println(this.getName()+ " walked and gets hungry.");
                fellHungry();
                break;

            default:
                System.out.println("Please choose between the options 1 or 2."); // if not typed 1 or 2, return to ask 
                this.getBored(); 
        }
    }

    public void deadMessage(){
        System.out.println("Oh no... " + this.getName() + " couldn't take it anymore and left for a better place...");
        System.out.println("May he rest in paece in Tamagotchi heaven.");
        System.out.println("Thank you for taking care of him until the end");
    }

    // toString for the class
    @Override
    public String toString(){
        return "Your pet with the name: " + this.getName()+", stayed alive for " +this.getAge()+ " days and had weight of " +this.getWeight()+ "Kg.";
    }
}