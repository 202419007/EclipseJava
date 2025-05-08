package week10;

public class GameEx {

	public static void main(String[] args) {
		LOL lGame = new LOL("롤", 13.0);
		System.out.println("제목 : " + lGame.getTitle());
		System.out.println("버전 : " + lGame.getVersion());
		System.out.printf("롤");
		lGame.start();
		lGame.lolDesc();
		
		System.out.println();
		Tetris tGame = new Tetris("테트리스", 12.5);
		System.out.println("제목 : " + tGame.getTitle());
		System.out.println("버전 : " + tGame.getVersion());
		System.out.printf("테트리스");
		tGame.start();
		tGame.tetrisDesc();
		
		System.out.println();
		SuperMario sGame = new SuperMario("슈퍼마리오", 15.1);
		System.out.println("제목 : " + sGame.getTitle());
		System.out.println("버전 : " + sGame.getVersion());
		System.out.printf("슈퍼마리오");
		sGame.start();
		sGame.marioDesc();
	}

}

// 출력
// 제목 : 롤
// 버전 : 13.0
// 롤게임을 시작합니다.
// 리그 오브 레전드는 세계 최고의 MOBA(Multiplayer Online Battle Arena) 게임입니다.

// 제목 : 테트리스
// 버전 : 12.5
// 테트리스게임을 시작합니다.
// 테트리스(Tetris)는 퍼즐 게임으로, 소련의 프로그래머 알렉세이 파지트노프가 처음 디자인하고 프로그래밍 한 게임이다.

// 제목 : 슈퍼마리오
// 버전 : 15.1
// 슈퍼마리오게임을 시작합니다.
// 닌텐도의 대표 비디오 게임 시리즈인 마리오 시리즈의 핵심이 되는 본가 시리즈.
