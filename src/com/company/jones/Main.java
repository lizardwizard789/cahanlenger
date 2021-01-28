package com.company.jones;

public class Main {

    public static void main(String[] args) {
int[] integers = {1,2,3,4,-1,-2,10,-5};

for (int i=0; i<integers.length; i++)
if (0>integers[i]) System.out.println(integers[i]);


String name="Simeon";
String storage="";
for (int i=0; i<name.length(); i++){
    if (!(i==0||  i==name.length()-1)){
    storage+=name.charAt(i);
    }
}
        System.out.println(storage);

    }
}
