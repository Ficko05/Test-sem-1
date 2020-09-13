package converter;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class FahrenheitToCelcius {


    public float f2C(float fahrenheit) {
        //i tried really hard
        // decimalc didnt work for me

        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.getDefault());
        otherSymbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("0.0", otherSymbols);
        float celcius ;


        celcius = Math.round((fahrenheit - 32f)*0.5556f);
        System.out.println(df.format(celcius));
        return Float.parseFloat(df.format(celcius)) ;
    }


}
