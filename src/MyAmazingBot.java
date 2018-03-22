import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;;

public class MyAmazingBot extends TelegramLongPollingBot
{
	@Override
	public void onUpdateReceived( Update update )
	{
		//We check if the update has a message and the message has text
		if( update.hasMessage() && update.getMessage().hasText() )
		{
			SendMessage message = new SendMessage() //Create a SendMessage object with mandatory fields
				.setChatId( update.getMessage().getChatId() )
					.setText( update.getMessage().getText() );
			try
			{
				execute( message ); //Call method to send the message
			}
			catch( TelegramApiException e )
			{
				e.printStackTrace();
			}
		}

		//We check if the update has a message and the message has text
		if( update.hasMessage() && update.getMessage().hasText() )
		{
			SendMessage fag_message = new SendMessage() //Create a SendMessage object with mandatory fields
				.setChatId( update.getMessage().getChatId() )
					.setText( "fag" );
			try
			{
				execute( fag_message ); //Call method to send the message
			}
			catch( TelegramApiException e )
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getBotUsername()
	{
		return "FagPosting";
	}

	@Override
	public String getBotToken()
	{
		return "586324601:AAHtqPbDtUVQMGAPVtoMyPWXgXBkBuYoCEk";
	}
}
