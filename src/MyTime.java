public class MyTime {
    public int hour = 0;
    public int minute = 0;
    public int second = 0;

    public MyTime() {

    }

    public MyTime(int hour, int minute, int second) {
        if (hour > 24)
            System.out.println("soat notog'ri kiritildi");
        else if (minute > 60)
            System.out.println("minut notog'ri kiritildi");
        else if (second > 60)
            System.out.println("sekund notog'ri kiritildi");
        else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

    }

    public void setTime(int hour, int minute, int second){
        if (hour > 24)
            System.out.println("soat notog'ri kiritildi");
        else if (minute > 60)
            System.out.println("minut notog'ri kiritildi");
        else if (second > 60)
            System.out.println("sekund notog'ri kiritildi");
        else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        if (hour >= 24)
            System.out.println("vaqtning soat qismini belgilashda xato qildinggiz");
        else
            this.second = second;
    }

    public void setMinute(int minute) {
        if (minute >= 60)
            System.out.println("vaqtning minut qismini belgilashda xato qildinggiz");
        else
            this.minute = minute;
    }

    public void setSecond(int second) {
        if (second >= 60)
            System.out.println("vaqtning sekond qismini belgilashda xato qildinggiz");
        else
            this.second = second;
    }
    public String toString(){
        String hour="", minute = "",second = "";
        if (this.second < 10)
            second = "0" + this.second;
        else
            second = ""+this.second;
        if (this.minute < 10)
            minute = "0" + this.minute;
        else
            minute = "" + this.minute;
        if (this.hour < 10)
            hour = "0" + this.hour;
        else
            hour = "" + this.hour;
        return (hour + ":" + minute + ":" + second);
    }

    public MyTime nextSecond(){
        MyTime myTime = new MyTime(hour,minute,second);
        if (this.second <= 58)
            this.second ++;
        else if (this.second == 59){
            this.second = 0;
            nextMinute();
        }
        return myTime;
    }
    public MyTime nextMinute(){
        MyTime myTime = new MyTime(hour,minute,second);
        if (this.minute <= 58)
            this.minute ++;
        else if (this.minute == 59){
            this.minute = 0;
            nextHour();
        }
        return myTime;
    }
    public MyTime nextHour(){
        MyTime myTime = new MyTime(hour,minute,second);
        if (this.hour <= 22)
            this.hour ++;
        else if (this.hour == 23){
            this.hour = 0;
        }
        return myTime;
    }
    public MyTime previousSecond(){
        MyTime myTime = new MyTime(hour,minute,second);
        if ((this.second == 0)){
            this.second = 59;
            previousMinute();
        }
        else
            this.second --;
        return myTime;
    }
    public MyTime previousMinute(){
        MyTime myTime = new MyTime(hour,minute,second);
        if ((this.minute == 0)){
            this.minute = 59;
            previousHour();
        }
        else
            this.minute --;
        return myTime;
    }
    public MyTime previousHour(){
        MyTime myTime = new MyTime(hour,minute,second);
        if ((this.hour == 0)){
            this.hour = 23;
        }
        else
            this.hour --;
        return myTime;
    }
}
