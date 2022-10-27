package org.example.recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Test1";
        reverse(0, str.toCharArray());
    }

    public static void reverse(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }
        reverse(index + 1, str);
        System.out.println(str[index]);
    }
}