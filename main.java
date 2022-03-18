package dz.devio.islamicreminder;

import java.util.Calendar;
import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.chrono.IslamicChronology;

public class MainActivity {

	public static void main(String[] args) {
		
		/*v*/
		
		Scanner readS = new Scanner(System.in);
		
		int yourday ; 
		int youryear   ; 
		int  yourmonth ; 
		/* islamic date*/
		DateTime islamicdt = new DateTime(IslamicChronology.getInstance());
		 int islday= islamicdt.getDayOfMonth();
		 int islmonth = islamicdt.getMonthOfYear();
		 int islyear = islamicdt.getYear();
		 /* geo date*/
	Calendar geodate = Calendar.getInstance();
	int geotoday = geodate.get(Calendar.DAY_OF_MONTH);
	int geomonth = geodate.get(Calendar.MONTH)+1;
	int geoyear = geodate.get(Calendar.YEAR);
	
	 /* show today time in hijri and geo */
	
	System.out.println("today date in hijri is "+islday +" "+islmonth+" " +islyear);
	System.out.println("today date in geo is "+geotoday +" "+geomonth+" " +geoyear);
	 /* simple message that the aid is soon */
		if (islamicdt.getMonthOfYear()== 9 && islamicdt.getDayOfMonth()==20) 	
		{System.out.println("aid elfitr is close 🥰 aid saiid");
			
		}else 
			{System.out.println("i'll notify you about aid elfitr 10 days befor 🥰");
		};
			
		/* simple message that the aid is soon */
		
		
		if (islamicdt.getMonthOfYear()== 8 && islamicdt.getDayOfMonth() >= 20) 	
		{System.out.println("it last less then 10 days for ramadan ❤");
			
		}else 
			{System.out.println("it last more then 10 days for ramadan ❤" );
		};
		
		System.out.println("so why you don't tell me when you was borned so i can bring you a gift 😤");
		
		System.out.println("entre you year of birth");
			youryear = readS.nextInt();
		
			
		if (youryear <=1950 ||  youryear >= 2010) {
			System.out.println("are you kiding me 🤣 pls retry " );
			youryear = readS.nextInt();	
		} 
			
		
		System.out.println("so you where born on "+ youryear +"!!! great now tell me wich month"); 

		yourmonth = readS.nextInt();
		if (yourmonth <=0 ||  yourmonth >= 13) {
			System.out.println("are you kiding me 🤣 pls retry " );
			yourmonth = readS.nextInt();	
		} 
			switch (yourmonth) {
			case 1:
				System.out.println("you where born on   january 🥶" );
				break;
			case 2:
				System.out.println("you where born on february 😴" );
				break;
			case 3:
				System.out.println("you where born on march 😍 " );
				break;
			case 4:
				System.out.println("you where born on april 🥰 " );
				break;
			case 5:
				System.out.println("you where born on may 🤩 " );
				break;
			case 6:
				System.out.println("you where born on june 😎 " );
				break;
			case 7:
				System.out.println("you where born on july 🤪" );
				break;
			case 8:
				System.out.println("you where born on august 😎" );
				break;
			case 9:
				System.out.println("you where born on september 😇 " );
				break;
			case 10:
				System.out.println("you where born on october 🥳" );
				break;
			case 11:
				System.out.println("you where born on november 😮 " );
				break;
				
			default:
				System.out.println("you where born on december 😁 " );
				break;
			}
		
		System.out.println("Enter day"); 
		 yourday = readS.nextInt(); 
	if (yourday <=0 ||  yourday >= 33) {
		System.out.println("are you kiding me 🤣 pls retry " );
		yourday = readS.nextInt();
		
	}
		
	;
	if (geomonth == yourmonth && geotoday == yourday ) {
		System.out.println(" happy birthday 😁 " );
		
	}else {
		System.out.println("am going to notify you since you tell me about your berthday to say happy birthday 😁 " );
	}	
		
	}

}
