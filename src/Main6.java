import com.rupeng.game.GameCore;


import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;

public class Main6 implements Runnable {

	
	public void run() {
		
		int girlNum=0;
		GameCore.createSprite(girlNum, "girl");
		GameCore.setSpritePosition(girlNum, 0, 0);
		GameCore.playSpriteAnimate(girlNum, "walk", true);
		Dimension gameSize = GameCore.getGameSize();//得到游戏 的尺寸
		int gameWidth = gameSize.width;//得到游戏的宽度
		int gameHeight = gameSize.height;//得到游戏的高度值 
		Dimension girlSize =GameCore.getSpriteSize(girlNum);//得到精灵的尺寸
		int girlWidth = girlSize.width;//得到数不精灵的宽
		int girlHeight = girlSize.height;//得到精灵的高	
		
		//陀螺动画
		int tuoluoNum = 1;
		GameCore.createSprite(tuoluoNum, "tuoluo");
		GameCore.setSpritePosition(tuoluoNum, 200, 200);
		GameCore.playSpriteAnimate(tuoluoNum, "rotate", true);
		Point tuoluoPos = GameCore.getSpritePosition(tuoluoNum);  //得到陀螺的位置
		
		//初始为隐藏状态的炸弹
		int bombNUm=2;
		GameCore.createSprite(bombNUm, "bomb");
		GameCore.setSpritePosition(bombNUm, 200, 200);
		GameCore.hideSprite(bombNUm);
		
		
		for(;;){
			int kc=GameCore.getPressedKeyCode();//获得键盘码
			Point pos=GameCore.getSpritePosition(girlNum);//获得精灵当前的位置
			if(kc == KeyEvent.VK_LEFT){
				if(pos.x > 0){
					GameCore.setSpriteFlipX(girlNum, true);
					GameCore.setSpritePosition(girlNum, pos.x-1, pos.y);
				}							
			}else if(kc == KeyEvent.VK_RIGHT){
				if(pos.x < gameWidth - girlWidth){
					GameCore.setSpriteFlipX(girlNum, false);
					GameCore.setSpritePosition(girlNum, pos.x+1, pos.y);
				}				
			}else if(kc == KeyEvent.VK_UP){
				if(pos.y >0)
				GameCore.setSpritePosition(girlNum, pos.x, pos.y-1);
			}else if(kc == KeyEvent.VK_DOWN){
				if(pos.y < gameHeight - girlHeight-25){
					GameCore.setSpritePosition(girlNum, pos.x, pos.y+1);
				}				
			}
			
			//计算陀螺和小孩之间的距离
			 double juli = Math.sqrt(Math.abs((tuoluoPos.x - pos.x)*(tuoluoPos.x - pos.x) + (tuoluoPos.y - pos.y)*(tuoluoPos.y - pos.y)));
			 //小孩接近炸弹后隐藏陀螺,显示炸弹爆炸
			 if(juli<50){
				 GameCore.hideSprite(tuoluoNum);
				 GameCore.showSprite(bombNUm);
				 GameCore.playSpriteAnimate(bombNUm, "fire", true);
			 }		
			 GameCore.pause(30);
		
			
		}
	}

	public static void main(String[] args) {
		GameCore.start(new Main6());

	}

}
