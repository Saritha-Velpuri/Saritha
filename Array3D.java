class Array3d
{
	public static void main(String[] args) {
	    int x[] = new int[5];
	    int y[][] = new int[4][4];
	    int z[][][] = new int[4][4][4];
	    for(int i=0;i<4;i++)
	    {
	        for(int j=0;j<4;j++)
	        {
	            for(int k=0;k<4;k++)
	            {
	                z[i][j][k] = i+j+k;
	            }
	        }
	    }
		for(int i=0;i<4;i++)
	    {
	        for(int j=0;j<4;j++)
	        {
	            for(int k=0;k<4;k++)
	            {
	               System.out.print(" " + z[i][j][k]);
	            }
	        }
	    }
	}
}