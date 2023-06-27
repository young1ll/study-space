public class BAEKJOON_4673 {
	public static void main(String[] args) {
		int end = 10000;
		boolean[] checker = new boolean[end+1];
		
		for(int i=1; i<=end; i++) {
			int dn = selNum(i);
			if(dn <= end ) checker[dn] = true;
		}
		for(int i=1; i<=end; i++) {
			if(!checker[i])
			System.out.println(i);
		}
	}
	
	public static int selNum(int N) {
		String temp = Integer.toString(N);
		int selfNumber = N;			
		for(int i=0; i<temp.length(); i++) {
			selfNumber += temp.charAt(i)-'0'; 
		}
		return selfNumber;
	}
}

/*
 * 생각보다 간단한 문제다.
 * 복잡하게 생각하면 Dn을 구하는 메서드 외에 검사기와 출력기의 메서드를 모두 따로 만들던지,
 * 모두 하나의 메서드에 넣고, main에는 메서드만 남겨두던지 하는 방법을 생각해볼 수 있다.
 * 
 * 그러나 메서드는 Dn만 반환하고 main에서 검사와 출력을 실행시켜 간단하게 해결할 수 있다.
 */