class InvalidInputException extends Exception {
    public String toString() {
        return "can't add this number";
    }

    public String getMessage() {
        return "getmessage()";
    }
}

class CannotDivideByZeroException extends Exception {
    public String toString() {
        return "number can't divide by zero";
    }

    public String getMessage() {
        return "getmessage()";
    }
}

class MaxInputException extends Exception {
    public String toString() {
        return "can not enter number greater than 100000";
    }

    public String getMessage() {
        return "getmessage()";
    }
}
class MaxMultiplyInputException extends Exception {
    public String toString() {
        return "can not enter number greater than 7000";
    }

    public String getMessage() {
        return "getmessage()";
    }
}

class CustomCalculator {
    int add(int a, int b) throws InvalidInputException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        return a + b;
    }

    int sub(int a, int b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    int mul(int a, int b) throws MaxInputException,MaxMultiplyInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }else if (a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    int div(int a, int b) throws CannotDivideByZeroException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (b == 0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}


public class calculator {
    public static void main(String[] args)
            throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException {
        CustomCalculator c = new CustomCalculator();
        // c.add(8, 9);
        //c.add(100000000, 5000000);
        c.mul(8000, 8000);

    }
}