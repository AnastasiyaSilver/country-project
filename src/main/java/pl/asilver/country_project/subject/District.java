package pl.asilver.country_project.subject;

import java.util.ArrayList;
import java.util.List;

public class District {
    private String name;
    private List<City> cities;

    public District(String name) {
        this.name = name;
        this.cities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void addCity(City city) {
        cities.add(city);
    }

    @Override
    public String toString() {
        return "District name:" + name + ", cities:" + cities;
    }
}
