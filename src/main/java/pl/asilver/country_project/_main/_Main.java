package pl.asilver.country_project._main;

import pl.asilver.country_project.subject.Citizen;
import pl.asilver.country_project.subject.Country;

import static pl.asilver.country_project.service.Service.readCharFromConsole;
import static pl.asilver.country_project.service.Service.readNumberFromConsole;

public class _Main {
    public static void main(String[] args) {
        Country country = Country.getInstance();

        for (int i = 0; i < 1000; ++i) {
            Citizen citizen = new Citizen();
            country.addCitizen(citizen);
        }

        while (true) {
            System.out.println("\nAction selection menu:");
            System.out.println("1. Print capital");
            System.out.println("2. Print number of regions");
            System.out.println("3. Print area of country");
            System.out.println("4. Print regional centers");
            System.out.println("5. Print average age of citizens");
            System.out.println("6. Print citizens with _ letters in name");
            System.out.println("7. Print citizens with name staring on letter _");
            System.out.println("0. Exit");

            int userChoice = readNumberFromConsole("Select number of action:");

            switch (userChoice) {
                case 1:
                    System.out.println("Capital: " + country.getCapital());
                    break;
                case 2:
                    System.out.println("Number of regions: " + country.getRegionsCount());
                    break;
                case 3:
                    System.out.println("Area of country: " + country.getArea() + " sq km");
                    break;
                case 4:
                    System.out.println("Regional centers : " + country.getRegionalCenters());
                    break;
                case 5:
                    System.out.println("Average citizen age: " + country.getAverageCitizenAge());
                    break;
                case 6:
                    int n = readNumberFromConsole("Enter number of letters:");
                    country.printCitizensWithNLettersName(n);
                    break;
                case 7:
                    char m = readCharFromConsole("Enter letter for filtration:");
                    country.printCitizensWithNameStartingWith('m');
                    break;
                case 0:
                    System.out.println("Exit program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect number. Please choose number between 0 - 7.");
            }
        }
    }
}
