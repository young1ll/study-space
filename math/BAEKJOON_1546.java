import java.util.Scanner;

public class BAEKJOON_1546 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.nextLine();//Clean Scanner Buffer
		
		String[] b = new String[a];
		b = sc.nextLine().split(" ");
		if(b.length != a) return;
		sc.close();
		
		double max=0.00;
		
		double[] arr = new double[b.length];
		for(int i=0; i < a; i++) {
			arr[i] = Integer.parseInt(b[i]);
			max = arr[i] > max ? arr[i] : max;
		}
		
		double sum=0;
		for(int i=0; i<a; i++) {
			arr[i] = Math.round((arr[i]/max)*10000)/100.0;
			sum += arr[i];
		}
		//double avg = Math.round(sum/a*100)/100.0;
		double avg = sum/a;
		
		System.out.println(avg);
		
	}
}
