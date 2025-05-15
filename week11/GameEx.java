package week11;

public class GameEx {

	public static void main(String[] args) {
		// String[] name = new String[3];
		Game[] game = new Game[3];
		game[0] = new LOL("롤", "13.0");  // 자동타입 변환
		game[1] = new Tetris("테트리스", "12.5");
		game[2] = new SuperMario("슈퍼마리오", "15.1");
		
		for(int i=0; i<game.length; i++) {
			game[i].start();
			game[i].gameDesc();
			System.out.println("-----");
		}
		
		System.out.println();
		System.out.println("향상된 for 문 이용");
		System.out.println();
		// 향상된 for문 이용
		for(Game g : game) {
			g.start();
			g.gameDesc();
			System.out.println("-----");
		}
	}

}

// 출력
// 제목 : 롤
// 버전 : 13.0
// 롤 게임을 시작합니다.
// LOL은 세계 최고의 MOBA 게임입니다.
// -----
// 제목 : 테트리스
// 버전 : 12.5
// 테트리스 게임을 시작합니다.
// 테트리스는 퍼즐 게임으로, 소련의 개발자가 처음 디자인하고 프로그래밍한 게임이다.
// -----
// 제목 : 슈퍼마리오
// 버전 : 15.1
// 슈퍼마리오 게임을 시작합니다.
// 닌텐도의 대표 비디오 게임 시리즈인 마리오 시리즈의 핵심이 되는 본가 시리즈 게임
// -----

// 향상된 for 문 이용

// 제목 : 롤
// 버전 : 13.0
// 롤 게임을 시작합니다.
// LOL은 세계 최고의 MOBA 게임입니다.
// -----
// 제목 : 테트리스
// 버전 : 12.5
// 테트리스 게임을 시작합니다.
// 테트리스는 퍼즐 게임으로, 소련의 개발자가 처음 디자인하고 프로그래밍한 게임이다.
// -----
// 제목 : 슈퍼마리오
// 버전 : 15.1
// 슈퍼마리오 게임을 시작합니다.
// 닌텐도의 대표 비디오 게임 시리즈인 마리오 시리즈의 핵심이 되는 본가 시리즈 게임
// -----
