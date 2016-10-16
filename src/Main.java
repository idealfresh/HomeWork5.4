import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	

		System.out.println("Input two number: ");
		int N = scan.nextInt();
		int K = scan.nextInt();
		int aN = 1;
		int aK=1;
		
		for(int i=1;i<=N; i++){
			aN=aN*i;
		}
			
		for(int i=1;i<=K;i++){
			aK=aK*i;
			
		}
		System.out.println((double)aN/(double)aK);
		
	}
	
}
