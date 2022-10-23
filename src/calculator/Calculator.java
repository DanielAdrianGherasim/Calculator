package calculator;

public class Calculator {
	public Calculator() {}
	
	public Result addition(double a, double b)
	{
		return new Result(a + b);
	}
	
	public Result substration(double a, double b)
	{
		return new Result(a - b);
	}
	
	public Result multiply(double a, double b)
	{
		return new Result(a * b);
	}
	
	public Result divide(double a, double b)
	{
		if(b != 0) 
		{
			return new Result(a /b);
		}
		return new Result("Nu poti imparti la 0");
	}
}