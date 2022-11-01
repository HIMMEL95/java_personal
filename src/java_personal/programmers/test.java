package java_personal.programmers;

public class test {
	
	public static void main(String[] args) {
		solution(13,17);
		System.out.println("test : " + solution(13, 17));
	}
	
	 public static int solution(int left, int right) {
	        int answer = 0;
	        
	        for (int i=left; i<=right; i++) {
	        	int count = 0;
	            for (int j = 1; j<=i; j++) {
	                if (i % j == 0) {
	                    count++;
	                    System.out.println(count);
	                }
	            }
	            if (count % 2 == 0) {
	                answer += i;
	                System.out.println(answer);
	            } else {
	                answer -= i;
	                System.out.println(answer);
	            }
	        }
	        return answer;
	    }
}

