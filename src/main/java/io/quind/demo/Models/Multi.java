package io.quind.demo.Models;

/**
 * Class Mult, this class is used for declare all the parameters need and do one multiplication
 * beetween two numbers.
 * */
public class Multi {

    int num1 = 0;
    int num2 = 0;
    int result = 0;

    /**
     * @param num1, this variable is used for save the first number for the multiplication operate.
     * @param num2, this variable is used for save the second number of the multiplication operate.
     * @param result, this variable is used for save the result of the operate beetween
     * the first parameter and second parameter
     * */
    public Multi(int num1, int num2, int result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    public Multi() { }

    public int multi (int num1, int num2 ){ return num1 * num2; }
}
