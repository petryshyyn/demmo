package ua.lviv.iot.Stationery;

import ua.lviv.iot.Stationery.Enams.Book;

public class DevicesForReading extends Stationary {
    private boolean lamp;
    private boolean glasses;
    private Book typeOfBook;

     public DevicesForReading(String typeOfGoods, String manufactureOfGoods, int priceOfGoods) {
       super(typeOfGoods,manufactureOfGoods,priceOfGoods);
    }

    public boolean getLamp() {
        return lamp;
    }

    public boolean getGlasses() {
        return glasses;
    }

    public Book getTypeOfBook() {
        return typeOfBook;
    }

    public void setLamp(boolean lamp) {
        this.lamp = lamp;
    }

    public void setGlasses(boolean glasses) {
        this.glasses = glasses;
    }

    public void setTypeOfBook(Book typeOfBook) {
        this.typeOfBook = typeOfBook;
    }
}
