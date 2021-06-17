package others.enums;

public class Test1 {
    public static void main(String[] args) {
        Today workDay = new Today(WeekDays.WEDNESDAY);
        workDay.daysInfo();

        Today holiday = new Today(WeekDays.SATURDAY);
        holiday.daysInfo();
    }
}

enum WeekDays{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

class Today{
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    public void daysInfo(){
        switch (weekDay){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Pizdui na rabotu!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Ladno, otdohni");
                break;
        }
    }
}