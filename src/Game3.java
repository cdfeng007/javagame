import com.rupeng.game.GameCore;;

public class Game3 implements Runnable
{
	public void run()
	{
		int num=0;
		int x=0;
		int y=100;
		GameCore.createSprite(num, "mario");	
		GameCore.setSpritePosition(num, x,y);
		GameCore.setSpriteFlipX(num, true);
		GameCore.playSpriteAnimate(num,"walk", true);
		int i=0;
		int walkNum =Integer.parseInt(GameCore.input("", "请输入一个正整数"));
		if(walkNum <= 0){
			GameCore.confirm("你输入的不是正数");
			
		}else{
			for(;i <= walkNum;i=i+30){
				GameCore.setSpritePosition(num, i, y);
				GameCore.pause(300);
			}
		}
		
		
		GameCore.pause(100000);
	}	



	public static void main(String[] args)
	{
		
		
		GameCore.start(new Game3());
	}

}
