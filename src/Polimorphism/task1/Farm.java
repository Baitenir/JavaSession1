package Polimorphism.task1;

public class Farm {
    String address;
    Cow[] cows;
    Horse[] hourses;
    Sheep[] sheeps;
    String ownerName;

    public Farm(String address, Cow[] cows, Horse[] hourses, Sheep[] sheeps, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.hourses = hourses;
        this.sheeps = sheeps;
        this.ownerName = ownerName;
    }
}
