package lab1.task9;


import lab1.task8.CustomDouble;

public class Calculate {
    public double calculate1(int a, int b, char sign) {
        switch (sign) {
            case '+': {
                return a + b;
            }
            case '-': {
                return a - b;
            }
            case '*': {
                return a * b;
            }
            case '/': {
                if (b == 0) {
                    System.out.println("you can not divide a number by zero");
                    return 0;
                }
                return a / b;
            }

            default: {
                System.out.println("Wrong sign");
            }
        }
        return 0;
    }


    public double calculate2(double a, double b, char operator) {
        CustomDouble c = new CustomDouble(a);
        CustomDouble c1 = new CustomDouble(b);

        switch (operator) {
            case '+': {
                return c.sum(c1).toDouble();
            }
            case '-': {
                return c.dif(c1).toDouble();

            }
            case '*': {
                return c.mul(c1).toDouble();
            }
            case '/': {
                if (a == 0) {
                    System.out.println("you cannot divide a number by zero");
                    return 0;
                }
                return c.div(c1).toDouble();
            }
            default: {
                System.out.println("wrong sign");
            }
            break;
        }
        return 0;
    }

}
