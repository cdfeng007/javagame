import com.rupeng.game.GameCore;
public class Game2 implements Runnable
{

	@Override
	public void run()
	{
		
		int marioNum = 0;
		int sptime = 300;
		int spx = 100;

		GameCore.createSprite(marioNum,"mario");
		GameCore.playSpriteAnimate(marioNum, "walk", true);
		GameCore.setSpritePosition(marioNum, 100, 100);
		GameCore.setSpriteFlipX(marioNum, true);
		
		//GameCore.setSpritePosition(marioNum, spx, 100);
			
		for(int i = 0;i < 100;i++){
			GameCore.pause(sptime);
			spx+=80;
			GameCore.setSpritePosition(marioNum, spx, 100);
		}
		
	
		
		/*GameCore.alert("摔");
		GameCore.playSpriteAnimate(marioNum, "shuaidao", true);
		
		GameCore.alert("发呆");
		GameCore.playSpriteAnimate(marioNum, "idle", true);
		*/
		
		
		GameCore.pause(40000);
		
	/*	GameCore.setGameTitle("cdf的游戏");
		GameCore.setGameSize(500, 400);
		GameCore.loadBgView("bg.jpg");
		GameCore.createText(0, "超级玛丽");
		GameCore.createText(1, "1 单人游戏");
		GameCore.createText(2, "2 多人游戏");
		GameCore.createText(3, "3 游戏演示");
		GameCore.setTextColor(0, Color.yellow);
		GameCore.setTextFontSize(0, 60);
		GameCore.setTextPosition(0, 100, 80);
		GameCore.setTextPosition(1, 100, 160);
		GameCore.setTextPosition(2, 100, 200);
		GameCore.setTextPosition(3, 100, 240);
		GameCore.playSound("老男孩.mp3", true);
		
		GameCore.alert("关闭游戏");*/
	}

	public static void main(String[] args)
	{
		GameCore.start(new Game2());

	}

}
