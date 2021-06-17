package regex;

import java.util.Arrays;

public class Test3_Matches_And_Split {
    public static void main(String[] args) {
        String s
                = "Ivanov Ivan, Russia, Moscow, Lenin street, 51, Flat 48,"+
                " email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;"
                + "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18," +
                " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        String email = "masha@yandex.ru";
        boolean b = email.matches("\\w+@\\w+\\.(com|ru)"); // true

        System.out.println(b);

        System.out.println("-------------------------------------------------------");

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));

//        [Ivanov, Ivan,, Russia,, Moscow,, Lenin, street,, 51,, Flat, 48,, email:, vivanov@mail.ru,,
//        Postcode:, AA99,, Phone, Number:, +123456789;Petrova, Mariya,, Ukraine,, Kiyev,, Lomonosov, street,,
//        33,, Flat, 18,, email:, masha@yandex.ru,, Postcode:, UKR54,, Phone, Number:,
//        +987654321;Chuck, Norris,, USA,, Hollywood,, All, stars, street,, 87,, Flat, 21,, email:,
//        chuck@gmail.com,, Postcode:, USA23,, Phone, Number:, +136478952.]
    }
}
