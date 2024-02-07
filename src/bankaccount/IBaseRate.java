package bankaccount;

public interface IBaseRate {
	//method for base rate
	default double getBaseRate() {
		return 2.5;
	}
	

	void setRate();
}
