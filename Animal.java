package ООП.Seminar1;

public class Animal {
    private String name;
    private Integer age;
    private Boolean vaccination;
    private String color;
    private String species;
    private Owner owner;
    private Integer legsCount;
    private Boolean fly;
    private Boolean run;
    private Boolean swim;
    
    public Animal (String name, Integer age, Boolean vaccination, String color,
     String species, Owner owner, Integer legsCount, Boolean fly, Boolean run, Boolean  swim) {
        this.name = name;
        this.age = age;
        this.vaccination = vaccination;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
        this.fly = fly;
        this.run = run;
        this.swim = swim;
    }

    public Animal (String color, String species, Integer legsCount) {
        this(null, null, null, color, species, null, legsCount, null, null, null);
    }

    public Integer GetAge(){
        return age;
    }

    public void SetAge(Integer age){
        this.age = age;
    }

    public void toRun() {
        if (this.run) {
            System.out.println(this.species + " " + this.name + " может бегать");
        } else{
            System.out.println(this.species + " " + this.name + " не может бегать");
        }
    }

    public void toSwim() {
        if (this.swim) {
            System.out.println(this.species + " " + this.name + " может плавать");
        } else{
            System.out.println(this.species + " " + this.name + " не может плавать");
        }
    }

    public void toFly() {
        if (this.fly) {
            System.out.println(this.species + " " + this.name + " может летать");
        } else{
            System.out.println(this.species + " " + this.name + " не может летать");
        }
    }
    
    @Override
    public String toString() {
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }
}