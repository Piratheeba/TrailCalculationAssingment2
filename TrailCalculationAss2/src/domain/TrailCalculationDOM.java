package domain;

public class TrailCalculationDOM {
	
	private String NICNO;
	private int Loan_id;
	private String Date;
	private double Loan_amount;
	private double interest_rate;
	private int repayment_period;
	private double Rental_value;
	
	public String getNICNO() {
		return NICNO;
	}
	public void setNICNO(String nICNO) {
		NICNO = nICNO;
	}
	public int getLoan_id() {
		return Loan_id;
	}
	public void setLoan_id(int loan_id) {
		Loan_id = loan_id;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public double getLoan_amount() {
		return Loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		Loan_amount = loan_amount;
	}
	public double getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}
	public int getRepayment_period() {
		return repayment_period;
	}
	public void setRepayment_period(int repayment_period) {
		this.repayment_period = repayment_period;
	}
	public double getRental_value() {
		return Rental_value;
	}
	public void setRental_value(double rental_value) {
		Rental_value = rental_value;
	}
	
	

}
