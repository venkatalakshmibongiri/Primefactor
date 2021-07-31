import java.util.*;
import java.lang.*;
import java.io.*;
class Primefactor
     {
            static int N=500000;
            public static int prime[]=new int[N];
            public static int arr[]=new int[N];
            public static void sieve()
            {
                for(int i=0;i<N;i++)
                {
                   prime[i]=1;
                }
                 prime[0]=0;
                 prime[1]=0;
                 for(int i=2;i*i<N;i++)
                {
                      if(prime[i]==1)
                      {
                         for(int j=i*i;j<N;j+=i)
                         {
                             prime[j]=0;
                         }
                      }
                }
         }
public static void main(String args[]) throws java.lang.Exception
         {
                  sieve();
                  Scanner sc=new Scanner(System.in);
                  int n=sc.nextInt();
                  int arr[]=new int[n];
                  int c=0,c1=1,x;
                  while(n!=1)
                  {
                        x=prime[n+1];
                        arr[c1]=x;
                        c1++;
                        n=n/prime[n];
                        c++;
                   }
                  System.out.println(c);
         }
}

Output_____________________________________________________________
225
4

