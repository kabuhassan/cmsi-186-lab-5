public class LogarithmicPod extends Pod {
    public LogarithmicPod(String name, double a, double b) {
        super(name, t -> a * java.lang.Math.log(b * (t + 1)));
    }
}