package I18N;

import java.text.NumberFormat;
import java.util.Locale;

class NumberFormatDemo
{
  public static void main(String[] args)
 {
  double d = 123456.789;
  //number format
  NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
  System.out.println("Italy number form is: "+nf.format(d));
   
  //currency format
   Locale india = new Locale("pa","IN");
   NumberFormat nf1 = NumberFormat.getCurrencyInstance(india);
   System.out.println("India currency form is: "+nf1.format(d));

   NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
   System.out.println("UK currency form is: "+nf2.format(d));
 
   NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
   System.out.println("US currency form is: "+nf3.format(d));
 
}
}

