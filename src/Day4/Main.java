package Day4;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Select an option:");
            System.out.println("1. Polymorphism and interface");
            System.out.println("2.Access Modifiers and Encapsulation");
            System.out.print("Enter 0 to Exit ");
            int choice = Sc.nextInt();
            Sc.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Exiting the Program..");
                    return;
                case 1:
                    Actor[] actor = new Actor[2];
                    TomHanks tomHanks = new TomHanks();
                    LeonardoDiCaprio leonardoDiCaprio = new LeonardoDiCaprio();
                    actor[0] = tomHanks;
                    actor[1] = leonardoDiCaprio;
                    for (Actor a : actor) {
                        a.act();
                    }
                    break;
                case 2:
                    Moviestar moviestar = new Moviestar();
                    Scanner scr = new Scanner(System.in);
                    System.out.println("Enter the Name of the MovieStar: ");
                    String name = scr.nextLine();
                    System.out.println("Enter the Age of the MovieStar: ");
                    int age = scr.nextInt();
                    System.out.println("Enter the Income of the MovieStar: ");
                    double income = scr.nextDouble();
                    moviestar.setName(name);
                    moviestar.setAge(age);
                    moviestar.setIncome(income);
                    System.out.println("Name: " + moviestar.getName());
                    System.out.println("Age: " + moviestar.getAge());
                    System.out.println("Income: " + moviestar.getIncome());
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

            }
        }

