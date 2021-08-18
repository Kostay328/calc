import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter numbers with spaces");

        List<String> lst = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try {
            for (String splitted : input.split(" ")) {
                lst.add(splitted);
            }
            logic.lgc(lst.get(0), lst.get(1), lst.get(2));
        } catch (Exception e) {
            System.out.println("Input ERROR!");
            System.exit(1);
        }
    }
}

