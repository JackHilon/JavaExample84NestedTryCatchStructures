
package javaexample84nestedtrycatchstructures;

import java.util.Arrays;


public class JavaExample84NestedTryCatchStructures {

    
    public static void main(String[] args) {
        
        double d=Math.random();
        
        try
        {
            String str = "ABCDE";
            char[] arr = str.toCharArray();
            
            if(d<0.33)
            System.out.println(str.charAt(5)); // throws StringIndexOutOfBoundsException
            
            try{
                if(d>=0.33 && d<0.66)
                    Arrays.sort(arr, 3, 6); // throws ArrayIndexOutOfBoundsException
                
                else 
                    Arrays.sort(arr, 3, 1); // throws IllegalArgumentException
                
                System.out.println(arr);
            }
            catch(IllegalArgumentException e)
            {
                e.printStackTrace();
            }
        }
        
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
      
    }
}
