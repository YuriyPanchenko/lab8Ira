package com.company;

import com.company.models.Clothes;
import com.company.models.Footwear;
import com.company.models.Outwear;
import com.company.models.Undercoat;
import com.company.service.ClothesService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Footwear footwear = new Footwear("xxx", "adidas", 200, 45, "leather", "white", "Sneakers");
        Outwear outwear = new Outwear("yyy", "nike", 400, 50, "leather", "black", "spring");
        Undercoat undercoat = new Undercoat("qqq", "puma", 204, 25, "leather", "white", true);
        ArrayList<Clothes> clothes = new ArrayList<>();
        //test adding
        clothes = ClothesService.addNewClose(footwear, clothes);
        clothes = ClothesService.addNewClose(outwear, clothes);
        clothes = ClothesService.addNewClose(undercoat, clothes);
        System.out.println(clothes);

        //test show methods
        ClothesService.showAllFootwear(clothes);
        ClothesService.showAllOutwear(clothes);
        ClothesService.showAllUndercoat(clothes);

        //test delete
        clothes = ClothesService.deleteClothesById(0, clothes);
        System.out.println(clothes);

        //test change
        clothes = ClothesService.changeClothesById(0, new Outwear("zzz", "nike", 40, 40, "caton", "yellow", "summer"), clothes);
        System.out.println(clothes);



    }
}
