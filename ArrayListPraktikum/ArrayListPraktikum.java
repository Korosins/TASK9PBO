/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author Dewa
 */
public class ArrayListPraktikum {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>(); 
        
        arr.add("Emily");
        arr.add("Dewa");
        arr.add("Cindy");
        arr.add(20);
        arr.add(null);
        arr.set(2, "atma");
        Object removedValue = arr.remove("Emily");
        System.out.println("Value yang dihapus: " + removedValue);
        System.out.println(arr);
        
        
        ArrayList<String> arr1 = new ArrayList<>(); 
        arr1.add("putu");
        arr1.add("aku");
        arr1.add("jeje");
        arr1.add(null); 
        System.out.println(arr1);
        System.out.println("Elemen yang terambil: " );
        
        for(int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i) + "");
        }
        System.out.println(); 
        
        arr.addAll(arr1);
        System.out.println(arr);
        
        ArrayList<Integer> nilaiMahasiswa = new ArrayList<>();
        nilaiMahasiswa.add(92);
        nilaiMahasiswa.add(90);
        nilaiMahasiswa.add(88);
        nilaiMahasiswa.add(98);
        
        nilaiMahasiswa.sort((o1, o2) -> 0); 
        
        System.out.println(nilaiMahasiswa);
        
    }
}