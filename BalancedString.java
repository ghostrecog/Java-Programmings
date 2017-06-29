import java.util.*;
public class BalancedString {   //A string is called balanced string if it has equal number of open and close braces('{' '}')
	 public static int balancedStringOrNot(String input1)
	    {
		    int openCount=0,closeCount=0,output=0;
		    if(input1.contains("{")&&input1.contains("}")){
		        openCount++;
		        closeCount++;
		    }
		    
		    if(openCount!=0&&openCount==closeCount){
		        output=1;
		    }
		    else
		    output =-1;
		    
		    return output;
	    }
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
        int output = 0;
        String ip1 = in.nextLine().trim();
        output = balancedStringOrNot(ip1);
        System.out.println(String.valueOf(output));
        in.close();
	}
}
