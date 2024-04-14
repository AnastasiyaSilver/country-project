package pl.asilver.country_project.subject;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Citizen> citizens;

    public City(String name) {
        this.name = name;
        this.citizens = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void addCitizen(Citizen citizen) {
        citizens.add(citizen);
    }

    @Override
    public String toString() {
        return "City" + "name:" + name + ", citizens: " + citizens;
    }
}
