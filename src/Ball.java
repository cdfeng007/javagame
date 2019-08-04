import com.rupeng.game.GameCore;


public class Ball implements Runnable
{

	@Override
	public void run()
	{
		int ball=0;
		GameCore.createSprite(ball, "ball1");
		GameCore.setSpritePosition(ball, 100, 0);
		GameCore.playSpriteAnimate(ball, "rotate", true);
		
		double v=0;
		int t=1;
		double y=0;
		for(;;){
			v=v+0.5*9.8*t*t;
			y=y+v*t;
			if(y>=300){
				v=-v;
			}
			if(y>=300){
				y=300;
			}
			GameCore.setSpritePosition(ball, 100, (int)y);
			GameCore.pause(200);
			
		}
		
		
	}

	public static void main(String[] args)
	{
		GameCore.start(new Ball());

	}

}
