/*
Consider quadratic Diophantine equations of the form:

x^2 – D×y^2 = 1

For example, when D=13, the minimal solution in x is 649^2 – 13×180^2 = 1.

It can be assumed that there are no solutions in positive integers when D is square.

By finding minimal solutions in x for D = {2, 3, 5, 6, 7}, we obtain the following:

    3^2 – 2×2^2 = 1
    2^2 – 3×1^2 = 1
    9^2 – 5×4^2 = 1
    5^2 – 6×2^2 = 1
    8^2 – 7×3^2 = 1

Hence, by considering minimal solutions in x for D ≤ 7, the largest x is obtained when D=5.

Find the value of D ≤ 1000 in minimal solutions of x for which the largest value of x is obtained.
*/
public class Main {

    public static void main(String[] args) {
        /*
        For d in [1, 1000]
            Find maximum x that solves the equation
            x = sqrt(d×y^2 + 1)
         */
        int maxD = 0, maxX = 0, x;
        for(int d = 1; d <= 1000; d++) {
            x = solveEquation(d);
            if(x > maxX) {
                maxX = x;
                maxD = d;
            }
        }

        System.out.println(maxD);
    }

    /**
     * Solves the diophantine equation defined by:
     *  x = sqrt(d×y<super>2</super> + 1)
     *
     * x and y must both be positive integers.
     *
     * @param d An integer
     * @return The maximum value for x that satisfies the equation.
     */
    static int solveEquation(int d) {
        // Code here
    }
}
