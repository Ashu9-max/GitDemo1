package practiceagain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetime {

	public static void main(String[] args) {
		
		Date ob = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy  hh:mm:ss");
		
		System.out.println(sdf.format(ob));
		
		System.out.println(ob.toString());

	}

}
