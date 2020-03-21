class Strings
{
public static void main(String[] args) {
   String name="string";
   String name1=new String("strings");
   System.out.println(name);
   System.out.println(name1);
   System.out.println(name1.length());
   System.out.println(name.toUpperCase());
   System.out.println(name.concat(name1));
   if(name.equals(name1))
   {
       System.out.println("equals");
   }
   else
   {
       System.out.println("not equals");
   }

}
}