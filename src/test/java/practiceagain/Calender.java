package practiceagain;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat ob = new SimpleDateFormat("dd/mm/yy hh:mm:ss");
		System.out.println(ob.format(cal.getTime()));  
		System.out.println(cal.get(Calendar.DATE));
		
	}

}
