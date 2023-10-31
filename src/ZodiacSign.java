public class ZodiacSign {
    private String month;
    private int day;

    private String zodiacSym;

    public ZodiacSign(String month, int day) {
        this.month = month;
        this.day = day;
        this.zodiacSym = "";
    }


    public void determineZodiacSign() {
        month = month.toUpperCase();
        switch (month) {
            case "JANUARY":
                if (day >= 1 && day <= 19)
                    zodiacSym = "Capricorn";
                else if (day >= 20 && day <= 31)
                    zodiacSym = "Aquarius";
                break;
            case "FEBRUARY":
                if (day >= 1 && day <= 18)
                    zodiacSym = "Aquarius";
                else if (day >= 19 && day <= 31)
                    zodiacSym = "Pisces";
                break;
            case "MARCH":
                if (day >= 1 && day <= 20)
                    zodiacSym = "Pisces";
                else if (day >= 21 && day <= 31)
                    zodiacSym = "Aries";
                break;
            case "APRIL":
                if (day >= 1 && day <= 19)
                    zodiacSym = "Aries";
                else if (day>= 20 && day <= 31)
                    zodiacSym = "Taurus";
                break;
            case "MAY":
                if (day >= 1 && day <= 20)
                    zodiacSym = "Taurus";
                else if (day >= 21 && day <= 31)
                    zodiacSym = "Gemini";
                break;
            case "JUNE":
                if (day >= 1 && day <= 21)
                    zodiacSym = "Gemini";
                else if (day >= 22 && day <= 31)
                    zodiacSym = "Cancer";
                break;
            case "JULY":
                if (day >= 1 && day <= 22)
                    zodiacSym = "Cancer";
                else if (day >= 23 && day <= 31)
                    zodiacSym = "Leo";
                break;
            case "AUGUST":
                if (day >= 1 && day <= 22)
                    zodiacSym = "Leo";
                else if (day >= 23 && day <= 31)
                    zodiacSym = "Virgo";
                break;
            case "SEPTEMBER":
                if (day >= 1 && day <= 22)
                    zodiacSym = "Virgo";
                else if (day >= 23 && day <= 31)
                    zodiacSym = "Libra";
                break;
            case "OCTOBER":
                if (day >= 1 && day <= 23)
                    zodiacSym = "Libra";
                else if (day >= 24 && day <= 31)
                    zodiacSym = "Scorpius";
                break;
            case "NOVEMBER":
                if (day >= 1 && day <= 21)
                    zodiacSym = "Scorpius";
                else if (day >= 22 && day <= 31)
                    zodiacSym = "Sagittarius";
                break;
            case "DECEMBER":
                if (day >= 1 && day <= 21)
                    zodiacSym = "Sagittarius";
                else if (day >= 22 && day <= 31)
                    zodiacSym = "Capricorn";
                break;

        }

        System.out.println("You are a " + zodiacSym);

    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int startDay) {
        this.day = startDay;
    }

    public String getZodiacSym() {
        return zodiacSym;
    }

    public void setZodiacSym(String zodiacSym) {
        this.zodiacSym = zodiacSym;
    }

    @Override
    public String toString() {
        return "ZodiacSign{" + "month=" + month + ", Day=" + day + ", zodiacSym=" + zodiacSym + '}';
    }
}