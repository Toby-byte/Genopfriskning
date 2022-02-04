package Genopfriskning1Semester.Find_String_In_Array;

import java.util.Arrays;

public class Forsøg
{
    static int findStringInArray(String search, String[] array)
    {
        int indeks = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i].equals(search)) {
                indeks = i;
            }
        }

        if (indeks == 0) {
            indeks = -1;
        }

        return indeks;
    }

    public static void main(String[] args)
    {
        String[] SArray = {"a","c","d","b"};
        String searchWord = "d";
        System.out.println(findStringInArray(searchWord, SArray));
    }
}
