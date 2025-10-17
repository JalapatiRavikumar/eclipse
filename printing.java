package arrays;

public class printing {
	
	public static void main(String[] args)
	{
		int[][][][] a={{{{10,20,30},{40,50} } } }; 
		for(int i=0; i<a.length; i++)
			{
				for(int j=0; j<a[i].length; j++)
				{
						for(int k=0; k<a[i][j].length; k++)
						{
								for(int I=0; I<a[i][j][k].length; I++)
								{
									System.out.print(a[i][j][k][I]+" ");
								}
								System.out.println();
						}
				}
			}
		}
	}


