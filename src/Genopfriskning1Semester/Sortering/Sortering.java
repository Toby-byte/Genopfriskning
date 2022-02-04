package Genopfriskning1Semester.Sortering;

//SorteringSkriven metode, der indlæser 5 tekststrenge fra tastaturet og
//udskriver dem på skærmen i alfabetisk faldende orden på skærmen.
//Hvis der indlæses:
//abekat musefælde ananas slut solskin

//skal der udskrives følgende på skærmen:
//solskin slut musefælde ananas abekat

//https://www.geeksforgeeks.org/compare-two-strings-lexicographically-in-java/?ref=rp

public class Sortering {
    public static void main(String[] args) {
        String[] names = {"abekat","musefælde","ananas","slut","solskin"};

        for (int i = 0; i < names.length-1; i++) {          //Check word
            System.out.println(names[i]);

            for (int j = 0; j < names.length-1; j++) {          //check next word

                String firstLetterFirstWord = String.valueOf(names[i].charAt(0));
                String firstLetterSecondWord = String.valueOf(names[j+1].charAt(0));

                if(firstLetterFirstWord.compareTo(firstLetterSecondWord) < 0){
                    System.out.println(firstLetterFirstWord + " is before " + firstLetterSecondWord);
                }else{
                    System.out.println(firstLetterFirstWord + " is the same as " + firstLetterSecondWord);
                }

            }
        }


    }
}
