package Java.OOPS.Zz_ObjectOrientedProgramming;

public class HeadphonesMain {

	public static void main(String[] args) {
		
		Headphones h = new Headphones();
		
		System.out.println(h.charge);
		System.out.println(h.color);
		System.out.println(h.controls[2]);
		
		System.out.println(h.power);
		h.powerOn();
		System.out.println(h.power);
		h.powerDown();
		System.out.println(h.power);
		
		System.out.println(h.volume);
		h.volumeUp();
		System.out.println(h.volume);
		h.volumeUp();
		System.out.println(h.volume);
		h.volumeDown();
		System.out.println(h.volume);
	}

}
