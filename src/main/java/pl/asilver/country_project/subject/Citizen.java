package pl.asilver.country_project.subject;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Citizen {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String surname;
    private int age;
    private Country country;

    public Citizen() {
        this.id = idCounter++;
        this.name = generateRandomName();
        this.surname = generateRandomName();
        this.age = generateRandomAge();
        this.country = Country.getInstance();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }

    private String generateRandomName() {
        Random random = new Random();
        int length = random.nextInt(6) + 5;
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < length; ++i) {
            char l = (char) (random.nextInt(26) + 'a');
            nameBuilder.append(l);
        }
        return nameBuilder.toString();
    }

    private int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(80) + 21;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Surname: " + surname + ", Age: " + age;
    }

}
