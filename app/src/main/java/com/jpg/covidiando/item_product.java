package com.jpg.covidiando;

public class item_product {

    String nameP,descriptionP,priceP;
    int imageP;

    public item_product(String nameP, String descriptionP, String priceP, int imageP) {
        this.nameP = nameP;
        this.descriptionP = descriptionP;
        this.priceP = priceP;
        this.imageP = imageP;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public String getDescriptionP() {
        return descriptionP;
    }

    public void setDescriptionP(String descriptionP) {
        this.descriptionP = descriptionP;
    }

    public String getPriceP() {
        return priceP;
    }

    public void setPriceP(String priceP) {
        this.priceP = priceP;
    }

    public int getImageP() {
        return imageP;
    }

    public void setImageP(int imageP) {
        this.imageP = imageP;
    }
}
