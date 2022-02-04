package Genopfriskning1Semester.Sortering;

//SorteringSkriven metode, der indlæser 5 tekststrenge fra tastaturet og
//udskriver dem på skærmen i alfabetisk faldende orden på skærmen.
//Hvis der indlæses:
//abekat musefælde ananas slut solskin

//skal der udskrives følgende på skærmen:
//solskin slut musefælde ananas abekat

//https://www.geeksforgeeks.org/compare-two-strings-lexicographically-in-java/?ref=rp

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sortering {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("abekat","musefælde","ananas","slut","solskin"));

        for (int i = 0; i < names.size()-1; i++) {
            String firstLetterFirstWord = String.valueOf(names.get(i).charAt(0));
            String firstLetterSecondWord = String.valueOf(names.get(i+1).charAt(0));


            if(!(firstLetterFirstWord.compareTo(firstLetterSecondWord) < 0)){
                System.out.println(firstLetterFirstWord + " is after " + firstLetterSecondWord);
                Collections.swap(names, i,i+1);
            }else{
                System.out.println(firstLetterFirstWord + " is the same as " + firstLetterSecondWord);
            }

        }
        for (int i = 0; i < names.size() ; i++) {
            System.out.println(names.get(i));
        }


    }
}
