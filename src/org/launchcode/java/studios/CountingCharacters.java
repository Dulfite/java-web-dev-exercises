package org.launchcode.java.studios;
import java.io.*;
import java.util.*;
class CountingCharacters {
    static void characterCount(String inputString)
    { HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String newWriting = input.nextLine();
        characterCount(newWriting);
    }
}



//Attempt 3 -------------
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class CountingCharacters {
//    public static void main(String[] args) {
//        HashMap<String, Double> writing = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        String newWriting;
//
//        System.out.println("Enter a sentence: ");
//
//        do {
//            System.out.print("Writing: ");
//            newWriting = input.nextLine();
//
//            if (!newWriting.equals("")) {
//            }
//        } while(!newWriting.equals(""));
//    }
//}

//Attempt 2 ----------------------
//public class CountingCharacters {
//    public static void main(String[] args){
//        String writing = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        for (char c : writing.toCharArray()){
//            System.out.println(c);
//        }
//    }
//
//}


//Attempt 1 ----------------------------
//        char[] charactersInString = writing.toCharArray();
//        writing.toCharArray();
//        System.out.println(writing);


//        for(int i = 0; i < writing.length(); i++) {
//            char a = name.charAt(i);
//            System.out.print(a + ", ");
//        }

//        char[] charactersInString = writing.toCharArray();


