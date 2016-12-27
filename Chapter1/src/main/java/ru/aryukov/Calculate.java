package ru.aryukov;
/**
 *Class Calculate решение задачи 1 урок 1.
 *@author oaryukov
 *@since 26.12.2016
*/
public class Calculate {
	/**
	 * result of calculation.
	 */
	private double result;
	/**
	 * getter for result.
	 * @return result
	 */
	public double getResult() {
		return result;
	}
	/**
	 *add method.
	 *@since 26.12.2016
	 *@param a - argument for add method
	 *@param b - argument for add method
	*/
	public void add(double a, double b) {
		result = a + b;
	}
	/**
	 * substrauct method.
	 * @param a - argument for substract
	 * @param b - argument for substract
	 */
	public void substract(double a, double b) {
		result = a - b;
	}
	/**
	 * div method.
	 * @param  b - argument for substract
	 * @param a -argument for substract
	 */
	public void div(double a, double b) {
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	/**
	 * multiplay method.
	 * @param a - param for method
	 * @param b - argument for substract
	 */
	public  void multiplay(double a, double b) {
		result = a * b;
	}
}

