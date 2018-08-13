package other;
/**
 * 	给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 
 * 	这题没什么难度,注意别被坑就好,指数可能是负数可能是负数
 */
public class Power {
	public double power(double base, int exponent) {
		double result = 1;
		if(exponent == 0) {
			return result;
		}
		
		for (int i = 0; i < Math.abs(exponent); i++) {
			result *= base;
		}
		
		if (exponent < 0) {
			result = 1/result ;
		}
		return result;
	}
}
