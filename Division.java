package sample;


public class Division {
    public double division(double a, double b) throws Exception {
        try {
            return (a / b);
        } catch (Exception e) {
            System.out.println("Can't divide by zero ");
        }

return 0 ;
    }
}
