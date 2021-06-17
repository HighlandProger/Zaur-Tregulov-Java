package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1_RegEx1 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern = Pattern.compile("ABCF");// ABCF

//        String s1 = "ABCOP AB7OP AB4OP";
//        Pattern pattern = Pattern.compile("AB[C-F5-9]OP");// ABCOP, AB7OP | [C-F5-9] - диапазон

//        String s1 = "ABCOP AB7OP AB4OP";
//        Pattern pattern = Pattern.compile("AB[^C-F5-9]OP");// AB4OP | [^...] - отрицание

//        String s1 = "ABCOP AB7OP AB4OP";
//        Pattern pattern = Pattern.compile("AB(C|4)OP");// ABCOP, AB4OP | (C|4) - или С или 4

//        String s1 = "ABCOP AB7OP AB4OP";
//        Pattern pattern = Pattern.compile("AB(C|4)OP$");// AB4OP | $ - в конце строки

//        String s1 = "ABCOP AB7OP AB4OP";
//        Pattern pattern = Pattern.compile("^AB(C|4)OP");// AB4OP | ^ - в начале строки

//        String s1 = "ABCOP+!+++=== AB7OP *#@(AB4OP";
//        Pattern pattern = Pattern.compile("\\w+");// ABCOP, AB7OP,  AB4OP | w - цифра или буква, + - 1 и > раз

//        String s1 = "ABCOP+!+++=== AB7OP *#@(AB4OP";
//        Pattern pattern = Pattern.compile("\\W+");// +!+++===, *#@( | W - НЕцифра и НЕбуква, 1 и > раз

//        String s1 = "poka abc Said dom kino abstrakcionizm";
//        Pattern pattern = Pattern.compile("\\w{4}");// poka, Said, kino, abst, rakc, ioni | {4} - 4 раза

//        String s1 = "poka abc Said    dom kino abstrakcionizm";
//        Pattern pattern = Pattern.compile("\\w\\s+\\w");// a a, c S, d     d, m k, o, a| s - space

//        String s1 = "ABCABABDA";
//        Pattern pattern = Pattern.compile("(AB){2,3}");// ABAB| () - skobki reshayt

//        String s1 = "abcd abce abvcdrsdf";
//        Pattern pattern = Pattern.compile("\\Aabc");// abc | \\A - start of String

        String s1 = "abcd abce abvcdrsdf";
        Pattern pattern = Pattern.compile("sdf\\Z");// sdf | \\Z - end of String



        Matcher matcher = pattern.matcher(s1);
        while (matcher.find()){
            System.out.println("Position: " + matcher.start() + " " + matcher.group());
        }
    }
}
