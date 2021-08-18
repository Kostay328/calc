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

    public static String toRoman(int number) {
        if (number == 1)
            return "I";
        if (number == 2)
            return "II";
        if (number == 3)
            return "III";
        if (number == 4)
            return "IV";
        if (number == 5)
            return "V";
        if (number == 6)
            return "VI";
        if (number == 7)
            return "VII";
        if (number == 8)
            return "VIII";
        if (number == 9)
            return "IX";
        if (number == 10)
            return "X";
        return String.valueOf(number);
        //Сам не могу понять как сделать вывод по другому а в интернет лезь не хочу(
    }
}
