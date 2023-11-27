package Task03;

public class DayOfTheWeek {
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.THURSDAY;
        String dayLowerCase = day.toString().toLowerCase();

        switch (day) {
            case MONDAY:
                System.out.println("День недели " + dayLowerCase + " - будний день.");
                break;
            case TUESDAY:
                System.out.println("День недели " + dayLowerCase + " - будний день.");
                break;
            case WEDNESDAY:
                System.out.println("День недели" + dayLowerCase+ " - будний день.");
                break;
            case THURSDAY:
                System.out.println("День недели " + dayLowerCase + " - будний день.");
                break;
            case FRIDAY:
                System.out.println("День недели " + dayLowerCase + " - будний день.");
                break;
            case SATURDAY:
                System.out.println("День недели " + dayLowerCase + " - выходной день.");
                break;
            case SUNDAY:
                System.out.println("День недели " + dayLowerCase + " - выходной день.");
                break;
            default:
                System.out.println("Неверный день недели.");
                break;
        }
    }
}