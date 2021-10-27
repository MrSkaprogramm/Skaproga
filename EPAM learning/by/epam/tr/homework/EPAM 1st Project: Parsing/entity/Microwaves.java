public class Microwaves {
	private String cameracover;
	private String functionality;
	private int power;
	private int volume;
	
	public Microwaves(String cameracover, String functionality, int power, int volume) {
		this.cameracover = cameracover;
		this.power = power;
		this.volume = volume;
		this.functionality = functionality;
	}
	
	public String getCameracover(){
		return cameracover;
	}
	
	public int getPower(){
		return power;
	}
	
	public int getVolume(){
		return volume;
	}
	
	public String getFunctionality(){
		return functionality;
	}
	
	@Override
	public String toString(){
		return "Root{" +
				"cameracover='" + cameracover + '\'' + 
				" +, power=" + power + 
				'}';
	}
}
