import com.rupeng.game.GameCore;
public class Game1 implements Runnable
{

	public static void main(String[] args)
	{
		GameCore.start(new Game1());

	}

	@Override
	public void run()
	{
		String name = GameCore.input("","请输入你的姓名");
		String width = GameCore.input("", "请输入游戏的宽");
		String height = GameCore.input("", "请输入游戏的高");
		int wt = Integer.parseInt(width);
		int hg = Integer.parseInt(height);
		
		GameCore.setGameTitle("这是一个帅哥"+name+"的游戏");
		
		GameCore.setGameSize(wt, hg);
		GameCore.pause(50000);
		
		
		
		
		/*GameCore.setGameTitle("我的计算器");
		String i = GameCore.input("", "请输入一个数字");
		String h = GameCore.input("","请输入第二个数字");
		int sum1 = Integer.parseInt(i);
		int sum2= Integer.parseInt(h);
		GameCore.alert("两个数的和是" + (sum1+sum2));*/
		
	}

}
