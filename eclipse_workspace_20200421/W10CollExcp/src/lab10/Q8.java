package lab10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q8 {

//To convert a set to an array : 
	
	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();
		
		hs.add("Water");
		hs.add("Ice");
		hs.add("Cloud");
		hs.add("Sky");
		hs.add("Ocean");
		hs.add("Water");

//To convert a set to an array : 
// 1. way :
		int n = hs.size(); 
        String arr[] = new String[n];

        arr = hs.toArray(arr); 
        System.out.println(Arrays.toString(arr)); 
		System.out.println();
// 2. way :        
        int i = 0; 
        for (String x : hs) 
            arr[i] = x;
        	i++;
  
        System.out.println(Arrays.toString(arr));
        System.out.println();
       
	}

}
