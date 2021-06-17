package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5_Group {
    public static void main(String[] args) {
        String cardNumbers = "42760000199025431221678"+
                "25413452668896430921532"+
                "12345678901234561022693";
        // 10/22 1234 5678 9012 3456 (693)

                                        //     $1      $2      $3      $4      $5      $6      $7
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
                                        //    1234     5678    9012    3456     10       22     693

        Matcher matcher = pattern.matcher(cardNumbers);

//        String parsed = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)"+"\n");
//        System.out.println(parsed);

//        12/21 4276 0000 1990 2543 (678)
//        09/21 2541 3452 6688 9643 (532)
//        10/22 1234 5678 9012 3456 (693)

        System.out.println("\n----------------------------------------------------------\n");

        while (matcher.find()){
            System.out.println(matcher.group(7));

//            678
//            532
//            693
        }
    }
}
