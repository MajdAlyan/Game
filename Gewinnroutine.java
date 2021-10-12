package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Gewinnroutine {
Timer time;
	public Gewinnroutine() {
		time = new Timer ();
		time.scheduleAtFixedRate(new TimerTask(){
			
			
			public void run() {
				if (Gui.gewinner == 0) {
				// Horiziontal -X-
				if(Gui.state[0] == 1 && Gui.state[1] == 1&& Gui.state[2]== 1) {
					Gui.gewinner = 1;
					
				}
				if(Gui.state[3] == 1 && Gui.state[4] == 1&& Gui.state[5]== 1) {
					Gui.gewinner = 1;
					
				}
				if(Gui.state[6] == 1 && Gui.state[7] == 1&& Gui.state[8]== 1) {
					Gui.gewinner = 1;
					
				}
				//vertikal
				if(Gui.state[0] == 1 && Gui.state[3] == 1&& Gui.state[6]== 1) {
					Gui.gewinner = 1;
					
				}
				if(Gui.state[1] == 1 && Gui.state[4] == 1&& Gui.state[7]== 1) {
					Gui.gewinner = 1;
					
				}
				if(Gui.state[2] == 1 && Gui.state[5] == 1&& Gui.state[8]== 1) {
					Gui.gewinner = 1;
					
				}
				// Cross links oben
				if(Gui.state[0] == 1 && Gui.state[4] == 1&& Gui.state[8]== 1) {
					Gui.gewinner = 1;
					
				}
				// Cross rechts oben
				if(Gui.state[2] == 1 && Gui.state[4] == 1&& Gui.state[6]== 1) {
					Gui.gewinner = 1;
					
				}
				
				////////////////////////
				// Horiziontal -O-
				if(Gui.state[0] == 2 && Gui.state[1] == 2&& Gui.state[2]== 2) {
					Gui.gewinner = 2;
					
				}
				if(Gui.state[3] == 2 && Gui.state[4] == 2&& Gui.state[5]== 2) {
					Gui.gewinner = 2;
					
				}
				if(Gui.state[6] == 2 && Gui.state[7] == 2&& Gui.state[8]== 2) {
					Gui.gewinner = 2;
					
				}
				//vertikal
				if(Gui.state[0] == 2 && Gui.state[3] == 2&& Gui.state[6]== 2) {
					Gui.gewinner = 2;
					
				}
				if(Gui.state[1] == 2 && Gui.state[4] == 2&& Gui.state[7]== 2) {
					Gui.gewinner = 2;
					
				}
				if(Gui.state[2] == 2 && Gui.state[5] == 2&& Gui.state[8]== 2) {
					Gui.gewinner = 2;
					
				}
				// Cross links oben
				if(Gui.state[0] == 2 && Gui.state[4] == 2&& Gui.state[8]== 2) {
					Gui.gewinner = 2;
					
				}
				// Cross rechts oben
				if(Gui.state[2] == 2 && Gui.state[4] == 2&& Gui.state[6]== 2) {
					Gui.gewinner = 2;
					
				}
				}
			}
		},0,150);
	}
}
				
				
				
		
