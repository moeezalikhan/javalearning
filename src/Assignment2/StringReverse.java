/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Stack;

/**
 *
 * @author Moeez
 */
public class StringReverse {

    public static void main(String[] args) {
        String stringToReverse = "A Brown cat and DOgs in a Dark Forest";
        System.out.println(stringToReverse);
        System.out.println(ReverseSentence(stringToReverse));

    }

    public static String ReverseSentence(String sentence) {
        String reversedString = "";
        String[] reverseWord = sentence.split(" ");
        for (String word : reverseWord) {
            reversedString+= ReverseWord(word)+" ";
        }
        return reversedString;
    }

    public static String ReverseWord(String word) {
        String reverseWord = "";
        Stack toReverse = new Stack();
        for (int i = 0; i < word.length(); i++) {
            toReverse.push(word.charAt(i));
        }
        for (int j = 0; j < word.length(); j++) {
            reverseWord += "" + toReverse.pop() + "";
        }
        return reverseWord;
    }
}
