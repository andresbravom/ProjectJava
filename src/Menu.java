import java.util.Locale;

public class Menu {
	
	public void MenuEnglish() {
		Locale localeEnglish = new Locale("en", "US");
		Messages messages2 = new Messages(localeEnglish);
		
		System.out.println("\n" + messages2.getMessages("option", localeEnglish));
		System.out.println("\n" + messages2.getMessages("option1", localeEnglish));
		System.out.println("\n" + messages2.getMessages("option2", localeEnglish));
		System.out.println("\n" + messages2.getMessages("option3", localeEnglish));
		System.out.println("\n" + messages2.getMessages("option4", localeEnglish));
		System.out.println("\n" + messages2.getMessages("option5", localeEnglish));
		System.out.println("\n" + messages2.getMessages("option6", localeEnglish));
		System.out.println("\n" + messages2.getMessages("option7", localeEnglish));
		System.out.println("\n" + messages2.getMessages("option8", localeEnglish));
		System.out.println("\n" + messages2.getMessages("option9", localeEnglish));
		System.out.println("\n" + messages2.getMessages("option10", localeEnglish));
		
	}


	public void MenuSpanish() {
		Locale localeSpanish = new Locale("es", "ES");
		Messages messages1 = new Messages(localeSpanish);
		
		System.out.println("\n" + messages1.getMessages("option", localeSpanish));
		System.out.println("\n" + messages1.getMessages("option1", localeSpanish));
		System.out.println("\n" + messages1.getMessages("option2", localeSpanish));
		System.out.println("\n" + messages1.getMessages("option3", localeSpanish));
		System.out.println("\n" + messages1.getMessages("option4", localeSpanish));
		System.out.println("\n" + messages1.getMessages("option5", localeSpanish));
		System.out.println("\n" + messages1.getMessages("option6", localeSpanish));
		System.out.println("\n" + messages1.getMessages("option7", localeSpanish));
		System.out.println("\n" + messages1.getMessages("option8", localeSpanish));
		System.out.println("\n" + messages1.getMessages("option9", localeSpanish));
		System.out.println("\n" + messages1.getMessages("option10", localeSpanish));
	}
}
