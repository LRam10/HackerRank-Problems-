//Luis Ramirez
// nonrecursive factorial
import java.util.Scanner;
public class Factorial {
	
public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int Num,Fact;
System.out.print("Enter an non-negative number:");
Num = scan.nextInt();
Fact = 1;
while(Num < 0){
System.out.println("Negative numbers are not allowed");
System.out.print("Try again:");
Num = scan.nextInt();
}
while (Num > 0)
{
	//Ex : 1*5(5)=> 5*4(20)=>20*3(60)=>60*2(120) 120*1=120
	Fact*=Num;
	Num--;
}

System.out.println(Num + "!=");
System.out.println(Fact);
}

}
