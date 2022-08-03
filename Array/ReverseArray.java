package Array;

import java.util.Scanner;

public class ReverseArray{
    
    public static int[] reverse(int arr[], int n, int start, int end)
    {
      int temp;

      while(start<end)
      {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
      return arr;
    }

    public static void printReverse(int arr[], int n)
    {
       for(int i=0; i<n; i++)
       {
          System.out.print(arr[i] + " ");
       }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int start= 0;
        int end = n-1;
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        reverse(arr,n, start, end);
        printReverse(arr, n);
    }
}