package pl.asilver.country_project.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Country {
    private static Country instance = new Country();
    private String capital;
    private double area;
    private List<Region> regions;

    private Country() {
        this.capital = "Capital";
        this.regions = new ArrayList<>();
        for (int i = 0; i <= 4; ++i) {
            Region region = new Region();
            this.regions.add(region);
        }
    }

    public static Country getInstance() {
        if (instance == null) {
            instance = new Country();
        }
        return instance;
    }

    public String getCapital() {
        return capital;
    }

    public int getRegionsCount() {
        return regions.size();
    }

    public double getArea() {
        double area = 0;
        for (Region region : regions) {
            area += region.getArea();
        }
        return area;
    }

    public List<String> getRegionCenters() {
        List<String> regionCenters = new ArrayList<>();
        for (Region region : regions) {
            regionCenters.add(region.getRegionCenter());
        }
        return regionCenters;
    }

    public double getAverageCitizenAge() {
        int totalAge = 0;
        int totalCitizens = 0;
        for (Region region : regions){
            for (District district : region.getDistricts()){
                for (City city: district.getCities()){
                    for (Citizen citizen: city.getCitizens()){
                        totalAge += citizen.getAge();
                        totalCitizens++;
                    }
                }
            }
        }
        return (double) totalAge / totalCitizens;
    }

    public void printCitizensWithNLettersName (int n) {
        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                for (City city : district.getCities()) {
                    for (Citizen citizen : city.getCitizens()) {
                        if (citizen.getName().length() == n) {
                            System.out.println(citizen);
                        }
                    }
                }
            }
        }
    }

    public void printCitizensWithNameStartingWith (char letter){
        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                for (City city : district.getCities()) {
                    for (Citizen citizen : city.getCitizens()) {
                        if (citizen.getName().charAt(0) == letter) {
                            System.out.println(citizen);
                        }
                    }
                }
            }
        }
    }

    public void addCitizen(Citizen citizen){
        Random random = new Random();
        int regionIndex = random.nextInt(regions.size());
        Region region = regions.get(regionIndex);
        int districtIndex = random.nextInt(region.getDistricts().size());
        District district = region.getDistricts().get(districtIndex);
        int cityIndex = random.nextInt(district.getCities().size());
        City city = district.getCities().get(cityIndex);
        city.addCitizen(citizen);
    }
}
