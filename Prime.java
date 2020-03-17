class Prime 
{

    public static void main(String[] args) 
   {

        int n = 36;
        boolean isPrime = false;
        for(int i = 2; i <= n/2; ++i)
        {
            
            if(n % i == 0)
            {
               isPrime = true;
                break;
            }
        }

        if (!isPrime)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}