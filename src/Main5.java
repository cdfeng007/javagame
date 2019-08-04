import com.rupeng.game.GameCore;


public class Main5 implements Runnable {

	@Override
	public void run() {
		
		for(int num=0;num<=5;num++){
			GameCore.createSprite(num, "mario");
			GameCore.setSpritePosition(num, 0, num*80);
			GameCore.setSpriteFlipX(num, true);
			GameCore.playSpriteAnimate(num, "walk", true);
		}
		
			for(int num=0;num<=5;num++ ){
				for(int x=0;x<=500;x=x+30){
					GameCore.setSpritePosition(num, x, num*80);
					GameCore.pause(300);
				}
				//GameCore.pause(300);
			
		}
		
		for(;;){
			GameCore.pause(10);
		}

		
	}

	public static void main(String[] args) {
		GameCore.start(new Main5());

	}

}
