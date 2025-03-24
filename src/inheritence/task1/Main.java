package inheritence.task1;

public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother("Doni", 24, "black");
        Daughter daughter = new Daughter("blond" , 165, "Aida", 19, "green");
        System.out.println(mother.getName());
        System.out.println(daughter.getName());

    }
}
