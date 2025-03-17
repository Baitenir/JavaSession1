package inheritence.task2;

public class Computer extends Technique{
    private int pass;

    public Computer(String name, String brand, int version, int pass) {
        super(name, brand, version);
        this.pass = pass;
    }
    public Computer() {
    }

    public void setPass(int pass){
        this.pass = pass;
    }

    public String checkUserPass(int userPass){
        if (userPass == this.pass){
            return "Computer is on!";
        }
        return "Invalid password!";
    }

    public void showInfo(String name, String brand, int version){
        System.out.println("Computer name: " + name);
        System.out.println("Computer brand: "+ brand);
        System.out.println("Computer version: "+ version);
    }


}
