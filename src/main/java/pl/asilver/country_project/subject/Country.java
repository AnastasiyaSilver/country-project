package pl.asilver.country_project.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Country {
    private static Country instance = new Country();
    private String capital;
    private double area;
    private List<Region> regions;

    private Country() {
        this.capital = "Capital";
        this.regions = new ArrayList<>();

        Region region1 = new Region("Region1", 10000, "Center1");
        Region region2 = new Region("Region2", 20000, "Center2");
        Region region3 = new Region("Region3", 15000, "Center3");

        this.regions.add(region1);
        this.regions.add(region2);
        this.regions.add(region3);

        District district1 = new District("District1");
        District district2 = new District("District2");
        region1.addDistricts(district1);
        region1.addDistricts(district2);

        District district3 = new District("District3");
        District district4 = new District("District4");
        region2.addDistricts(district3);
        region2.addDistricts(district4);

        District district5 = new District("District5");
        District district6 = new District("District6");
        region3.addDistricts(district5);
        region3.addDistricts(district6);

        City city1 = new City("City1");
        City city2 = new City("City2");
        City city3 = new City("City3");
        City city4 = new City("City4");
        City city5 = new City("City5");
        City city6 = new City("City6");
        district1.addCity(city1);
        district2.addCity(city2);
        district3.addCity(city3);
        district4.addCity(city4);
        district5.addCity(city5);
        district6.addCity(city6);
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

    public List<Region> getRegions(){
        return regions;
    }


    public List<String> getRegionalCenters() {
        List<String> regionCenters = new ArrayList<>();
        for (Region region : regions) {
            regionCenters.add(region.getRegionalCenter());
        }
        return regionCenters;
    }

//    public double getAverageCitizenAge() {
//        int totalAge = 0;
//        int totalCitizens = 0;
//        for (Region region : regions) {
//            for (District district : region.getDistricts()) {
//                for (City city : district.getCities()) {
//                    for (Citizen citizen : city.getCitizens()) {
//                        totalAge += citizen.getAge();
//                        totalCitizens++;
//                    }
//                }
//            }
//        }
//        return (double) totalAge / totalCitizens;
//    }
//
//    public String printCitizensWithNLettersName(int n) {
//        for (Region region : regions) {
//            for (District district : region.getDistricts()) {
//                for (City city : district.getCities()) {
//                    for (Citizen citizen : city.getCitizens()) {
//                        if (citizen.getName().length() == n) {
//                            System.out.println(citizen);
//                        }
//                    }
//                }
//            }
//        }
//        return null;
//    }
//
//    public void printCitizensWithNameStartingWith(char letter) {
//        for (Region region : regions) {
//            for (District district : region.getDistricts()) {
//                for (City city : district.getCities()) {
//                    for (Citizen citizen : city.getCitizens()) {
//                        if (citizen.getName().charAt(0) == letter) {
//                            System.out.println(citizen);
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    public void addCitizen(Citizen citizen) {
//        Random random = new Random();
//        int regionIndex = random.nextInt(regions.size());
//        Region region = regions.get(regionIndex);
//        int districtIndex = random.nextInt(region.getDistricts().size());
//        District district = region.getDistricts().get(districtIndex);
//        int cityIndex = random.nextInt(district.getCities().size());
//        City city = district.getCities().get(cityIndex);
//        city.addCitizen(citizen);
//    }
//}
}
