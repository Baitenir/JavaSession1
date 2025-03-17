package inheritence.task1;

public class Daughter extends Mother{
    private String hairColor;
    private int height;

    public Daughter(String hairColor, int height, String name, int age, String eyeColor) {
        super(name, age,eyeColor);
        this.hairColor = hairColor;
        this.height = height;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
