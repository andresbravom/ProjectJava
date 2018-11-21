import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.ResourceBundle;

public class Messages {
	private final ResourceBundle messages;
	private Locale locale;
	
	public Messages(Locale locale) {
		this.locale = locale;
		messages = ResourceBundle.getBundle("MessageBundle", locale);
	}
	public Locale getLocale() {
		return locale;
	}
	
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public String getMessages(String key, Object... arguments) {
		try {
			final String pattern = messages.getString(key);
			final MessageFormat format = new MessageFormat(pattern, getLocale());
			
			return format.format(arguments);
			
		}catch(MissingResourceException e){
			return "!" + key;
			
		}
	}

}