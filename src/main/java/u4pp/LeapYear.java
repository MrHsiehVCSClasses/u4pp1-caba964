package u4pp;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year <= 1582) {
            return false;
        }
        else if (year > 1582 && year % 400 == 0) {
            return true; } 
        else if (year % 100 == 0) {
            return false; }
        else if (year % 4 != 0) {
            return false; }
        else {
            return true;
        }
    }
}

