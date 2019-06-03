import.java.util.*;
class ReverseNumber
{
public void main(string args[])
{
int no=423,rem,rev=0;
while(no!=0)
{
rem=no%10;
rev=rev*10+rem;
no=no/10;
}
system.out.println(rev);
}
}
