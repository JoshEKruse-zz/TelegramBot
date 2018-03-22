import org.telegram.abilitybots.api.bot.AbilityBot;

public class HelloBot extends AbilityBot
{
	public static String BOT_TOKEN = "";
	public static String BOT_USERNAME = "";
	public HelloBot()
	{
		super( BOT_TOKEN, BOT_USERNAME );
	}

	@Override
	public int creatorId()
	{
		return 176662987;
	}
}
