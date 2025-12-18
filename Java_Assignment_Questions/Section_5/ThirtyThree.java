package Java_Assignment_Questions.Section_5;

import java.util.Scanner;

public class ThirtyThree {
    // Function to convert lowercase to uppercase
    static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char)(ch - 32);
        }
        return ch;
    }

    // Function to convert uppercase to lowercase
    static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char)(ch + 32);
        }
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = toUpper(arr[i]);
            } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = toLower(arr[i]);
            }
        }

        System.out.println("Converted string:");
        System.out.println(new String(arr));
    }
    
}
