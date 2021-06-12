import java.util.Scanner;
class Concatation_Number
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter 2 numbers:");
int a = s.nextInt();
int b = s.nextInt();
 
String s1 = Integer.toString(a);
String s2 = Integer.toString(b);
String s3 = s1 + s2;
System.out.println(s3);
String j = s3+s3;
System.out.println(j);
                                             // string addition is like
                                             // abc+abc = abcabc
int c = Integer.parseInt(s3);
System.out.println(c);
int f = c+c;
System.out.println(f);
}
}