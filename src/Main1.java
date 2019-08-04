import com.rupeng.game.GameCore;


public class Main1 implements Runnable
{

	@Override
	public void run()
	{
		int age = Integer.parseInt(GameCore.input(10, "请输入你的年龄"));	
		int picNum = 0;
		
		GameCore.createImage(picNum);
		GameCore.setImagePosition(picNum, 0, 0);
		
		GameCore.setImageSource(picNum, age > 18 ? "hehua.jpg":"bg.jpg");
		GameCore.playSound(age>18 ? "老男孩.mp3" : "Hot.mp3", true);
		
		GameCore.pause(10000);
		GameCore.alert("要退出吗?:");
		
		
		

	}

	public static void main(String[] args)
	{
		GameCore.start(new Main1());

	}

}
