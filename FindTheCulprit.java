import java.util.*;
/**
 * This program is about find the integer in two arrays
 * if integer is found in first array return 1 else if
 * integer found in second array return 2, else return -1;
 */
public class FindTheCulprit {  
	 public static int findTheCulprit(int[] input1,int[] input2,int input3)
	    {
		    int output=0;
		    for(int i:input1){
		        if(input3==i){
		            output=1;
		        }
		    }
		    for(int j:input2){
		        if(input3==j){
		            output=2;
		        }
		    }
		    if(output==0||output>2){
		    output=-1;
		    }
		    return output;
	    }

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int output = 0;
	        int ip1_size = 0;
	        ip1_size = Integer.parseInt(in.nextLine().trim());
	        int[] ip1 = new int[ip1_size];
	        int ip1_item;
	        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
	            ip1_item = Integer.parseInt(in.nextLine().trim());
	            ip1[ip1_i] = ip1_item;
	        }
	        int ip2_size = 0;
	        ip2_size = Integer.parseInt(in.nextLine().trim());
	        int[] ip2 = new int[ip2_size];
	        int ip2_item;
	        for(int ip2_i = 0; ip2_i < ip2_size; ip2_i++) {
	            ip2_item = Integer.parseInt(in.nextLine().trim());
	            ip2[ip2_i] = ip2_item;
	        }
	        int ip3 = Integer.parseInt(in.nextLine().trim());
	        output = findTheCulprit(ip1,ip2,ip3);
	        System.out.println(String.valueOf(output));
	        in.close();

	}

}
