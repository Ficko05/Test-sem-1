package converter;

public class NumberToRomanNumeralConverter {

    public static String convertRun(int i) {
        String result = "";


        if (i <= 9999) {
//            result += convert1000s(i);
//            i = i % 1000;

        }
        if (i <= 999) {
            result += convert100s(i);
            i = i % 100;
        }
        if (i <= 99) {
            result += convert10s(i);
            i = i % 10;

        }
        if (i <= 9) {

            result += convertRest(i);

        }

        return result;

    }

    public static String convert1000s(int numb) {

        String subI = "MMMMMMM";

        if (numb <= 3000) return subI.substring(0, numb / 1000);
        if (numb <= 4999) return "MMMM";
        if (numb <= 5999) return "MMMMM";
        if (numb <= 6999) return "MMMMMM";
        if (numb <= 7999) return "MMMMMMM";
        if (numb <= 8999) return "MMMMMMMM";
        if (numb <= 9999) return "MMMMMMMMM";


        return null;

    }

    public static String convert100s(int numb) {

        String subI = "CCCCCC";

        if (numb <= 300) return subI.substring(0, numb / 100);
        if (numb <= 499) return "CD";
        if (numb <= 599) return "D";
        if (numb <= 699) return "DC";
        if (numb <= 799) return "DCC";
        if (numb <= 899) return "DCCC";
        if (numb <= 999) return "CM";


        return null;
    }

    public static String convert10s(int numb) {

        String subI = "XXXXXXXXXXXX";

        if (numb <= 30) return subI.substring(0, numb / 10);
        if (numb <= 49) return "XL";
        if (numb <= 59) return "L";
        if (numb <= 69) return "LX";
        if (numb <= 79) return "LXX";
        if (numb <= 89) return "LXXX";
        if (numb <= 99) return "XC";


        return null;

    }

    public static String convertRest(int numb) {
        String subI = "IIIIIIIIIIIII";

        if (numb <= 3) return subI.substring(0, numb);
        if (numb == 4) return "IV";
        if (numb == 5) return "V";
        if (numb == 6) return "VI";
        if (numb == 7) return "VII";
        if (numb == 8) return "VIII";
        if (numb == 9) return "IX";

        return null;
    }


}
