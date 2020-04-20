package com.company.service;

import com.company.models.Clothes;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ClothesService {
    public static ArrayList<Clothes> addNewClose(Clothes clothes, ArrayList<Clothes> clotheslist){
        clothes.setId(clotheslist.size());
        clotheslist.add(clothes);
        return clotheslist;
    }
    public static void showAllOutwear(ArrayList<Clothes> clothes){

        for (Clothes close1: clothes
             ) {
            if(close1.toString().contains("Outwear") == true)
                System.out.println(close1);
        }
    }

    public static void showAllUndercoat(ArrayList<Clothes> clothes){
        for (Clothes close1: clothes
        ) {
            if(close1.toString().contains("Undercoat") == true)
                System.out.println(close1);
        }
    }

    public static void showAllFootwear(ArrayList<Clothes> clothes){
        for (Clothes close1: clothes
        ) {
            if(close1.toString().contains("Footwear") == true)
                System.out.println(close1);
        }
    }

    public static ArrayList<Clothes> deleteClothesById(int id, ArrayList<Clothes> clothes){
        clothes.removeIf(clothes1 -> clothes1.getId() == id);
        clothes.forEach(clothes1 -> {if(clothes1.getId() > id) clothes1.setId(clothes1.getId() - 1);});
        return clothes;
    }

    public static ArrayList<Clothes> changeClothesById(int id, Clothes clothes, ArrayList<Clothes> clothesArrayList){
        clothesArrayList.forEach(clothes1 -> {if(clothes1.getId() == id) {
            clothes1.setColor(clothes.getColor());
            clothes1.setCompany(clothes.getCompany());
            clothes1.setName(clothes.getName());
            clothes1.setMaterial(clothes.getMaterial());
            clothes1.setPrice(clothes.getPrice());
            clothes1.setSize(clothes.getSize());
        }} );
        return clothesArrayList;
    }


}
