import java.util.*;
/**
 * This program is about you'll be given five arguments,first represent start range ,second represents end range of first data.
 * similarly third represent start range,fourth represents end range of second data. You need to find the fifth argument is 
 * present in either first data or second data. if it is in first return 1, else return 2.
 */

public class SearchInRange {

	 public static int searchInTheRange(int input1,int input2,int input3,int input4,int input5)
	    {
		    int output=0;
		    for(int i=input1;i<=input2;i++){
		    	if(input5==i){
		    		output=1;
		    	}
		    }
		    for(int j=input3;j<=input4;j++){
		    	if(input5==j){
		    		output=2;
		    	}
		    }
		   
			   
		    return output;
	    }
	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3 = Integer.parseInt(in.nextLine().trim());
        int ip4 = Integer.parseInt(in.nextLine().trim());
        int ip5 = Integer.parseInt(in.nextLine().trim());
        output = searchInTheRange(ip1,ip2,ip3,ip4,ip5);
        System.out.println(String.valueOf(output));
        in.close();

	}

}
