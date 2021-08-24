import java.util.TreeMap;

public class convert {
    public static Boolean isRoman(String number) {
        if (number.equals("I"))
            return true;
        if (number.equals("II"))
            return true;
        if (number.equals("III"))
            return true;
        if (number.equals("IV"))
            return true;
        if (number.equals("V"))
            return true;
        if (number.equals("VI"))
            return true;
        if (number.equals("VII"))
            return true;
        if (number.equals("VIII"))
            return true;
        if (number.equals("IX"))
            return true;
        if (number.equals("X"))
            return true;
        return false;
    }

    public static int toArabic(String number) {
        if (number.equals("I"))
            return 1;
        if (number.equals("II"))
            return 2;
        if (number.equals("III"))
            return 3;
        if (number.equals("IV"))
            return 4;
        if (number.equals("V"))
            return 5;
        if (number.equals("VI"))
            return 6;
        if (number.equals("VII"))
            return 7;
        if (number.equals("VIII"))
            return 8;
        if (number.equals("IX"))
            return 9;
        if (number.equals("X"))
            return 10;
        return 0;
    }

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public static String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
}
