package inheritence.task2;

public class Phone extends Technique{
    int pass;

    public Phone (String name, String brand, int version, int pass){
        super(name, brand, version);
        this.pass = pass;
    }

    public void setPass(int pass){
        this.pass = pass;
    }

    public Phone (){}

    public String checkUserPass(int userPass){
        if (userPass == this.pass){
            return "Phone is on";
        }
        return "Invalid password!";
    }

    public void showInfo(String name, String brand, int version){
        System.out.println("Phone name: " + name);
        System.out.println("Phone brand: "+ brand);
        System.out.println("Phone version: "+ version);
    }


}
