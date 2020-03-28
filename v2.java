import java.util.Scanner;
public class Main
{
 public static void main(String[] args)
 {
  Scanner myObj= new Scanner(System.in);
   String name, city;
   char sex;
   byte age;
   float height;
   boolean married;
    double pop;
   name=myObj.nextLine();
    city= myObj.nextLine();
    age= myObj.nextByte();
    height= myObj.nextFloat();
    married= myObj.nextBoolean();
    sex= myObj.next().charAt(0);
    pop = myObj.nextDouble();
   System.out.println("Name:" + name);
   System.out.println("\nCity:" + city);
   System.out.println("\nAge:" + age);
   System.out.println("\nHeight:" + height);
   System.out.println("\nMarried:" + married);
   System.out.println("\nSex:" + sex);
   System.out.println("\nCity Population:" + pop);
 }
}
