import java.util.*;
public class FirstUnrepeatedCharacter {
	 public static String FirstUnrepeatedCharacter(String input1)
	    {
		    String value=null;
		    int count=0,k=0;
		    String [] output=new String [input1.length()];
		   for(int i=0;i<input1.length();i++){
			   value=String.valueOf(input1.charAt(i));
			   for(int j=0;j<input1.length();j++){
				   if(value.equals(String.valueOf(input1.charAt(j)))){
					   count++;
				   }
			   }
			   
			   if(count==1){
				   output[k]=String.valueOf(input1.charAt(i));
				   k++;
				   
			   }
			   count=0;
		   }
		   value=String.valueOf(output[0]);
		    
		    return value;
	    }
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
        String output;
        String ip1 = in.nextLine().trim();
        output = FirstUnrepeatedCharacter(ip1);
        System.out.println(String.valueOf(output));
        in.close();
	}
}
