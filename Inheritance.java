class Inheritance
{
public static void main(String[] args)
{
AddSub obj = new AddSub();
obj.num1 = 2;
obj.num2 = 6;
obj.Sum();
System.out.println(obj.result);
obj.Sub();
System.out.println(obj.result);
}
}
class Add
{
    int num1,num2,result;
    public void Sum()
    {
        result = num1+num2;
    }
}
class AddSub extends Add
{
    public void Sub()
    {
        result = num1-num2;
    }
}