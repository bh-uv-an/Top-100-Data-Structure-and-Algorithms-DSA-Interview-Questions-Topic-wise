package org.studyeasy;
import java.util.Scanner;

public class Linear_search {
    public static int Linear(int arr[],int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i+1;
            }
        }
        System.out.println("Element not found");
        return 0;
    }
    public static  void main(String[] args){
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
        System.out.println("Search element is found at position "+Linear(arr,ele));
    }
}
/*

Output 1:

Enter the array size 
5
Enter the array elements 
1
2
3
4
5
Enter the search element 
9
Element not found
Search element is found at position 0

Process finished with exit code 0

Output 2: 
Enter the array size 
4
Enter the array elements 
10
20
30
40
Enter the search element 
10
Search element is found at position 1

Process finished with exit code 0

*/
