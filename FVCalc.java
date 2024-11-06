// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		int moneySum = Integer.parseInt(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double moneyWithInterest = moneySum * Math.pow(1 + interestRate / 100, years);
		System.out.println("After " + years + " years, $" + moneySum + " saved at " + interestRate + "% will yield $"
				+ (int) moneyWithInterest);
	}
}