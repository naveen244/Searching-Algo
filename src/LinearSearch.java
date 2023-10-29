import java.util.Scanner;
public class LinearSearch {
//    private static boolean Searchlinearly(int[] arr,int l,int r, int k) {
//        if (r<l)return false;
//        if (arr[r]==k)return true;
//        if (arr[l]==k)return true;
//        return Searchlinearly(arr,l+1,r-1,k);
//    }
    public static void main(String[] args){
        int[] array ={10,48,36,-2,4,83,-9};
        int key;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the searching element: ");
        key = sc.nextInt();
        int  k=key;
//        Scanner sc=new Scanner(System.in);
//        int N=sc.nextInt();
//        int[] arr=new int[N];
//        for (int i=0;i<N;i++){
//            arr[i]=sc.nextInt();
//        }
//        int k= sc.nextInt();
//        int r=N-1;
//        int l=0;
//        System.out.println(Searchlinearly(arr,l,r,k));

        for (int i=0;i < array.length;i++) {
            if (k == array[i]) {
                System.out.println(k+"is found at "+i+" index");
            }
        }

    }
}