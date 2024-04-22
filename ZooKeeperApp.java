package myZooKeeperChallenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to my Zoo\n\n");
        System.out.println("\n Number of animals is: " + Animals.numofAnimals);

        String name;
        String species;
        int age;
        String birthday;
        String sex;
        String color;
        int weight;


        ArrayList<Animals> animals = new ArrayList<>();

        String filePath = "C:/Mac/Home/Downloads/arrivingAnimals.txt";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split( " ");

                if (parts.length >= 1) {
                    String ageAndSpecies = parts[0];
                    System.out.println("ageAndSpecies: " + ageAndSpecies );

                    String[] theParts = ageAndSpecies.split( " ");
                    for (int i=0; i<5; i++) {
                        System.out.println("theParts[" + i + "] is " + theParts[i]);
                    }
                    age = Integer.parseInt(theParts[0]);
                    species = theParts[4];

                    Animals myAnimal = new Animals("name needed", species, age, birthday, sex, color, weight);

                    animals.add(myAnimal);
                }
                System.out.println("\n Number of animals is: " + Animals.numofAnimals);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }
        for (Animals animal : animals){
            System.out.println(animal);
            System.out.println("myZooKeeperChallenge.Animal name: " + animal.getName() + ", Age: " + animal.getAge() + " Species: " + animal.getSpecies());
        }
        System.out.println("\n Number of animals is: " + Animals.numofAnimals);
    }

