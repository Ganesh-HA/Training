package Day3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scr = new Scanner(System.in);
            System.out.println("Select an option:");
            System.out.println("1. Class and Object");
            System.out.println("2. Inheritance and Method Overriding");
            System.out.println("3. Abstract Class and Interface");
            System.out.print("Enter 0 to Exit ");
            int choice = scr.nextInt();
            scr.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Exiting the Program..");
                    return;
                case 1:
                SuperHero IronMan = new SuperHero("IronMan", "Fire,Flight,Speed", "IronSuit");
                System.out.println("Name :" + IronMan.getName() + " Power :" + IronMan.getPower() + " SuperPower :" + IronMan.getSuperpower());
                break;
                case 2:
                Villain Joker = new Villain();
                Joker.speak();
                break;
                case 3:
                Cat garfield = new Cat();
                Dog snoopy = new Dog();
                garfield.makeSound();
                snoopy.makeSound();
                break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
