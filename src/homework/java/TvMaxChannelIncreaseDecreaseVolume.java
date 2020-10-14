package homework.java;

public class TvMaxChannelIncreaseDecreaseVolume {

	public static void main(String[] args) {
		Televizor televizor = new Televizor ();
		televizor.setOn(true);
		 televizor.getChannels();
		 televizor.getChannels().put(1,"Pink");
		 televizor.getChannels().put(2,"Prva");
		 televizor.getChannels().put(3,"Posebna");
		 televizor.setCurrentChannel(29);
         televizor.increaseVolume(15);
         //televizor.increaseVolume();
         //televizor.increaseVolume();
         televizor.decreaseVolume(3);
         //televizor.decreaseVolume();
         //televizor.decreaseVolume();
         //televizor.decreaseVolume();
         System.out.println(televizor.getVolume());
         System.out.println (televizor.getChannels ());
         System.out.println (televizor.getChannels().get(televizor.getCurrentChannel()));
	  
	}
	

}
