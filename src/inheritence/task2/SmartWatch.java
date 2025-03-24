package inheritence.task2;

public class SmartWatch extends Technique{
    String color;

    public SmartWatch(String name, String brand, int version, String color) {
        super(name, brand, version);
        this.color = color;
    }
    public SmartWatch(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String smartWatchOn(){
        return "Smart watch is on";
    }

    public void showInfo(String name, String brand, int version, String color){
        System.out.println("Smart watch name: " + name);
        System.out.println("Smart watch brand: "+ brand);
        System.out.println("Smart watch version: "+ version);
        System.out.println("Smart watch color: "+ color);
    }
}
