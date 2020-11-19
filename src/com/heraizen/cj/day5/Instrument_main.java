package com.heraizen.cj.day5;

public class Instrument_main {

	public static void main(String[] args) {
		Instrument i[]= {new piano(),new Guitar(),new Flute(),new Guitar(),new Flute(),new piano(),new Guitar(),new piano(),new Flute(),new piano()};
		
		for(Instrument arr : i)
		{
			arr.play();
		}

	}

}
