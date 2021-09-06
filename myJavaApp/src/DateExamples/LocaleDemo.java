package DateExamples;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale lc=new Locale("en");
		System.out.println(lc);
		Locale lc1=Locale.JAPANESE;
		System.out.println(lc1);
		Locale le=new Locale("en","UK");
		System.out.println(le);
		
		String datastring=new String();
		Locale [] newlocal= {new Locale("th"),
							  new Locale("th","TH"),
							  new Locale("th","TH","TH")
		};
		for(Locale l: newlocal)
		{
			NumberFormat nf=NumberFormat.getNumberInstance(l);
			datastring= datastring + l.toString() + " : ";
			datastring = datastring + nf.format(573.34) + "\n" ;
			System.out.println(datastring);
			
		}
			
				
				
		}

	}


