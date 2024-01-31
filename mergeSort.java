import java.util.*;
import java.util.Scanner;
//public class mergeSort {
//    public static void merge(int[] arr,int l,int r,int m){
//        int n1,n2;
//        n1=m-l+1;
//        n2=r-m;
//        int[] a=new int[n1];
//        int[] b=new int[n2];
//
//        for (int i = 0; i < n1; i++) {
//                    a[i]=arr[l+i];
//        }
//        for (int j = 0; j < n2; j++) {
//                    b[j]=arr[m+1+j];
//        }
//
//
//        int i=0;
//        int j=0;
//        int k=l;
//        while(i<n1 && j<n2){
//            if(a[i]<=b[j]){
//                arr[k]=a[i];
//                i++;
//            }
//            else{
//                arr[k]=b[j];
//                j++;
//            }
//            k++;
//        }
//
//
//            while(i<n1){
//                arr[k]=a[i];
//                k++;
//                i++;
//            }
//            while(j<n2){
//                arr[k]=b[j];
//                k++;
//                j++;
//            }
//
//        }
//
//    public static void divide(int[] arr,int l,int r) {
//        if (l<r) {
//            int m = l + (r - l) / 2;
//            divide(arr, l, m);
//            divide(arr, m + 1, r);
//            merge(arr, l, r, m);
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[]={8,9,3,4,2,6,1};
//        int n=arr.length;
//        divide(arr,0,n-1);
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//
//    }
//}


//import java.io.*;
//
//class MergeSort {
//
//    // Merges two subarrays of arr[].
//    // First subarray is arr[l..m]
//    // Second subarray is arr[m+1..r]
//    void merge(int arr[], int l, int m, int r)
//    {
//        // Find sizes of two subarrays to be merged
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        // Create temp arrays
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//
//        // Copy data to temp arrays
//        for (int i = 0; i < n1; ++i)
//            L[i] = arr[l + i];
//        for (int j = 0; j < n2; ++j)
//            R[j] = arr[m + 1 + j];
//
//        // Merge the temp arrays
//
//        // Initial indices of first and second subarrays
//        int i = 0, j = 0;
//
//        // Initial index of merged subarray array
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i];
//                i++;
//            }
//            else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Copy remaining elements of L[] if any
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        // Copy remaining elements of R[] if any
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//
//    // Main function that sorts arr[l..r] using
//    // merge()
//    void sort(int arr[], int l, int r)
//    {
//        if (l < r) {
//
//            // Find the middle point
//            int m = l + (r - l) / 2;
//
//            // Sort first and second halves
//            sort(arr, l, m);
//            sort(arr, m + 1, r);
//
//            // Merge the sorted halves
//            merge(arr, l, m, r);
//        }
//    }
//
//    // A utility function to print array of size n
//    static void printArray(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 0; i < n; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//
//    // Driver code
//    public static void main(String args[])
//    {
//        int arr[] = { 12, 11, 13, 5, 6, 7 };
//
//        System.out.println("Given array is");
//        printArray(arr);
//
//        MergeSort ob = new MergeSort();
//        ob.sort(arr, 0, arr.length - 1);
//
//        System.out.println("\nSorted array is");
//        printArray(arr);
//    }
//}
///* This code is contributed by Rajat Mishra */
public class mergeSort{
    public static void merge(int[] arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int[] a=new int[n1];
        int[] b=new int[n2];
        for(int i=0;i<n1;i++){
            a[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            b[j]=arr[m+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;

            } else {
                arr[k] = b[j];
                j++;

            }
            k++;
        }
            while(i<n1){
                arr[k]=a[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k]=b[j];
                j++;
                k++;
            }
}
    public static void divide(int[] arr,int l,int r){
        if(l<r){
        int m=l+(r-l)/2;
        divide(arr,l,m);
        divide(arr,m+1,r);
        merge(arr,l,m,r);}
    }


    public static void main(String[] args) {
        int[] arr={7,6,5,4,3,2,1};
        int n=arr.length;
        System.out.println("The unsorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        divide(arr,0,n-1);
        System.out.println("\nSorted array is:\n ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }

        }
    }