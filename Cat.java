package ООП.Seminar1;

import java.util.Arrays;

public class Cat extends Animal{

    public Cat(String name, Integer age, Boolean vaccination, String color,
     String species, Owner owner, Integer legsCount, Boolean fly, Boolean run, Boolean  swim) {
        super(name, age, vaccination, color, species, owner, legsCount, fly, run, swim);
    }
    
    public void FindFood(){
        System.out.println("Cat found food");
    }

    void FindFood(int...args){
        System.out.println("Cat found food, count = " + Arrays.toString(args));
    }

    private void WakeUp(){
        System.out.println("Cat woke up");
    }

    private void Sleep(){
        System.out.println("Cat sleeps");
    }

    private void Eat(){
        System.out.println("Cat ate");
    }

    public void Hunt(int...args){
        WakeUp();
        FindFood(args);
        Eat();
        Sleep();
    }

}
