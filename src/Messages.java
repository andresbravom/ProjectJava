import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.ResourceBundle;

public class Messages {
	private final ResourceBundle messages;
	private final Locale locale;
	
	public Messages(Locale locale) {
		this.locale = locale;
		messages = ResourceBundle.getBundle("Languages", locale);
	}
	public Locale getLocale() {
		return locale;
	}
	
	public String getMessages(String key, Object... arguments) {
		try {
			final String pattern = messages.getString(key);
			final MessageFormat format = new MessageFormat(pattern, getLocale());
			
			return format.format(arguments);
			
		}catch(MissingResourceException ex){
			return "!" + key;
			
		}
	}

}