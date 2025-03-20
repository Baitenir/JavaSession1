package inheritence.task5;

public class Apartment {
        private String title;
        private int price;
        private String address;

        public Apartment() {
        }

        public Apartment(String title, int price, String address) {
            this.title = title;
            this.price = price;
            this.address = address;
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showApartmentAndStudentsInApartment(Apartment apartment) {
          apartment.showInfoApartment();
      }

    public void showInfoApartment() {
        System.out.println("______________________________________");
        System.out.println("     Apartment name:    " + title);
        System.out.println("     Apartment price:   " + price);
        System.out.println("     Apartment address: " + address);
        System.out.println("These students live here: ");

    }

    public int payMonth (Apartment apartment, Student[] students){
            return apartment.price / students.length;
    }
}
