import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	

		System.out.println("Input two number: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int fa = 1;
		
		for(int i=1;i<=a; i++){
			fa=fa*i;
		}
		int fb=1;
		
		for(int i=1;i<=b;i++){
			fb=fb*i;
			
		}
		System.out.println((double)fa/(double)fb);
		
	}
	
}
