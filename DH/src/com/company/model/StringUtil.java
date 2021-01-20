package com.company.model;

public class StringUtil {
    public static String[] convertirString(int[] a){
        String[] sRes = new String[a.length];
        for(int i=0;i<a.length;i++){
            String temp=Integer.toString(a[i]);
            sRes[i]=temp;
        }
        return sRes;
    }
    public static void lComplete(String[] a, char c){
        String[] sRes;
        int mayor=0;
        for(String x: a){
            if(x.length()>mayor){
                mayor=x.length();
            }
        }


        for(int i=0;i<a.length;i++){
            String elemento=a[i];
            int ceros=mayor-elemento.length();
            for(int j=0;j<ceros;j++){
                elemento= c + elemento;
            }
            a[i]=elemento;
        }

    }

}
