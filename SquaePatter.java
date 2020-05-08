

import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        
        
        
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i=1;
        System.out.println("*");
        if(n>=0 && n<=50)
        {
        while(i<=n)
        {
            System.out.print("*");
            int j=1;
            while(j<=i)
            {
                System.out.print(j);
                j++;
            }
            int p=1,l=i-1;
            while(p<=l)
            {
                System.out.print(l);
                l--;
            }
            System.out.print("*");
            System.out.println();
            i++;
            
        }
        int k=n-1;
        
        while(k>=1)
        {
            System.out.print("*");
            
            int g=1;
            while(g<=k)
            {
                System.out.print(g);
                g++;
            }
            int re=k-1,t=1;
            while(t<=re)
            {
                System.out.print(re);
            re--;
            }
            System.out.print("*");
            System.out.println();
            k--;
        }
          System.out.print("*");
    }
    }
}