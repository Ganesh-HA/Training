package Day3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        SuperHero s = new SuperHero();
        System.out.println("Enter the SuperHero's Name: ");
        String name = scr.nextLine();
        //System.out.println("Enter the SuperHero's power: ");
        //String power = scr.nextLine();
        //System.out.println("Enter the SuperHero's SuperPower: ");
        //String superpower = scr.nextLine();
        s.setName(name);
        s.setPower("Intelligence,Strength");
        s.setSuperpower("IronMan Suit");
        System.out.println(s);


        Villain joker = new Villain();
        joker.speak();



        Cat garfield = new Cat();
        Dog snoopy = new Dog();
        garfield.makeSound();
        snoopy.makeSound();



    }
}
