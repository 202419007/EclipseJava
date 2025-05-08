package week10;

public class SonicAirPlane extends AirPlane{
	// 비행 모드 초기화 설정
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	private int soundSpeed;
	private int MaxSpeed;
	
	// 부모 메소드를 재정의 : 부모 메소드 무효화
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC)
			System.out.println("음속비행합니다.");
		else
			super.fly();
	}
	
	
	public int getSoundSpeed() {
		return soundSpeed;
	}
	public void setSoundSpeed(int soundSpeed) {
		this.soundSpeed = soundSpeed;
	}
	public int getMaxSpeed() {
		return MaxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		MaxSpeed = maxSpeed;
	}
	
	
}
