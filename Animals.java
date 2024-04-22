package myZooKeeperChallenge;

public class Animals {

    private String animalName;
    private String species;
    private String sex;
    private String color;
    private int weight;
    private int age;
    private String animalBirthday;


    public static int numofAnimals = 0;


    public Animal(String name, String aSpecies, int anAge, String aSex, String aColor, int aWeight, String birthday) {
        System.out.println("\n A new myZookeeperChallenge.Animal object was created.\n");

        animalName = name;
        species = aSpecies;
        age = anAge;
        numofAnimals++;
        sex = aSex;
        color = aColor;
        weight = aWeight;
        animalBirthday = birthday;

    }
    public Animal() {
        System.out.println("\n A new myZoo.Animal object was created.\n");
        numofAnimals++;
    }
    public String getName() {
        return animalName;
    }
    public void setName(String name) {
        this.animalName = name;
    }
    public int getAge() {
        return age;
    }
    public String getSpecies() {
        return species;
    }
    public String getColor() {
        return color;
    }
    public String getSex() {
        return sex;
    }
    public int getWeight() {
        return weight;
    }
    public String getBirthday () {
        return animalBirthday;
    }
}
