package Searching;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "ankitSingh";
        char ch = 'f';
        System.out.println(search(str,ch));
    }

    private static boolean search(String str, char target) {
        if(str.length()==0) return false;

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }
//        for(char ch :str.toCharArray()){
//            if(target==ch) return true;
//        }
        return false;
    }

}
