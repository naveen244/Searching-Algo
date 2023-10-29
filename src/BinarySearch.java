import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{

    // binary search = Search algorithm that finds the position
    //				   of a target value within a sorted array.
    //				   Half of the array is eliminated during each "step"

    public static void main(String[] args) {
        int[] array={1,3,1,56,2,5,21,55,23,445,34};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element: ");
        int target= sc.nextInt();
        int f=0;
        int l=array.length -1;

        //int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target,f,l);

        if(index == -1) {
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at index: " + index);
        }

    }

    private static int binarySearch(int[] array, int target,int low ,int high) {

        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*while(low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];
            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle; //target found
        }*/
        while (low <= high) {
            int mid = (low + (high - 1)) / 2;
            int midval = array[mid];
            if (midval == target) {
                return mid;

            }
            else if (target > midval) return binarySearch(array, target, mid + 1, high);
            else if (target < midval) return binarySearch(array, target, low, mid - 1);

        }
        return -1;
    }
}