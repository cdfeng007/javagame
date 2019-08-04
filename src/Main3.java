import com.rupeng.game.GameCore;


public class Main3 implements Runnable
{

	@Override
	public void run()
	{
		int marioNum=0;
		
		GameCore.createSprite(marioNum, "mario");
		GameCore.setSpritePosition(marioNum, 0, 0);
		GameCore.setSpriteFlipX(marioNum, true);
		GameCore.playSpriteAnimate(marioNum, "walk",true);
		int a,b=100;
		for(a=0;a<=1000;a=a+130){
				
			GameCore.setSpritePosition(marioNum,a,b);
			GameCore.pause(200);
		}
		
		GameCore.pause(10000);

	}

	public static void main(String[] args)
	{
		GameCore.start(new Main3());

	}

}
