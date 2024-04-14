package pl.asilver.country_project.service;

import java.util.Scanner;

public class Service {
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
}
