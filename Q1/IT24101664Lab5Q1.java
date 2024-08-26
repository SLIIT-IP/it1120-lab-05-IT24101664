import java.util.Scanner;
public class  IT24101664Lab5Q1{
	public static void main(String[] args){

	Scanner input=new Scanner(System.in);
int num1,num2,num3;

	System.out.println("Enter the first intiger");
	num1=input.nextInt();
	
	

	System.out.println("Enter the second intiger");
        num2=input.nextInt();

	System.out.println("Enter the third integer");
	num3=input.nextInt();


	System.out.println("user entered numbers are:" + num1 + " " + num2 + " " + num3);

if(num1>num2 && num1>num3){
System.out.println("The largest number is:" + num1);
if(num2>num1 && num2>num3){
System.out.println("The largest number is:" + num2);}
else if(num3>num1 && num3>num2){
System.out.println("The largest number is:" + num3);}

else if(num1<num2 && num1<num3){
System.out.println("The smallest number is:" + num1);}
else if(num2<num1 && num2<num3){
System.out.println("The smallest number is:" + num2);}
else if(num3<num1 && num3<num2){
System.out.println("The smallest number is:" + num3);}

}
}
}







