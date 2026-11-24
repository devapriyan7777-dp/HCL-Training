import java.util.*;
public class Rewrite {
    static void Rrotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
        System.out.println("Rotated Array:" + java.util.Arrays.toString(temp));5
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int [] arr = new int[size];
        for(int i =0; i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the k Element:");
        int k = sc.nextInt();
        Rrotate(arr ,k);

    }
}


