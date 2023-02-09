package java_personal.programmers;

public class test {
	
	public static void main(String[] args) {
		System.out.println("test : " + solution(50000000000000l));
	}
	

    public static long solution(long n) {
        long answer = 0;
        
        for (long i=0; i<n/2; i++) {
            if (Math.pow(i, 2) == n) {
                answer = (long)Math.pow(i+1, 2);
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}
