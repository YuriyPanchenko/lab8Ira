package com.company.models;

public class Outwear extends Clothes {

    private String season;

    public Outwear(String name, String company, double price, int size, String material, String color) {
        super(name, company, price, size, material, color);
    }

    public Outwear(String name, String company, double price, int size, String material, String color, String season) {
        super(name, company, price, size, material, color);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
    @Override
    public String toString() {
        return "Outwear{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", company='" + super.getCompany() + '\'' +
                ", price=" + super.getPrice() +
                ", size=" + super.getSize() +
                ", material='" + super.getMaterial() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
