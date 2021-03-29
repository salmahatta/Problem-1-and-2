import java.util.Scanner;
public class ProcessAName5026201046 {
	public static void main(String[] args){

		Scanner jarvis = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String first = jarvis.nextLine();

		System.out.print("Enter your last name: ");
		String last = jarvis.nextLine();		

		String name = last+","+first.substring(0,1)+".";
		
		System.out.println(name);
	}
}