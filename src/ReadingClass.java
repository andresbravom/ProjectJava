import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadingClass {
	
	public String readLine() {
		String product;
		
		LineNumberReader lnr = new LineNumberReader(new InputStreamReader(System.in));
		
		try {
			product = lnr.readLine();
			
		}catch(IOException e) {
			e.printStackTrace();
			product = "";
			
		}
		return product;
		
	}

}
