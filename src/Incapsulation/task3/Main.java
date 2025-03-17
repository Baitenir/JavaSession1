package Incapsulation.task3;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        House house1 = new House();
        House house2 = new House();
        House house3 = new House();

        house1.setId(1);
        house1.setAddress("Bishkek");
        house1.setPrice(120000);
        house1.setRoom(4);
        house1.setCountry("Kyrgyzstan");

        house2.setId(2);
        house2.setAddress("Talas");
        house2.setPrice(90000);
        house2.setRoom(4);
        house2.setCountry("Kyrgyzstan");

        house3.setId(3);
        house3.setAddress("Chui");
        house3.setPrice(140000);
        house3.setRoom(5);
        house3.setCountry("Kyrgyzstan");

        House[] housesDB = new House[] {house1, house2, house3}; // TODO DATABASE!

//      // TODO TEST CREATE METHOD:
//        House house4 = new House();
//        house4.setId(4);
//        house4.setAddress("Naryn");
//        house4.setPrice(70000);
//        house4.setRoom(3);
//        house4.setCountry("Kyrgyzstan");
//        housesDB = house.createHouse(housesDB, house4);
//        house.getAllHouse(housesDB);

        // TODO TEST GET ALL METHOD:
//        house.getAllHouse(housesDB);

        // TODO TEST GET BY ID METHOD:
//        house.getHouseById(housesDB, 4).showInfoHouse();

        // TODO TEST UPDATE METHOD:
//        House updateHouse = new House();
//        updateHouse.setAddress("Batken");
//        updateHouse.setRoom(2);
//        updateHouse.setPrice(50000);
//        house.updateHouse(housesDB, 1, updateHouse);
//        house.getHouseById(housesDB, 1).showInfoHouse();

        // TODO TEST DELETE METHOD:
//        housesDB = house.deleteHouseById(housesDB, 2);
//        house.getAllHouse(housesDB);





    }
}
