package ua.lviv.iot.Stationery;

import ua.lviv.iot.Stationery.Enams.Folder;

public class StorageAccessories extends Stationary {
    private String materialOfBag;
    private double priceByToolbar;
    private Folder typeOfFolder;

    public StorageAccessories(String typeOfGoods, String manufactureOfGoods, int priceOfGoods) {
        super(typeOfGoods, manufactureOfGoods, priceOfGoods);
    }

    public String getMaterialOfBag() {
        return materialOfBag;
    }

    public double getPriceByToolbar() {
        return priceByToolbar;
    }

    public Folder getTypeOfFolder() {
        return typeOfFolder;
    }

    public void setMaterialOfBag(String materialOfBag) {
        this.materialOfBag = materialOfBag;
    }

    public void setPriceByToolbar(double priceByToolbar) {
        this.priceByToolbar = priceByToolbar;
    }

    public void setTypeOfFolder(Folder typeOfFolder) {
        this.typeOfFolder = typeOfFolder;
    }
}
