public class logic {
    public static void lgc(String firstString, String arithmetic, String secondString) {
        int f = 0;
        int s = 0;
        int res = 0;
        boolean isArabic = true;

        try {
            f = Integer.parseInt(firstString);
            s = Integer.parseInt(secondString);
        } catch (Exception ex1) {
            try {
                f = convert.toArabic(firstString);
                s = convert.toArabic(secondString);
                if(convert.isRoman(firstString) && convert.isRoman(secondString))
                    isArabic = false;
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

        if (!isArabic && res > 0) {
            System.out.println(convert.toRoman(res));
        } else if(isArabic) {
            System.out.println(res);
        } else {
            System.out.println("Вывод не соответствует условиям");
        }
    }

}
