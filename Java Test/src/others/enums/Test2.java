package others.enums;

public class Test2 {
    public static void main(String[] args) {
        Today2 today2 = new Today2(WeekDays2.SATURDAY);
        today2.daysInfo();
        System.out.println(today2.weekDay);

        //---------------------------------------------------------------

        WeekDays2 w1 = WeekDays2.MONDAY;
        WeekDays2 w2 = WeekDays2.MONDAY;
        WeekDays2 w3 = WeekDays2.WEDNESDAY;

        System.out.println(w1==w2);//true
        System.out.println(w1==w3);//false
    }
}

enum WeekDays2 {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY ("good");

    private String mood;

    WeekDays2(String mood){
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
}

class Today2{
    WeekDays2 weekDay;

    public Today2(WeekDays2 weekDay) {
        this.weekDay = weekDay;
    }

    public void daysInfo(){

        System.out.println("Nastroenie: " + weekDay.getMood());
    }
}

