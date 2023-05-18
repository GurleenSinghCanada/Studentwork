/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;

/**
 *
 * @author every
 */
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter a word");
        String word = input.nextLine();
        char[] arr = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            arr[i] = word.charAt(i);
            System.out.println(word.charAt(i));
        }
        System.out.println(arr);
        for (int k = arr.length - 1; k > 0; k--) {
            System.out.println(arr[k]);

        }

    }
}
