import java.util.Locale;

public class Menu {
	
	private Locale locale;
	private Messages messages2;
	
	public Menu(Locale locale) {
		this.locale = locale;
		messages2= new Messages(locale);
	}
	
	public void menu() {
		
		System.out.println("\n" + messages2.getMessages("option", locale));
		System.out.println("\n------------------------------------");
		System.out.println(messages2.getMessages("option1", locale));
		System.out.println("\n" + messages2.getMessages("option2", locale));
		System.out.println("\n" + messages2.getMessages("option3", locale));
		System.out.println("\n" + messages2.getMessages("option4", locale));
		System.out.println("\n" + messages2.getMessages("option5", locale));
		System.out.println("\n" + messages2.getMessages("option6", locale));
		System.out.println("\n" + messages2.getMessages("option7", locale));
		System.out.println("\n" + messages2.getMessages("option8", locale));
		System.out.println("\n" + messages2.getMessages("option9", locale));
		System.out.println("\n" + messages2.getMessages("option11", locale));
		System.out.println("\n" + messages2.getMessages("option10", locale));
		System.out.println("\n------------------------------------");
	}
}
