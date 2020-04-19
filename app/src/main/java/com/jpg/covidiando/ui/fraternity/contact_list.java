package com.jpg.covidiando.ui.fraternity;

public class contact_list {
    public String name;
    public String phoneNumber;
    public int profilePicture;
    public String adress;
    public String distance;

    public contact_list(String name, String phoneNumber, int profilePicture, String adress, String distance) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.profilePicture = profilePicture;
        this.adress = adress;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(int profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
