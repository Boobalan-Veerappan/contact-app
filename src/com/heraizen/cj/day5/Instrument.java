package com.heraizen.cj.day5;

public interface Instrument {
void play();

}

 class piano implements Instrument{

	@Override
	public void play() {
		
		System.out.println("Piano is playing pee peee peee");
	}
	
}
 class Flute implements Instrument{

	@Override
	public void play() {
		
		System.out.println("Flute is playing toot toot toot toot");
	}
	
}
 class Guitar implements Instrument{

		@Override
		public void play() {
			
			System.out.println("Guitar is playing tin tin tin tin");
		}
		
	}
