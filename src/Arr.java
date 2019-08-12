import java.awt.Color;
import com.rupeng.game.GameCore;

public class Arr implements Runnable {

	public void run() {
		String[] names = {"一","二","三","四","五"};
		for(int num=0;num<names.length;num++){
			GameCore.createText(num, names[num]);
			GameCore.setTextPosition(num, 40, num*50);
		}
		
		int i=0;
		boolean fx = true;
		
		while(i < names.length){
			int j=0;
			while (j < names.length){
				if(j != i){
					GameCore.setTextColor(j, Color.BLACK);					
				}
				j++;
			}
			GameCore.setTextColor(i, Color.red);
			if(i == names.length-1 && fx ){
				fx = false;
			}else if(i==0 && !fx){
				fx = true;
			}
			
			if(fx){
				i++;
			}
			if(!fx){
				i--;
			}
			
			GameCore.pause(300);
			
			
		}

		
		/*for(int i=0;i<names.length;i++){
			for(int j=0;j<names.length;j++){
				if(j != i){
					GameCore.setTextColor(j, Color.BLACK);
				}
			}
			GameCore.setTextColor(i, Color.red);	
			GameCore.pause(400);
			if(i == names.length-1){
				i = -1;
			}
		}*/
		
		for(;;){
			GameCore.pause(100);
		}
	}

	public static void main(String[] args) {
	
		GameCore.start(new Arr());
	}

}
