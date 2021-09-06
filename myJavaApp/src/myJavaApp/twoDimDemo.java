package myJavaApp;

public class twoDimDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x[][]=new int[][]{{1,2,3},{5,6,7},{8,4,3}};

		for (int row=0;row<x.length;row++)
		{
			for(int col=0;col<x.length;col++)
			{
				System.out.print(x[row][col]+ " ");
				
			}
			System.out.println();
		}
		
		
	}

}
