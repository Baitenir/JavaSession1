package inheritence.task2;

public class Technique {
    private String name;
    private String brand;
    private int version;

    public Technique() {
    }
    public Technique(String name, String brand, int version) {
        this.name = name;
        this.brand = brand;
        this.version = version;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }


    public String checkUserChoice(String userChoice){
        if (userChoice.equalsIgnoreCase("Computer")){
            return "Computer";
        } else if (userChoice.equalsIgnoreCase("Phone")) {
            return "Phone";
        } else if (userChoice.equalsIgnoreCase("Smart Watch")) {
            return "Smart Watch";
        }
        return "Invalid choice";
    }




}
