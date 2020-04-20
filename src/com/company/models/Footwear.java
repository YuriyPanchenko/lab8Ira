package com.company.models;

public class Footwear extends Clothes {
    private String type;
    public Footwear(String name, String company, double price, int size, String material, String color) {
        super(name, company, price, size, material, color);
    }

    public Footwear(String name, String company, double price, int size, String material, String color, String type) {
        super(name, company, price, size, material, color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Footwear{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", company='" + super.getCompany() + '\'' +
                ", price=" + super.getPrice() +
                ", size=" + super.getSize() +
                ", material='" + super.getMaterial() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
