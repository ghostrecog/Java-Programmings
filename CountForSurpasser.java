import java.util.*;
/**
 * This programs identifies value on left most side of an array,  
 * checks whether is lesser than any value of array and makes count of it
 * 7 //size of an array
 * 2 ---------
 * 7         |
 * 3         |
 * 1         |----Array elements
 * 8         |
 * 4         |
 * 6---------
 *  output is
 *  5
 *  1
 *  3
 *  0
 *  1
 *
 */
public class CountForSurpasser {
	public static int[] countForSurpasser(int[] input1)
    {
	    int k=0,count=0;
	    int [] output=new int[input1.length];
	    for(int i=0;i<input1.length;i++){
	    	int a=input1[i];
	    	for(int j=i+1;j<input1.length;j++){
	    		int b=input1[j];
	    		if(a<b){
	    			count++;
	    		}
	    	}
	    	output[k]=count;
	    	count=0; //resetting the counter
	    	k++;
	    }
	    
	    
	    return output;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] output = null;
        int ip1_size = 0;
        ip1_size = Integer.parseInt(in.nextLine().trim());
        int[] ip1 = new int[ip1_size];
        int ip1_item;
        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
            ip1_item = Integer.parseInt(in.nextLine().trim());
            ip1[ip1_i] = ip1_item;
        }
        output = countForSurpasser(ip1);
        for(int output_i=0; output_i < output.length; output_i++) {
	        	System.out.println(String.valueOf(output[output_i]));
	            }
        in.close();

	}

}
