// package org.example.recursion;

public class BinarySearch{
    public static void main(String[] args) {
          int[] arr = {1,2,3,4,5,6,7,8,9,10};
          int n = 10;
          System.out.println(binarySearch(arr, 0, arr.length-1, n));
    }

    static boolean binarySearch(int[] arr, int left, int right, int n){
          if (arr[left]>arr[right]) {
            return false;
          }
        int mid = left + (right-left)/2;
        // System.out.println(mid);
          if (arr[mid] == n){
            return true;}

          if(n > arr[mid]){
            System.out.println(n + " " + arr[mid]);
            return binarySearch(arr, mid+1, right, n);
          }else{
            System.out.println(n + " " + arr[mid]);
            return binarySearch(arr, left, mid-1, n);
          }
    }
}
