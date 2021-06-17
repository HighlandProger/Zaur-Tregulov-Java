package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4_CheckIP {
    public void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        //  25[0-5]    |    2[0-4]\d    |    [01]?\d?\d        (\.)
        //  250-255    |    200-249     |     0-199



        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }
    private static void updateX (int a){
        a=5;
    }

    public static void main(String[] args) {
        int x = 1;
        updateX(x);
        System.out.println(x);

        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";
        Test4_CheckIP checker = new Test4_CheckIP();
        checker.checkIP(ip1);
        checker.checkIP(ip2);

        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        String regex2 = "25[0-5]|2[0-4]\\d|[01]?\\d?\\d";
        String s = "255.38.255.250";
        System.out.println(s.matches(regex));

    }
}

