import java.util.*;

public class SumOfMatrices {
	public static void storeValues(int row,int column,String [] array,Scanner sc){
		 int x=0,k=0;
  	  for(int i=0;i<row;i++){
  		  String elements=sc.nextLine();
  		  
  		  for(int j=1;j<elements.length();j++){
  			  if(String.valueOf(elements.charAt(j)).equals(" ")){
  				  array[k]=elements.substring(x,j); //j indicates the index of space
  				  x=j+1;							//x indicates element beginIndex
  				  k++;
  				  
  				  
  			  }
  			    
  		  }
  		  array[k]=elements.substring(x,elements.length()); //since after space we have more elements
  		  k++;												//to allocate next index for array;
			  x=0;												//reset beginIndex
  		  
  	  }
	}
	public static void addElement(int row,int column,int [][] matrix,String [] array){
		int g=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				matrix [i][j]=Integer.parseInt(array[g]);
				g++;
			}
		}
	}
	
	public static int[][] sumOfMatrix(int row,int column,int row2,int column2,int [][] firstMatrix,int [][] secondMatrix){
		int [][] sumMatrix=new int[0][0];
		if(row==row2&&column==column2){
			sumMatrix=new int[row][column];
			for(int r=0;r<row;r++){
				for(int c=0;c<column;c++){
					sumMatrix [r][c]=firstMatrix [r][c]+secondMatrix [r][c];
				}
			}
		}
		else{
			System.out.println("Summing not possible-row and columns of two matrices do not match");
		}
		return sumMatrix;
	}

   public static void main(String [] args){  
   	  Scanner sc=new Scanner(System.in);  
   	  String dimension=sc.nextLine();
   	  int row=Integer.parseInt(dimension.substring(0, 1));
   	  int column=Integer.parseInt(dimension.substring(2,3));
   	  int [][] firstMatrix=new int[row][column];
   	  String [] array=new String[row*column];
   	  storeValues(row,column,array,sc);
   	  addElement(row,column,firstMatrix,array);
   	  
   	  
   	 
   	  String dimension2=sc.nextLine();
   	  int row2=Integer.parseInt(dimension2.substring(0, 1));
   	  int column2=Integer.parseInt(dimension2.substring(2,3));
   	  int [][] secondMatrix=new int[row2][column2];
   	  String [] array2=new String[row2*column2]; 
   	  storeValues(row2,column2,array2,sc);
   	  addElement(row2,column2,secondMatrix,array2);
   	  int [][] sumOfTwoMatrices=sumOfMatrix(row,column,row2,column2,firstMatrix,secondMatrix);
   	  for(int r=0;r<row;r++){
   		  for(int c=0;c<column;c++){
   			  System.out.print(sumOfTwoMatrices[r][c]+" ");
   		  }
   		  System.out.println();
   	  }
   	  
       sc.close();
}
}
