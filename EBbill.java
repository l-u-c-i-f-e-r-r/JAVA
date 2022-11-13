import java.util.*;
public class EBbill
{
	public static void main(String[] args) {
	    System.out.println("--------------------------Welcome to EB bill pay counter------------------------------------");
	    Scanner obj=new Scanner(System.in);
	    System.out.println("Enter '1' for domestic '2' for Commercial: ");
	    int type=obj.nextInt();
	   
	   if(type==1){
	       System.out.print("Enter the units: ");
	       int unit=obj.nextInt();
	       double pay=0;
	       if(unit<=100){
	            pay=(unit*1);
	       }
	       else if(unit<=200){
	           pay=100+(100*2.50);
	       }
	       else if(unit<=500){
	           pay=100+250+(300*4);
	       }
	       else{
	           pay=100+250+1200+((unit-500)*6);
	       }
	        System.out.println("The Bill Amount : " + pay);
	   }
	   
	  else if(type==2){
	      System.out.print("Enter the units: ");
	       int unit=obj.nextInt();
	       double pay=0;
	        if(unit<=100){
	            pay=(unit*2);
	       }
	       else if(unit<=200){
	           pay=200+((unit-100)*4.50);
	       }
	       else if(unit<=500){
	           pay=200+450+((unit-200)*6);
	       }
	       else{
	           pay=200+450+1800+((unit-500)*7);
	       }
	        System.out.println("The Bill Amount : " + pay);
	      
	  }
	  else{
	      System.out.println("Invalid Input.");
	  }	
	}
}
