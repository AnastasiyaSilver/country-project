package pl.asilver.country_project._main;

import pl.asilver.country_project.subject.Citizen;
import pl.asilver.country_project.subject.Country;

public class _Main {
    public static void main(String[] args) {
        Country country = Country.getInstance();

        for (int i = 0; i < 1000; ++i){
            Citizen citizen = new Citizen();
            country.addCitizen(citizen);
        }
        country.printCitizensWithNameStartingWith('n');
    }
}
