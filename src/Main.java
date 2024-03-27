
public class Main {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(01,58,25);
        System.out.println(myTime.toString());
        myTime.nextHour();
        System.out.println(myTime.toString());
        myTime.previousMinute();
        myTime.previousHour();
        myTime.previousHour();
        myTime.setHour(150);
        System.out.println(myTime.toString());

    }
}