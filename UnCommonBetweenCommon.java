import java.util.*;
public class UnCommonBetweenCommon {

	
	public static String uncommonBetweenCommon(int [] input1,int [] input2){
		int [] combined=new int[input1.length+input2.length];
		int i=0,j=0;
		for(int l=0;l<combined.length;l++){
			if(i<input1.length){
				combined[l]=input1[i];
				i++;
			}
			else if(j<input2.length){
				combined[l]=input2[j];
				j++;
			}
		}
		int count=0,dollarCount=0,g=1;
		List<Integer> unique=new ArrayList<Integer>();
		
		String output="";
		for(int m=0;m<combined.length;m++){
			int a=combined[m];
			for(int n=0;n<combined.length;n++){
				int b=combined[n];
				if(a!=b){
					
					count++;
					}
			}
			 if(count==combined.length-1){
		            unique.add(a);
		        }
			count=0;
			
		}
		Integer [] out=unique.toArray(new Integer[unique.size()]);
		int x=0;
		do{
			if(x==unique.size()-1){
				output+=out[x];
			}
			else{
				output+=out[x]+"$";
			}
			x++;
		}while(x<unique.size());
		
		return output;
		
		
		
	}
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
        String output;
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
        output = uncommonBetweenCommon(ip1,ip2);
        System.out.println(String.valueOf(output));
        in.close();
	}
}
