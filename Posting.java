
public class Posting {

	public static void main(String [] args){
		int[][] table = new int[4][4];


		for(int row=0; row<table.length; row++) {
			System.out.print(row+" ");
			
		for(int col=1; col<table[row].length; col++){
			if(row!=0)
		System.out.print(row*col+" ");
			else
				System.out.print(col+" ");
			

		}
		System.out.println();
		}


		
	}
}
