package week10;

public class Game {
	private String title;
	private double version;
	
	public Game(String title, double version) {
		this.title = title;
		this.version = version;
	}
	
	public void start() {
		System.out.println("게임을 시작합니다.");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}
}
