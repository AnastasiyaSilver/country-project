package pl.asilver.country_project.service;

import pl.asilver.country_project.subject.*;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Service {
    private final List<Region> regions;

    public Service(List<Region> regions) {
        this.regions = regions;
    }

    public static int readNumberFromConsole(String text) {
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static char readCharFromConsole(String text){
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public double getAverageCitizenAge() {
        int totalAge = 0;
        int totalCitizens = 0;
        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                for (City city : district.getCities()) {
                    for (Citizen citizen : city.getCitizens()) {
                        totalAge += citizen.getAge();
                        totalCitizens++;
                    }
                }
            }
        }
        return (double) totalAge / totalCitizens;
    }

    public String printCitizensWithNLettersName(int n) {
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
        return null;
    }

    public void printCitizensWithNameStartingWith(char letter) {
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

    public void addCitizen(Citizen citizen) {
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

}
