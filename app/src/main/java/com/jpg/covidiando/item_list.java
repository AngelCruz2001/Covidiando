package com.jpg.covidiando;

public class item_list {
    public int sourceImage;
    public String text_info;

    public item_list(int sourceImage, String text_info) {
        this.sourceImage = sourceImage;
        this.text_info = text_info;
    }

    public int getSourceImage() {
        return sourceImage;
    }

    public void setSourceImage(int sourceImage) {
        this.sourceImage = sourceImage;
    }

    public String getText_info() {
        return text_info;
    }

    public void setText_info(String text_info) {
        this.text_info = text_info;
    }
}
