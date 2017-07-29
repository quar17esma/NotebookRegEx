package com.sergii.shutyi.Model.entity;

public class Address {

    private String postIndex;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String fullAddress;

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postIndex='" + postIndex + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (!getPostIndex().equals(address.getPostIndex())) return false;
        if (!getCity().equals(address.getCity())) return false;
        if (!getStreet().equals(address.getStreet())) return false;
        if (!getHouseNumber().equals(address.getHouseNumber())) return false;
        if (!getApartmentNumber().equals(address.getApartmentNumber())) return false;
        return getFullAddress().equals(address.getFullAddress());
    }

    @Override
    public int hashCode() {
        int result = getPostIndex().hashCode();
        result = 31 * result + getCity().hashCode();
        result = 31 * result + getStreet().hashCode();
        result = 31 * result + getHouseNumber().hashCode();
        result = 31 * result + getApartmentNumber().hashCode();
        result = 31 * result + getFullAddress().hashCode();
        return result;
    }
}
