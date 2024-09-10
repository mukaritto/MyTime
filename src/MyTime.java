public class MyTime {
    int hour;
    int minute;
    int second;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if (hour > 23||minute>59||second>59) {
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
        }
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public String nextSecond() {
        if (second == 59) {
            second = 0;
            if (minute == 59) {
                minute = 0;
                if (hour == 23) {
                    hour = 0;
                }else hour++;
            }else minute++;
        }else second++;
        return toString();
    }

    public String nextMinute() {
        if (minute == 59) {
            minute = 0;
            if (hour == 23) {
                hour = 0;
            }else hour++;
        }else minute++;
        return toString();
    }

    public String nextHour() {
        if (hour == 23) {
            hour = 0;
        }else hour++;
        return toString();
    }

    public String previousSecond() {
        if (second == 0) {
            second = 59;
            if (minute == 0) {
                minute = 59;
                if (hour == 0) {
                    hour = 23;
                }else hour--;
            }else minute--;
        }else second--;
        return toString();
    }

    public String previousMinute() {
        if (minute == 0) {
            minute = 59;
            if (hour == 0) {
                hour = 23;
            }else hour--;
        }else minute--;
        return toString();
    }

    public String previousHour() {
        if (hour == 0) {
            hour = 23;
        }else hour--;
        return toString();
    }
}
