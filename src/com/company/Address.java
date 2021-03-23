package com.company;

public class Address {
    private final String city;
    private final int zipCode;
    private final String street;
    private final int houseNumber;
    private final int apartmentNumber;

    public Address(final String city, final int zipCode, final String street, final int houseNumber, final int apartmentNumber) {
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
