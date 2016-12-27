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
	private static double result;
	/**
	 * getter for result.
	 * @return result
	 */
	public static double getResult() {
		return result;
	}
	/**
	 *add method.
	 *@since 26.12.2016
	 *@param a - argument for add method
	 *@param b - argument for add method
	*/
	public static void add(double a, double b) {
		result = a + b;
	}
	/**
	 * substrauct method.
	 * @param a - argument for substract
	 * @param b - argument for substract
	 */
	public static void substract(double a, double b) {
		result = a - b;
	}
	/**
	 * div method.
	 * @param  b - argument for substract
	 * @param a -argument for substract
	 */
	public static void div(double a, double b) {
		result = a / b;
	}
	/**
	 * multiplay method.
	 * @param a - param for method
	 * @param b - argument for substract
	 */
	public static void multiplay(double a, double b) {
		result = a * b;
	}
}

