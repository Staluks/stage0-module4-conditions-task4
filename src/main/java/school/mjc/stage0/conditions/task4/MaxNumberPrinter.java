package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if(first<=second && first<=third){
            if(second<=third){
                   System.out.println(third);
            }else {
                System.out.println(second);
            }
        } else {
            System.out.println(first);
        }
    }
}
