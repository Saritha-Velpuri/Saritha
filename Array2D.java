class Array2D
{
	public static void main(String[] args) 
	{
	int a[]={2,3,4,5};
	int b[]={3,4,5,6};
	int c[]={4,5,6,7};
	int x[][]={
	           {2,3,4,5},
	           {3,4,5,6},
	           {4,5,6,7}
        	  };
    for(int i=0;i<3;i++)
    {
    for(int j=0;j<4;j++)
    {
        System.out.print(x[i][j] + " ");
    }
    System.out.println(" ");
    }
   
	}
}