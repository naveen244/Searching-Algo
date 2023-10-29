import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        

     }

    static boolean isPrime(int n){
        if(n==1||n==0)return false;
        for(int i=2; i<n; i++){
            if(n%i==0)return false;
        }
        return true;
    }
}