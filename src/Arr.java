import java.awt.Dimension;


import java.awt.Point;
import java.awt.event.KeyEvent;

import com.rupeng.game.GameCore;

public class Arr implements Runnable {	
	

	public void run() {
		
		int girlNum = 0;
		GameCore.createSprite(girlNum, "girl");
		GameCore.setSpritePosition(girlNum, 0, 0);
		GameCore.playSpriteAnimate(girlNum, "walk",true);
		Dimension gameSize = GameCore.getGameSize();
		int gameWidth = gameSize.width;
		int gameHeight = gameSize.height;
		Dimension girlSize = GameCore.getSpriteSize(girlNum);
		int girlWidth = girlSize.width;
		int girlHeight = girlSize.height;
		
		int tuoluoNum = 1;
		GameCore.createSprite(tuoluoNum, "tuoluo");
		GameCore.setSpritePosition(tuoluoNum, 200,200);
		GameCore.playSpriteAnimate(tuoluoNum, "rotate", true);
		Point tuoluoPos = GameCore.getSpritePosition(tuoluoNum);
		
		int bombNum = 2;
		GameCore.createSprite(bombNum, "bomb");
		GameCore.setSpritePosition(bombNum, 200, 200);
		GameCore.playSpriteAnimate(bombNum, "fire",true);
		GameCore.hideSprite(bombNum);
		
			
		for(;;){
			int kc = GameCore.getPressedKeyCode();
			Point pos = GameCore.getSpritePosition(girlNum);
			if(kc == KeyEvent.VK_LEFT){
				if(pos.x>0){
					GameCore.setSpriteFlipX(girlNum, true);
					GameCore.setSpritePosition(girlNum, pos.x-1, pos.y);
				}
				
			}
			if(kc == KeyEvent.VK_RIGHT){
				if(pos.x < gameWidth-girlWidth){
					GameCore.setSpriteFlipX(girlNum, false);
					GameCore.setSpritePosition(girlNum, pos.x+1, pos.y);
				}
				
			}
			
			if(kc == KeyEvent.VK_UP){
				if(pos.y>0)				
				GameCore.setSpritePosition(girlNum, pos.x, pos.y-1);
			}
			if(kc == KeyEvent.VK_DOWN){
				if(pos.y < gameHeight-girlHeight-30)
				GameCore.setSpritePosition(girlNum, pos.x, pos.y+1);
			}
			
			double juli = Math.sqrt(Math.abs((tuoluoPos.x - pos.x)*(tuoluoPos.x-pos.x)+(tuoluoPos.y - pos.y)*(tuoluoPos.y - pos.y)));
			
			int jl = (int)juli;
			
			if(jl<50){
				GameCore.hideSprite(tuoluoNum);
				GameCore.showSprite(bombNum);
				GameCore.alert("我要死了");
				GameCore.pause(1000);
				GameCore.exit();
				
			}
			
			
			GameCore.pause(20);
		}
        
	}
	
	

	public static void main(String[] args) {
	
		GameCore.start(new Arr());
			
	
	}

}
