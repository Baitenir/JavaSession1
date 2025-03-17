package Incapsulation.task1;

public class Main {
    public static void main(String[] args) {
        Hoomee hoomee = new Hoomee();

        hoomee.setAddress("Bishkek");
        hoomee.setNumberOfRooms(4);
        hoomee.setArea(100);

        double res = hoomee.calculatePrice(1200);
        System.out.println("Summa: "+res);
    }
}
