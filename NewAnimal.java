package ООП.Seminar1;

public class NewAnimal extends Animal {
    private Integer eyesCount;
    public NewAnimal(String name, Integer age, Boolean vaccination, String color,
     String species, Owner owner, Integer legsCount, Boolean fly, Boolean run, Boolean  swim) {
        super(name, age, vaccination, color, species, owner, legsCount, fly, run, swim);
        this.eyesCount = 2;
    }

    public NewAnimal(){
        this(null, null, null, null, null, null, null, null, null, null);
    }

    @Override
    public Integer GetAge() {
        // TODO Auto-generated method stub
        return super.GetAge();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "I'm NewAnimal";
    }

    public Integer getEyesCount() {
        return eyesCount;
    }
    
}
