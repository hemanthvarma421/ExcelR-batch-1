class MinutesToYears {
    void minToYrs() {
        int minutes = 3000010;
        int year = minutes / (365 * 24 * 60);
        int remainingMinutesAfterYears = minutes % (365 * 24 * 60);
        int days = remainingMinutesAfterYears / (24 * 60);
        System.out.println("Given minutes has " + year + " years " + days + " days");
    }
}

public class Demo18 {
    public static void main(String[] args) {
        MinutesToYears obj = new MinutesToYears();
        obj.minToYrs();
    }
}