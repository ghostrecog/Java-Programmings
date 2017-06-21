import java.util.*;
public class GreatestCommonDivisor {

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int x=0,firstElement=0,secondElement=0;
		for(int i=0;i<input.length();i++){
			if(String.valueOf(input.charAt(i)).equals(" ")){
				firstElement=Integer.parseInt(input.substring(x,i)); //first number
				x=i+1;
				
			}
		}
		secondElement=Integer.parseInt(input.substring(x,input.length()));//second number
		int divisor=2,largest=0,gcd=1;
		if(firstElement>secondElement)
			largest=firstElement; //find which one of them is largest
		else
			largest=secondElement;
		do{
			if(firstElement%divisor==0&&secondElement%divisor==0){
				gcd=divisor;
			}
			divisor++;
		}while(divisor<=largest);
		System.out.println(gcd);
		sc.close();
	}
}
