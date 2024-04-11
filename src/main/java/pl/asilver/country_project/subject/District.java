package pl.asilver.country_project.subject;

import java.util.ArrayList;
import java.util.List;

public class District {
    private List<City> cities;
    public District(){
        this.cities = new ArrayList<>();
        for (int i = 0; i < 2; ++i){
            City city = new City();
            this.cities.add(city);
        }
    }

    public List<City> getCities(){
        return cities;
    }

}
