package Calculator1;

public class Real implements functions {
    private float number_1;
    private float number_2;
    // constructors
    public Real(){

    }
    public Real(float number_1,float number_2){
        setNumber_1(number_1);
        setNumber_2(number_2);
    }
    // getter and setter methods
    public float getNumber_1() {
        return number_1;
    }

    public void setNumber_1(float number_1) {
        this.number_1 = number_1;
    }

    public float getNumber_2() {
        return number_2;
    }

    public void setNumber_2(float number_2) {
        this.number_2 = number_2;
    }

    @Override
    // method for addition
    public float add() {
        return number_2 + number_1;
    }

    @Override
    // method for subtraction
    public float subtract() {
        return number_1 - number_2;
    }


    @Override
    // method for multiplication
    public float multiply() {
        try {
            float result = number_2 * number_1;
            return result;
        } catch (ArithmeticException e) {
            System.err.println("Error: Multiplication result is too large.");
            return Float.POSITIVE_INFINITY; // handle the error in an appropriate way
        }
    }

    @Override
    // method for division
    public float division() {
        try {
            if (number_1 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
                return number_2 / number_1;
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            return Float.NaN;  // handle the error in an appropriate way
        }
    }


}

