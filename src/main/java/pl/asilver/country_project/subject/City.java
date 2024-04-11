package pl.asilver.country_project.subject;

import java.util.ArrayList;
import java.util.List;

public class City {
    private List<Citizen> citizens;

    public City(){
        this.citizens = new ArrayList<>();
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void addCitizen(Citizen citizen){
        citizens.add(citizen);
    }
}
