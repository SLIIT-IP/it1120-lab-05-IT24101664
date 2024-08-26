import java.util.Scanner;
public class  IT24101664Lab5Q3{

public static void main(String[] args){

	Scanner input=new Scanner(System.in);

final double Roomcharge = 48000;

final double discountfor3or4days = 10.0/100.0;

final double discountmorethan5days = 20.0/100.0;


 double startdate,enddate;

System.out.println("Enter the start date(1-31)");
startdate=input.nextDouble();

System.out.println("Enter the end date(1-31)");
enddate=input.nextDouble();

if(startdate<1 || startdate>31|| enddate<1 || enddate>31){

	System.out.println("Error:Days must be between 1 and 31");
return;}

if(startdate>=enddate){

	System.out.println("start date must be less than end date");
return;}

System.out.println("Room charge per day:" + Roomcharge);

double reserved_days=enddate-startdate;

System.out.println("number of days reserved:" + reserved_days);

if(reserved_days>=3 && reserved_days<=4){

System.out.println("total amount to be paid:"  +  Roomcharge*reserved_days*discountfor3or4days);}


else if(reserved_days>=5 && reserved_days<=31 ){
System.out.println("total amount to be paid:"  +  Roomcharge*reserved_days*discountmorethan5days );}


else if(reserved_days<3 && reserved_days>0){
System.out.println("total amount to be paid"  +   Roomcharge*reserved_days);}

}
}







