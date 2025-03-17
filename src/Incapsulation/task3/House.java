package Incapsulation.task3;

public class House {
    private long id;
    private String address;
    private int price;
    private int room;
    private String country;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    // TODO CREATE METHOD: SUCCESS!
    public House[] createHouse(House[] houses, House house) {
        House[] newHouses = new House[houses.length + 1];
        for (int i = 0; i < houses.length; i++) {
            newHouses[i] = houses[i];
        }
        newHouses[houses.length] = house;
        houses = newHouses;
        //System.out.println("Success saved!");
        return houses;
    }

    // TODO READ METHOD
    // TODO GET ALL:  SUCCESS!
    public House[] getAllHouse(House[] houses){
        for (House house : houses) {
            house.showInfoHouse();
        }
        return houses;
    }

    // TODO GET BY ID: SUCCESS!
    public House getHouseById(House[] houses, long id){
        for (House house : houses) {
            if (house.id == id) {
                return house;
            }
        }
        return null;
    }

    // TODO UPDATE METHOD: SUCCESS!
    public House[] updateHouse (House[] houses, long id, House updateHouse){
        House oldHouse = getHouseById(houses,id);
        if (updateHouse.address != null && !oldHouse.address.equals(updateHouse.address)){
            oldHouse.address = updateHouse.address;
        }
        if (updateHouse.price != 0 && oldHouse.price != updateHouse.price){
            oldHouse.price = updateHouse.price;
        }
        if (updateHouse.room != 0 && oldHouse.room != updateHouse.room){
            oldHouse.room = updateHouse.room;
        }
        if (updateHouse.country != null && !oldHouse.country.equals(updateHouse.country)){
            oldHouse.country = updateHouse.country;
        }
        return houses;
    }

    // TODO DELETE METHOD: SUCCESS!
    public House[] deleteHouseById (House[] houses, long id){
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == id){
                index = i;
            }
        }
        if (id == -1){
            return houses;
        }

        House[] newHouses = new House[houses.length - 1];
        for (int i = 0; i < index; i++) {
            newHouses[i] = houses[i];
        }
        for (int i = index; i < newHouses.length; i++) {
            newHouses[i] = houses[i+1];
        }
        houses = newHouses;
        return houses;
    }

    public void showInfoHouse (){
        System.out.println("___________________________________");
        System.out.println("House id: " + id);
        System.out.println("House address: " + address);
        System.out.println("House price: " + price);
        System.out.println("House room: " + room);
        System.out.println("House country: " + country);
    }
}
