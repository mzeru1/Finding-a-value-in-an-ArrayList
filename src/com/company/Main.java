package com.company;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // we can't use int bs this is primitve type not object
        // here we have to use object which is Intgeger
        Random rand = new Random();
        ArrayList<Integer> randValues = new ArrayList<Integer>(50);
        for (int i = 0; i<15; i++){
            int numb = rand.nextInt(15);
            randValues.add(numb);

     //   for (int numB:randValues){
           System.out.println(randValues);
       }
    }
}
