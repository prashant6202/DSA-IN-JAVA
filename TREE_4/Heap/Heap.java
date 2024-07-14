package DSA.TREE_4.Heap;

import java.util.Scanner;

public class Heap {
    public static void insHeap(int arr[],int x,int i){
        int parIndex,childIndex=i;
        while (childIndex > 1) {
            parIndex=childIndex/2;
            if (arr[parIndex]> x) {
                arr[childIndex]=x;
               return;
            }
            arr[childIndex]=arr[parIndex];
            childIndex=parIndex;
        }
        arr[1]=x;

    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int []arr=new int[6];
        for (int i=1;i<=5;i++){
            System.out.println("Enter the value to be added in the Heap");
            int x=kb.nextInt();
            insHeap(arr,x,i);
        }
        System.out.println("Heap is ");
       for (int i=1;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
