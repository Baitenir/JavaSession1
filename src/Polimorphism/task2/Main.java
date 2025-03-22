package Polimorphism.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sport football = new Football("Real Madrid", "prof", 11);
        Sport swimming = new Swimming("BS", "lover", 5);
        Sport basketball = new Basketball("LS", "prof", 7);
        Sport sport = new Sport();
        Scanner scanner = new Scanner(System.in);

        Sport[] sports = {football, swimming, basketball};
        System.out.println("Write the qvalification sport (prof/lover): ");
        String userSport = scanner.nextLine();

        System.out.println(Arrays.toString(sport.getSport(sports, userSport)));


    }
}
