import java.util.List;

/**
 * class providing a method that computes the value of Fibonacci series of an Integer number
 * @Author Christian Berdejo Sánchez
 */

public class Fibonacci {

    public int compute(int number) {
        if (number < 0) throw new RuntimeException("negative number:" + number);
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;
        else
            return compute(number - 1) + compute(number - 2);

    }
}


