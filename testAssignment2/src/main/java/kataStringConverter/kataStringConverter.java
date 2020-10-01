package kataStringConverter;

public class kataStringConverter {
    private String text = "aBc";


    public String kataToLowerCase() {
        text = text.toLowerCase();
        return text;
    }


    public String kataToUpperCase() {
        return text.toUpperCase();
    }

    public String kataReverse() {
        return new StringBuilder(text).reverse().toString();
    }
}
