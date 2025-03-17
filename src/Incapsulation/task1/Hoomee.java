package Incapsulation.task1;

public class Hoomee {
    private String address;
    private int numberOfRooms;
    private double area;

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculatePrice(int price ){
       return price * area;

    }

    public void createHouse(Hoomee[] housesDB, Hoomee house14) {

    }
}
