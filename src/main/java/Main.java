import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
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

    public static void lgc(String firstString, String arithmetic, String secondString) {
        int f = 0;
        int s = 0;
        int res = 0;
        boolean isArabic = false;

        try {
            f = Integer.parseInt(firstString);
            s = Integer.parseInt(secondString);
        } catch (Exception ex1) {
            try {
                f = toArabic(firstString);
                s = toArabic(secondString);
                isArabic = true;
            } catch (Exception ex2) {
                System.out.println("INCORRECT INPUT");
                System.exit(1);
            }
        }

        if (f < 1 || f > 10 || s < 1 || s > 10) {
            System.out.println("INCORRECT INPUT");
            System.exit(1);
        }

        if (arithmetic.equals("+")) {
            res = f + s;
        }

        if (arithmetic.equals("-")) {
            res = f - s;
        }

        if (arithmetic.equals("*")) {
            res = f * s;
        }

        if (arithmetic.equals("/")) {
            res = f / s;
        }
        if(!isArabic)
            System.out.println(res);
        else
            System.out.println(toRoman(res));
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter numbers with spaces");

        List<String> lst = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try {
            for (String splitted : input.split(" ")) {
                lst.add(splitted);
            }
            lgc(lst.get(0), lst.get(1), lst.get(2));
        } catch (Exception e) {
            System.out.println("Input ERROR!");
            System.exit(1);
        }
    }

}

