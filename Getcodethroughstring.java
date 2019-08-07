/* ---------------------WIPRO TRAINING------------------------
  ----------------Topics : Get Code Through Sting-------------
  ----------------Author : Shashank Baranwal------------------
  ---------------Date & Time : 07/08/2019 & 10.39 AM----------
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codestring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter word");
        String word = sc.nextLine();
        int len2 = 0, len1 = 0, count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                len2 = count;
                System.out.println(len2);
                count = 0;
            } else {
                count++;
			 }
        }
        len1 = count;
        System.out.println(len1);
        int c = len1 + len2;
        System.out.println(c);

        ArrayList<Integer> array = new ArrayList<Integer>();
        do {
            array.add(c % 10);
            c /= 10;
        }
        while (c > 0);
        System.out.println(array);

        while (array.size() >= 2) {
            array = reduce(array);
            return array;
        }
    }

    private static ArrayList<Integer> reduce(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            array = array[i] + array[i + 1];
        }
        return array;
    }
}