class JaggedArray
{
	public static void main(String[] args) 
	{
	int a[]={2,3,4,5};
	int b[]={3,4,5};
	int c[]={4,5};
	int x[][]={
	           {2,3,4,5},
	           {3,4,5},
	           {4,5}
        	  };
        	  int y[][]= new int[3][];
        	  y[0]= new int[4];
        	  y[1]= new int[3];
        	  y[2]= new int[2];
    for(int i[] : x)
    {
    for(int j : i)
    {
        System.out.print(j + " ");
    }
    System.out.println(" ");
    }
   
	}
}