import java.util.*;
public class SumOfMatrixRow {
    
    
	public static void addElements(int row,int column,String [] array,Scanner sc){
		int x=0,k=0;
		for(int i=0;i<row;i++){
			String elements=sc.nextLine();
			for(int j=1;j<elements.length();j++){
				if(String.valueOf(elements.charAt(j)).equals(" ")){
					array[k]=elements.substring(x,j);
					x=j+1;										
					k++;
				}
			}
			array[k]=elements.substring(x,elements.length());
			k++;
			x=0;
		}
	}
    public static void storeValuesInMatrix(int row,int column,String [] array,int [][] matrix){
        int g=0;
        for(int a=0;a<row;a++){
            for(int b=0;b<column;b++){
                matrix [a][b]=Integer.parseInt(array[g]);
                g++;
            }
        }
    }
   public static void main(String args[] ){
    Scanner sc=new Scanner(System.in);
	String dimension=sc.nextLine();
	int row=Integer.parseInt(dimension.substring(0,1));
	int column=Integer.parseInt(dimension.substring(2,3));
	int [][] matrix=new int [row][column];
	String [] array=new String[row*column];
	addElements(row,column,array,sc);
	storeValuesInMatrix(row,column,array,matrix);
	int sumOfRow=0;
	int [] matrixRowSum=new int[row];
	int l=0;
	for(int i=0;i<row;i++){
	    for(int j=0;j<column;j++){
	        sumOfRow+=matrix[i][j];
	        
	    }
	    matrixRowSum[l]=sumOfRow;
	    sumOfRow=0;
	    l++;
	}
	int largest=matrixRowSum[0];
	int smallest=matrixRowSum[0];
	int rowCount=0;
	for(int k=1;k<row;k++){
	    if(matrixRowSum[k]>largest){
	        largest=matrixRowSum[k];
	        rowCount=k;
	    }
	    else if(matrixRowSum[k]<smallest){
	        smallest=matrixRowSum[k];
	    }
	}
	if(largest==smallest){
	    System.out.print("Equal");
	}
	else{
	    System.out.print("Row "+(rowCount+1));
	}
	sc.close();

   }
}
