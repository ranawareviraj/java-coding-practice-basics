package org.example.arrays;

public class Arrays_05_SecondMax {
    public static void main(String[] args) {
        int[] arr = {55, 11, -1, 3, 34, 54, 32, 22, 39, 2, 0 - 5};
        int max1 = arr[0];
        int max2 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("Max is: " + max1);
        System.out.println("Second Max is: " + max2);


        }


    //Solution2
    int print2largest(int arr[], int n) {

        int max1 = -1;
        int max2 = -1;

        for(int i=0; i< n; i++){
            if(max1< arr[i]){
                max2 = max1;
                max1 = arr[i];
            }else if ((arr[i] < max1) && (arr[i]>max2))    {
                max2 = arr[i];

            }
        }
        return max2;
    }
    }


/*
If we say max1,max2 = arr[0]
Then this algorithm fails for max as a first element.
 */