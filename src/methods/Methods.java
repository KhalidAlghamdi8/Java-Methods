/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Arrays;


/**
 *
 * @author khalid
 */
public class Methods {


    public static void main(String[] args) {
        int [] a={3,22,55,25,12,465,6,7,8,9,56,3};
        int [] b={3,2,55,2,1,45,65,744,58,95,56,3};
        


        System.out.println(compare(sum(a),sum(b)));
        
        System.out.println("The sum of A is:" + sum(a));
        System.out.println(sort(a,b));
        float n=average(a);
        System.out.println("Average is :"+n);
        System.out.println("Max Num is: " +max(a));
        System.out.println("Min Num is: " +min(a));
        
        
        int k[][]={{16,36,64},{62,84,83},{38,43,25}};    
        int l[][]={{1,3,4},{2,4,3},{1,2,4}};   
        System.out.println("MatrixAdditionExample:");
        System.out.println(MatrixAdditionExample(k,l));
        System.out.println("MatrixSubtracttionExample:");
        System.out.println(MatrixSubtracttionExample(k,l));
        System.out.println("MatriMultiplctionExample:");
        System.out.println(MatriMultiplytionExample(k,l));

        System.out.println("Factorial of 5 is: "+factorial(5));  
        System.out.println(Iteration(10)); 

    }
    
    static int sum (int[]a){
        int s = 0;
        for (int i = 0; i < a.length; i++){
            s+=a[i];
        }
        return s;  
    }
    
    static int compare (int x,int y){
    if (x>y){
    return x;
    }else{
    return y;
    }
    }
    
    static int max (int[]a){
        int s = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] > s){
            s = a[i];
            }
        }
        return s;  
    }
    
    static int min (int[]a){
        int s = a[0];
        for (int i = 0; i < a.length; i++){
            if(a[i] < s){
            s = a[i];
            }
        }
        return s;  
    }
    
    static int sort (int[] a , int[] b){
        Arrays.sort(a); 
        System.out.printf("\n Sort of A is: " + Arrays.toString(a));
        Arrays.sort(b);
        System.out.printf("\n Sort of B is " + Arrays.toString(b));
        return 0;
    }
    
    static int average (int[] a){
        int total=0;
        for (int i = 0; i < a.length; i++){
        total += a[i];
        }        
        return total/a.length;   
}
    
    static int factorial (int n){
    if (n == 1)
        return 1;
    else
        return (n * factorial(n-1) );
    }
    static int Iteration (int n){
          for(int i = 1; i <= n; i++) {
         System.out.println("Iteration of 10 is: " +i+ " " );
      }
        return 0;
    } 
    
    
    static int  MatrixAdditionExample (int[][]k, int [][]l)
    {
        int c[][] = new int[3][3];  

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = k[i][j] + l[i][j];    
                System.out.print( "[" + c[i][j] + "]");
            }
            System.out.println("");    
        }
        return 0;
    } 
    
    static int  MatrixSubtracttionExample (int[][]k, int [][]l){
            int c[][] = new int[3][3]; 
            
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = k[i][j] - l[i][j]; 
                    System.out.print( "[" + c[i][j] + "]");
            }
                         System.out.println("");    
        }
        return 0;
    }
    
    static int  MatriMultiplytionExample (int[][]k, int [][]l)
    {
        int c[][] = new int[3][3];  

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = k[i][j] * l[i][j];    
                System.out.print( "[" + c[i][j] + "]");
            }
            System.out.println("");    
        }
        return 0;
    } 
    
    
}
   
