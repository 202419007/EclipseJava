package week3;

public class ScoreCalculator {

	public static void main(String[] args) {
		int score = 50;  // 초기 점수
		System.out.println("초기 점수: " + score);
		
		score += 10;  // 정답 맞춤
		System.out.println("정답 보너스 (+10): " + score);
		
		score -= 5;  // 오답
		System.out.println("오답 감점 (-5): " + score);
		
		score *= 2;  // 보너스 문제 정답
		System.out.println("보너스 문제 정답 (x2): " + score);
		
		score++;  // 추가 점수 획득
		System.out.println("추가 점수 (+1): " + score);
		
		score--;  // 감점
		System.out.println("감점 (-1): " + score);
		
		System.out.println("최종 점수: " + score);
	}

}
