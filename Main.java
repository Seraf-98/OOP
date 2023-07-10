package ООП.Seminar1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Cat Barsik = new Cat("Барсик", 5, true, "Grey", "Кот", 
        new Owner("Дмитрий"), 4, false, true, true);
        System.out.println(Barsik);
        Barsik.toFly();
        Barsik.toRun();
        Barsik.toSwim();

        System.out.println();
        Goose Simka = new Goose("Симка", 2, false, "Белый", "Гусь", 
        new Owner("Дмитрий"), 2, true, true, true);
        System.out.println(Simka);
        Simka.toFly();
        Simka.toRun();
        Simka.toSwim();

        System.out.println();
        Fish Mishka = new Fish("Мишка", 10, false, "Серебристый", "Карп", 
        new Owner("Дмитрий"), 0, false, false, true);
        System.out.println(Mishka);
        Mishka.toFly();
        Mishka.toRun();
        Mishka.toSwim();

        System.out.println();
    }
}
