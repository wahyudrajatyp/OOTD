package com.example.lenovo.kuis;

import java.util.ArrayList;
import java.util.List;

public class ImageAssets {
    //membuat variabel untuk menyimpan gambar untuk pengelompokkan atas
    private static List<Integer> atas = new ArrayList<Integer>(){{
        //private static hanya bisa di akses class sendiri
        add(R.drawable.atas1);
        add(R.drawable.atas2);
        add(R.drawable.atas3);
        add(R.drawable.atas4);
        add(R.drawable.atas5);
        add(R.drawable.atas6);
        add(R.drawable.atas7);
        add(R.drawable.atas8);
        add(R.drawable.atas9);

    }};
    //membuat variabel untuk menyimpan gambar untuk pengelompokkan bawah
    private  static List<Integer> bawah = new ArrayList<Integer>(){{
        add(R.drawable.bawah1);
        add(R.drawable.bawah2);
        add(R.drawable.bawah3);
        add(R.drawable.bawah4);
        add(R.drawable.bawah5);
        add(R.drawable.bawah6);
        add(R.drawable.bawah7);
        add(R.drawable.bawah8);

    }};

    //variabel untuk memanggil variabel Atas
    public static List<Integer> getAtas(){
        //public dapat diakses oleh class lain
        //static memudahkan memanggil method tanpa membuat objek baru
        return atas;
    }
    //variabel untuk memanggil variabel bawah
    public static List<Integer> getBawah(){
        return bawah;
    }

}

