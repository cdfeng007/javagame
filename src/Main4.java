import com.rupeng.game.GameCore;

public class Main4 implements Runnable
{

	@Override
	public void run()
	{
		int num = 0;
		GameCore.createText(num, "商丘第一房");
		GameCore.setTextPosition(num, 100, 100);

		for (;;)
		{
			for (int i = 10; i <= 100; i++)
			{
				GameCore.setTextFontSize(num, i);
				GameCore.pause(100);
			}
			for (int i = 100; i >= 10; i--)
			{
				GameCore.setTextFontSize(num, i);
				GameCore.pause(100);
				continue;
			}
			continue;
			
		}

	}

	public static void main(String[] args)
	{
		GameCore.start(new Main4());

	}

}
