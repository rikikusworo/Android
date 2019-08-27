package com.example.tugas5rikii;

import java.util.ArrayList;

public class samsungdata {
    public static String[][] data = new String[][]{
            {"Samsung S", "Seri Samsung Galaxy S adalah ponsel andalan dari Samsung. Ponsel inilah yang benar-benar mewakili identitas Samsung sebagai salah satu raja di android."},
            {"Samsung Note", "Samsung Galaxy Note ini adalah lini produk Samsung yang ditujukan untuk menunjang produktivitas. Karena itu, Samsung Galaxy Note identik dengan para eksekutif maupun kalangan profesional."},
            {"Samsung A", "Samsung Galax seri A selalu identik dengan lini produk Samsung untuk anak muda. Pernyataan ini tidaklah salah karena dengan desain menarik, harga yang tidak terlalu tinggi, dan spesifikasi yang memang dibutuhkan oleh anak muda."}
    };

    public static ArrayList<samsung21> getListData(){
        ArrayList<samsung21> list = new ArrayList<>();
        for (String[] aData : data){
            samsung21 samsung = new samsung21();
            samsung.setName(aData[0]);
            samsung.setDeskripsi(aData[1]);
            list.add(samsung);
        }
        return list;
    }
}
