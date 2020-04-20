package com.company.models;

public class Undercoat extends Clothes {

    private boolean isSports;
    public Undercoat(String name, String company, double price, int size, String material, String color) {
        super(name, company, price, size, material, color);
    }

    public Undercoat(String name, String company, double price, int size, String material, String color, boolean isSports) {
        super(name, company, price, size, material, color);
        this.isSports = isSports;
    }

    public boolean isSports() {
        return isSports;
    }

    public void setSports(boolean sports) {
        isSports = sports;
    }

    @Override
    public String toString() {
        return "Undercoat{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", company='" + super.getCompany() + '\'' +
                ", price=" + super.getPrice() +
                ", size=" + super.getSize() +
                ", material='" + super.getMaterial() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", isSports='" + isSports + '\'' +
                '}';
    }
}
