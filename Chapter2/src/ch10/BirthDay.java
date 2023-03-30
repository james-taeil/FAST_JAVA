package ch10;

public class BirthDay {
    private int day;
    private int month;
    private int year;
    private boolean isValid;
    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        if (day < 0 || day > 31) {

            this.isValid = false;
        }
        else {

            this.isValid = true;
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {

        if (month < 1 || month > 12) {

            this.isValid = false;
        }else {

            this.isValid = true;
            this.month = month;
        }
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        if (year < 1850 || year > 2023) {

            this.isValid = false;
        }
        else {

            this.isValid = true;
            this.year = year;
        }
    }

    public void showDate() {
        if (isValid) {

            System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
            System.out.println(this.isValid);
        }
        else {

            System.out.println("유효하지 않는 날짜입니다.");
        }
    }
}
