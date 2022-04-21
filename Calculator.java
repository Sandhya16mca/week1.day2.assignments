package week1.day2.assignments;

public class Calculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.MyCalculator();
		int Add = obj.addThreeNumbers(5, 7, 9);
		System.out.println(Add);
		int Sub = obj.subTwoNumbers(7, 5);
		System.out.println(Sub);
		double Multiply = obj.multiplyTwoNumbers(8, 8);
		System.out.println(Multiply);
		float Divide = obj.divideTwoNumbers(9, 3);
		System.out.println(Divide);
	}

	public void MyCalculator() {
	}

	public int addThreeNumbers(int a, int b, int c) {
		return a + b + c;
	}

	public int subTwoNumbers(int a, int b) {
		return a - b;
	}

	public double multiplyTwoNumbers(double a, double b) {
		return a * b;
	}

	public float divideTwoNumbers(float a, float b) {
		return a / b;
	}

}