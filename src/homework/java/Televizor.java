package homework.java;

import java.util.HashMap;
import java.util.Map;

public class Televizor {
       private boolean isOn;
       private int volume;
       private Map <Integer, String>channels = new HashMap <Integer, String>();
       private Integer currentChannel;
      

      
       
	public Integer getCurrentChannel() {
		if (!isOn) {
			throw new RuntimeException ("Tv je ugasen");
		}
		if (currentChannel >30) {
  		  throw new RuntimeException ("Nema vise kanala");
		}
		return currentChannel;
	}
	public void setCurrentChannel(Integer currentChannel) {
		if (!isOn) {
			throw new RuntimeException ("Tv je ugasen");
		}
		if (currentChannel >30) {
  		  throw new RuntimeException ("Nema vise kanala");}
		this.currentChannel = currentChannel;
	}
	public boolean isOn() {
		if (!isOn) {
			throw new RuntimeException ("Tv je ugasen");
		}
		return isOn;
	}
	public void setOn(boolean isOn) {
		if (!isOn) {
			throw new RuntimeException ("Tv je ugasen");
		}
		this.isOn = isOn;
	}
	public int getVolume() {
		if (!isOn) {
			throw new RuntimeException ("Tv je ugasen");
		}
		return volume;
	}
	public void setVolume(int volume) {
		if (!isOn) {
			throw new RuntimeException ("Tv je ugasen");
		}
		this.volume = volume;
	}
	public Map<Integer, String> getChannels() {
		if (!isOn) {
			throw new RuntimeException ("Tv je ugasen");
		}
		return channels;
	}
	public void setChannels(Map<Integer, String> channels) {
		if (!isOn) {
			throw new RuntimeException ("Tv je ugasen");
		}
		this.channels = channels;
	}
	public void increaseVolume (int input) {
		if (!isOn) {
			throw new RuntimeException ("Tv je ugasen");
		}
		volume =  input +1;
   if (volume > 30) {
	   throw new RuntimeException ("Max volumen dostigut");
   }
	}
	
	public void decreaseVolume (int input) {
		if (!isOn) {
			throw new RuntimeException ("Tv je ugasen");
		}
		volume = input -1;
		if (volume < 0) {
			   throw new RuntimeException ("Min volumen dostigut");
		   }
	
	}
}