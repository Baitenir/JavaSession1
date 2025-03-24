package Polimorphism.task1;

public class Main {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("sh1", 1, "red", 120);
        Sheep sheep2 = new Sheep("sh2", 2, "red", 120);
        Sheep sheep3 = new Sheep("sh3", 3, "red", 120);

        Cow cow1 = new Cow("cow1", 2, "blue", 112);
        Cow cow2 = new Cow("cow2", 2, "blue", 112);
        Cow cow3 = new Cow("cow3", 2, "blue", 112);
        Cow cow4 = new Cow("cow4", 2, "blue", 112);
        Cow cow5 = new Cow("cow5", 2, "blue", 112);

        Horse horse1 = new Horse("h1",3,"white", 154);
        Horse horse2 = new Horse("h1",3,"white", 154);

        Sheep[] sheeps = new Sheep[] {sheep1, sheep2, sheep3};
        Cow[] cows = new Cow[] {cow1,cow2,cow3,cow4,cow5};
        Horse[] horses = new Horse[] {horse1, horse2};

        Farm farm1 = new Farm("Chui",  cows, horses, sheeps, "Sadyr");

        Sheep sheep4 = new Sheep("sh3", 3, "red", 120);
        Cow cow6 = new Cow("cow1", 2, "blue", 112);
        Horse horse3 = new Horse("h1",3,"white", 154);

        Sheep[] sheeps2 = new Sheep[]{sheep4};
        Cow[] cows2 = new Cow[]{cow6};
        Horse[] horses2 = new Horse[]{horse3};

        Farm farm2 = new Farm("Chui", cows2, horses2, sheeps2, "Jimi");









    }
}
