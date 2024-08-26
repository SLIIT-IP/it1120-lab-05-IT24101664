import java.util.Scanner;
public class  IT24101664Lab5Q2{

public static void main(String[] args){

	Scanner input=new Scanner(System.in);
 int members;

System.out.println(" input the number of new members introduced");
members=input.nextInt();

if(members<0){
	System.out.println("input mus be anumber 0 or greater");}



switch(members){

	case 0: System.out.println("no prize");
	break;

	case 1: System.out.println("Pen");
	break;

	case 2:System.out.println("umbrella");
	break;

	case 3: System.out.println("bag");
	break;

	case 4: System.out.println("travelling chair");
	}

     
	 if(members>=5){

	System.out.println("headphone");}
}
}