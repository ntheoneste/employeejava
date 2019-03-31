package work;
import java.util.*;
public class emp {
	public int type;
	public int gross;
	public int rssb;
	public int net;
	public int salary;
	public int tax;
	public String name;
	public int hour;

	public static class month extends emp{
		public void emp1()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter salary per month");
			salary=in.nextInt();
			
		tax= (salary*30)/100;
		rssb=(salary*3)/100;
		net=salary-(tax+rssb);
		
		
		}
		
		
	}
	public static class week extends emp{
		public void emp2(){
			System.out.println("Enter salary per week");
			Scanner in = new Scanner(System.in);
			salary=in.nextInt();
			net=salary;
			
		}
	}
	public static class hour extends emp{
		
	public  int emp3(){
		System.out.println("Please enter number of hours");
		Scanner in = new Scanner(System.in);
		hour = in.nextInt();
		System.out.println("Please enter salary per hours");
		salary = in.nextInt();
		
		if(hour<=40){
		return(net = hour*salary);
		
		}
		else{
			return(net=(hour*salary)+((40-hour)*salary));
			
			
		}
	}
	}


	
	public  static void main(String[] args) {
		
		hour b = new hour();
        week c=new week();
        month d=new month();
		System.out.println("Please enter employee name:");
		Scanner in = new Scanner(System.in);
      b.name=in.nextLine();
        System.out.println("Please select type of emp according to type:");
        System.out.println("............................................gnt");
        System.out.println("1.month,2.weekly,3.hour");
        b.type=in.nextInt();
        System.out.println("name is "+b.name);
		if(b.type==1)
		{
			d.emp1();
			System.out.println("Salary is: "+d.net);
			
		}
		else if(b.type==2){
			c.emp2();
			System.out.println("Salary is: "+c.net);
		}
		else if(b.type==3){
		    b.emp3();
			System.out.println("Salary is: "+b.net);
			
		}
		else{
			System.out.println("Invalid type!");
		}
                
		
		}
	
}
