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
            System.out.println("3. CSV File");
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
                case 3:
                    ArrayList<FakeAvatar> fakeAvatar = new ArrayList<FakeAvatar>();
                    String filePath = "/Users/Ganesh H A/Documents/Training/fake_data.csv";

                    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                        String line = br.readLine();
                        while (line != null) {
                            line = br.readLine();
                            if (line == null) {
                                break;
                            }

                            String[] arr = line.split(",");
                            if (arr.length < 6) {
                                continue;
                            }

                            String id = arr[0];
                            String firstName = arr[1];
                            String lastName = arr[2];
                            String dateOfBirth = arr[3];
                            String phoneNumber = arr[4];
                            String address = arr[5];

                            fakeAvatar.add(new FakeAvatar(id, firstName, lastName, dateOfBirth, phoneNumber, address));
                        }

                        // Print previous data
                        System.out.println("Previous Data:");
                        for (FakeAvatar avatar : fakeAvatar) {
                            System.out.println(avatar);
                        }
                        System.out.println();

                        Scanner scanner = new Scanner(System.in);
                        boolean running = true;

                        while (running) {
                            System.out.println("Choose an option:");
                            System.out.println("1. Add");
                            System.out.println("2. Edit");
                            System.out.println("3. Update");
                            System.out.println("4. Delete");
                            System.out.println("5. Exit");

                            int option = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character after reading the integer

                            switch (option) {
                                case 1:
                                    // Add a new FakeAvatar
                                    System.out.print("Enter ID: ");
                                    String id = scanner.nextLine();
                                    System.out.print("Enter First Name: ");
                                    String firstName = scanner.nextLine();
                                    System.out.print("Enter Last Name: ");
                                    String lastName = scanner.nextLine();
                                    System.out.print("Enter Date of Birth: ");
                                    String dateOfBirth = scanner.nextLine();
                                    System.out.print("Enter Phone Number: ");
                                    String phoneNumber = scanner.nextLine();
                                    System.out.print("Enter Address: ");
                                    String address = scanner.nextLine();

                                    fakeAvatar.add(new FakeAvatar(id, firstName, lastName, dateOfBirth, phoneNumber, address));
                                    System.out.println("FakeAvatar added successfully.");
                                    break;
                                case 2:
                                    // Edit FakeAvatar
                                    System.out.print("Enter ID of the FakeAvatar to edit: ");
                                    String editId = scanner.nextLine();

                                    for (FakeAvatar avatar : fakeAvatar) {
                                        if (avatar.getId().equals(editId)) {
                                            System.out.print("Enter new First Name: ");
                                            String newFirstName = scanner.nextLine();
                                            System.out.print("Enter new Last Name: ");
                                            String newLastName = scanner.nextLine();
                                            System.out.print("Enter new Date of Birth: ");
                                            String newDateOfBirth = scanner.nextLine();
                                            System.out.print("Enter new Phone Number: ");
                                            String newPhoneNumber = scanner.nextLine();
                                            System.out.print("Enter new Address: ");
                                            String newAddress = scanner.nextLine();

                                            avatar.setFirstname(newFirstName);
                                            avatar.setLastname(newLastName);
                                            avatar.setDateofBirth(newDateOfBirth);
                                            avatar.setPhonenumber(newPhoneNumber);
                                            avatar.setAddress(newAddress);

                                            System.out.println("FakeAvatar edited successfully.");
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    // Update FakeAvatar
                                    System.out.print("Enter ID of the FakeAvatar to update: ");
                                    String updateId = scanner.nextLine();

                                    for (FakeAvatar avatar : fakeAvatar) {
                                        if (avatar.getId().equals(updateId)) {
                                            System.out.print("Enter new ID: ");
                                            String newId = scanner.nextLine();
                                            System.out.print("Enter new First Name: ");
                                            String newFirstName = scanner.nextLine();
                                            System.out.print("Enter new Last Name: ");
                                            String newLastName = scanner.nextLine();
                                            System.out.print("Enter new Date of Birth: ");
                                            String newDateOfBirth = scanner.nextLine();
                                            System.out.print("Enter new Phone Number: ");
                                            String newPhoneNumber = scanner.nextLine();
                                            System.out.print("Enter new Address: ");
                                            String newAddress = scanner.nextLine();

                                            avatar.setId(newId);
                                            avatar.setFirstname(newFirstName);
                                            avatar.setLastname(newLastName);
                                            avatar.setDateofBirth(newDateOfBirth);
                                            avatar.setPhonenumber(newPhoneNumber);
                                            avatar.setAddress(newAddress);

                                            System.out.println("FakeAvatar updated successfully.");
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    // Delete FakeAvatar
                                    System.out.print("Enter ID of the FakeAvatar to delete: ");
                                    String deleteId = scanner.nextLine();

                                    for (FakeAvatar avatar : fakeAvatar) {
                                        if (avatar.getId().equals(deleteId)) {
                                            fakeAvatar.remove(avatar);
                                            System.out.println("FakeAvatar deleted successfully.");
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    // Exit the program
                                    running = false;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                                    break;
                            }

                            // Print the updated data after each operation
                            System.out.println("Updated Data:");
                            for (FakeAvatar avatar : fakeAvatar) {
                                System.out.println(avatar);
                            }
                            System.out.println();
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
            }
        }

            }
        }

