package org.studyeasy;
import java.util.Scanner;
public class Binary_search {
    public static int Binary_srch(int arr[],int ele){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(low<=high){
            mid = (int)(low+high)/2;
            if(arr[mid]==ele){
                return mid+1;
            }
            if(ele>arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        System.out.println("Search element not found");
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search element ");
        int ele = sc.nextInt();
        System.out.println("Search element is found in position "+Binary_srch(arr,ele));
    }
}
/* 

Output 1: 
Enter the array size 
5
Enter the array elements 
10 20 30 40 50 
Enter the search element 
10
Search element is found in position 1

Process finished with exit code 0

Output 2: 
Enter the array size 
3
Enter the array elements 
245
789
456
Enter the search element 
3
Search element not found
Search element is found in position -1
*/
