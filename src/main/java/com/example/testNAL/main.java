package main.java.com.example.testNAL;

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();
        System.out.println("input : "+input);
        int result = count(input);
        System.out.println("result: " + result);


    }
    public static int count(String input){
        int count = 0;
        int total = input.length();
        for(int i=0;i<total-1; i++){
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);

            if(testIsVietNamese(currentChar,nextChar)){
                count++;
                i++;
            }
        }
        return count;
    }

    public static boolean testIsVietNamese(char currentChar, char nextChar){
        String word = String.valueOf(currentChar) + String.valueOf(nextChar);
        if(String.valueOf(currentChar).equals("w")){
            return true;
        }
        return word.equals("aw") || word.equals("aa") || word.equals("dd") || word.equals("ee") ||
                word.equals("oo") || word.equals("ow");
    }
}