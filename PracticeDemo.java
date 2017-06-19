
import java.util.*;
public class PracticeDemo {  
    

    public static void main(String [] args){  
    	  Scanner sc=new Scanner(System.in);  
    	  String arraySize=sc.nextLine();  
          int size=Integer.parseInt(arraySize);  
          String arrayValues=sc.nextLine();  
          String [] array=new String[size];
          int x=0,j=0;
          
           for(int i=0;i<arrayValues.length();i++){
        	   if(String.valueOf(arrayValues.charAt(i)).equals(" ")){
        	  array[j]=arrayValues.substring(x,i);
        	  x=i+1;
        	  j++;
        	   }
          }
           array[j]=arrayValues.substring(x,arrayValues.length());
           int l=0,k=0;
           String [] sorted=new String[size];
           String [] supported=new String [size];
           for(int m=0;m<size;m++){
        	   int a=Integer.parseInt(array[m]);
        	   for(int n=m+1;n<size;n++){
        		   int b=Integer.parseInt(array[n]);
        		   if(a>b){
        			   sorted[l]=String.valueOf(m);   //saving initial index of array to be sorted
        			   supported[k]=String.valueOf(n); //saving final index of array to be sorted
        			   l++;
        			   k++;
        		   }
        	   }
           }
           int startIndex=0,endIndex=0;
           startIndex=Integer.parseInt(sorted[0]); //Initial index to copy from original array
           int largest=Integer.parseInt(supported[0]);
           for(int v=1;v<k;v++){
        	   if(Integer.parseInt(supported[v])>largest)
        		   largest=Integer.parseInt(supported[v]);
           }
           endIndex=largest+1;                     //final index to copy from original array
           String [] freshArray=Arrays.copyOfRange(array, startIndex, endIndex);
           for(int w=0;w<freshArray.length;w++){
        	   System.out.print(freshArray[w]+" ");
           }
        sc.close();
}
}
