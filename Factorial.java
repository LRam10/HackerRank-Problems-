//Luis Ramirez
import java.util.Scanner;
public class Factorial {
	
public static void main(String[]args){
//Scanner object
Scanner scan = new Scanner(System.in);
int Num,Fact;
System.out.print("Enter an non-negative number:");
//Receive input from user
Num = scan.nextInt();
Fact = 1;
//while the number is less or equal than zero we ask user to input a valid number
while(Num <=0){
System.out.println("Negative numbers are not allowed");
System.out.print("Try again:");
Num = scan.nextInt();
}
//We calculate the total
while (Num > 0)
{
//ex:5 = 1*5(5) 4*5(20) 20*3(60) 60*2(120) 120*1=120 
	Fact*=Num;
	Num--;
}
//prints value
System.out.println(Num + "!=");
System.out.println(Fact);
}

}
