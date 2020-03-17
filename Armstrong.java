class Armstrong{  
  public static void main(String[] args)  {  
    int sum=0,r,temp;  
    int n=371;
    temp=n;  
    while(n>0)  
    {  
    r=n%10;  
    n=n/10;  
    sum=sum+(r*r*r);  
    }  
    if(temp==sum)  
    System.out.println("armstrong number");   
    else  
    System.out.println("Not armstrong number");   
   }  
}  