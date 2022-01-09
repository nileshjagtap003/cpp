import java.io.DataInputStream;
class PalindromeNumber
{
public static void main(String arg[])throws Exception
{
int n,s=0,c,r;
DataInputStream d1=new DataInputStream(System.in);
System.out.println("Enter the Number");
n=Integer.parseInt(d1.readLine());
c=n;
while(n>0)
{
	r=n%10;
	s=(s*10)+r;
	n=n/10;
}
if(c==s)
{
}
else	System.out.println("Number is Palindrome");

{
	
}

}
}