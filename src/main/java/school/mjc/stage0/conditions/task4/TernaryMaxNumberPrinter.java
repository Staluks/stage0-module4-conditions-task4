package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result;
        result = first<=second && first<=third ? second <= third? third: second : first;
        System.out.println(result);
    }
}
