package TAMAGOCHI;
import java.util.Scanner;

public class Tamagochi{

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
    public void SetAge(int age){this.age = age;} 

    public int getWeight(){return this.weight;} // return the weight
    public void setWeight(int weight){this.weight = weight;}

    public int getAwake(){return this.awake;} // return is awake or not
    public void setAwake(int awake){this.awake = awake;}

    public boolean getAlive(){return this.alive;} // return if tamagochi is alive or not
    public void setAlive(boolean alive){this.alive = alive;}
    
    // WHISHES OF TAMAGOCHI
    // fell sleepy
    public void fellSleepy(){
    }

    // fell hungry
    public void fellHungry(){ // can eat a lot / eat a bit / dont eat
        if(alive == true){ // verify if alive
            while(getWeight() < 20){
                
            }
        }

    }

    // felget bored
    public void getBored(){
    } 



    // toString for the class
    @Override
    public String toString(){
        return "Your pet with the name: " + this.getName()+", stayed alive for " +this.getAge()+ " days and had weight of " +this.getWeight()+ "Kg.";
    }
}