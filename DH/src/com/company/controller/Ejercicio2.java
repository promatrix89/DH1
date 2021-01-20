package com.company.controller;

import com.company.model.StringUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio2 {
    public static void radixSort(int [] arr){
        String [] arrS = StringUtil.convertirString(arr);
        StringUtil.lComplete(arrS,'0');

        HashMap<Integer, ArrayList<String>> listas = new HashMap<>();



        for(int j=arrS[0].length()-1;j>=0;j--){
            inicializarHashMap(listas);
            for(int i=0;i<arrS.length;i++){
                char x=arrS[i].charAt(j);
                int d=x-'0';
                listas.get(d).add(arrS[i]);
            }
            rearmarArray(arrS,listas);
        }







        System.out.println("---");

        for(String s : arrS){
            System.out.println(s);
        }

    }
    public static void inicializarHashMap(HashMap<Integer,ArrayList<String>> listas){
        listas.clear();
        for(int i=0;i<10;i++){
            listas.put(i,new ArrayList<>());
        }
    }
    public static void rearmarArray(String[] arrS, HashMap<Integer, ArrayList<String>> listas){
        int count=0;
        for(int j=0;j<listas.size();j++){
            ArrayList<String> lis=listas.get(j);
            for(String s: lis){
                arrS[count]=s;
                count++;
            }
        }
    }

}
