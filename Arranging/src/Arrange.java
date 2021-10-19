import java.util.Scanner;  
import java.util.Arrays;
import java.util.Collections;

public class Arrange {
	
	static void reverse(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
  
        
        for (k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }

	public static void main(String[] args) {
		int size;
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the size of Array: ");    
		size =sc.nextInt();   
		int[] array = new int[size];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<size; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		
		int l = 0, r = size - 1;
		 
        int k = 0;
 
        while (l < r)
        {
         
            while (array[l] % 2 != 0)
            {
                l++;
                k++;
            }
 
            while (array[r] % 2 == 0 && l < r)
                r--;
 
            if (l < r)
            {
             
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
            }
        }
 
        Arrays.sort(array, 0, k);
        Arrays.sort(array, k, size);
        reverse(array,size);
        

	}

}
