package accessModifier.task;

public class Electronics extends Product{
    private long id;
    private String brand;
    private String color;
    private boolean isNew;
    private int memory;

    public Electronics() {
    }

    public Electronics(long id, String brand, String color, boolean isNew, int memory) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                ", memory=" + memory +
                '}';
    }
}
