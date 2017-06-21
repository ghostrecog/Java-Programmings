import java.util.*;
public class CaseBased {
	 public static boolean title(String input1)
	    {
		    boolean isCaseBased=false;
		    
		    List<Integer> space=new ArrayList<Integer>();
		    
		    for(int i=0;i<input1.length();i++){
		    	if(String.valueOf(input1.charAt(i)).equals(" ")){
		    		space.add(i);
		    		}
		    }
		    
		  Integer [] array=space.toArray(new Integer[space.size()]);
		  int k=0;
		  do{
			
			  if(!String.valueOf(input1.charAt(0)).matches("[A-Z]+")){
			    	isCaseBased=false;
			    }
			  else if(String.valueOf(input1.charAt((array[k])+1)).matches("[A-Z]+")){
				  isCaseBased=true;
				  
			  }else{
				  isCaseBased=false;
				  break;
			  }
			  k++;
		  }while(k<array.length);
		  
		    
		    return isCaseBased;
		    
	    }

	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
        boolean output;
        String ip1 = in.nextLine().trim();
        output = title(ip1);
        System.out.println(String.valueOf(output ? 1 : 0));
        title(ip1);
        in.close();
	}
}
