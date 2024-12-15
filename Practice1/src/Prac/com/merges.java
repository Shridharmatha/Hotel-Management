package Prac.com;

import java.util.Arrays;
import java.util.*;
class merges {
    public static int[] merge(int[] arr1,int[]arr2,int[] res)
    {
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length &&j< arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                res[k]=arr1[i];
                i++;
                k++;
            }
            else
            {
               res[k]=arr2[j];
               j++;
               k++;
            }
              
    }
            while(i<arr1.length)
            {
            	res[k]=arr1[i];
                i++;
                k++;
            }
            while(j<arr2.length)
            {
            	res[k]=arr2[j];
            	j++;
            	k++;
            }
            return res;
        }
       
    
   
    public static void main(String[] args) {
       int []arr1={10,20,30,40};
       int []arr2={11,15,25,35,38,45};
       int []res=new int[arr1.length+arr2.length];
       int[] res1=merge(arr1,arr2,res);
       System.out.println(Arrays.toString(res1));    }
}