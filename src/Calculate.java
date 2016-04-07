
public class Calculate {

	double principal1;

	double rate1;
	double term1;

	public Calculate(){
		
	}
	public Calculate(double num1,double num2, double num3)
    {
        principal1=num1;
        rate1=num2;
        term1=num3;
     
    }

	

public double getPrincipal1() {
		return principal1;
	}
//	public void setPrincipal1(double principal1) {
//		this.principal1 = principal1;
//	}
	public double getRate1() {
		return rate1;
	}
//	public void setRate1(double rate1) {
//		this.rate1 = rate1;
//	}
	public double getTerm1() {
		return term1;
	}
//	public void setTerm1(double term1) {
//		this.term1 = term1;
//	}
	
   
	//Method for calculations

public double CalcMortgage (double principal, double rate, double term)
{
return ((principal * rate) / (1 - Math.pow(1 + rate, -term)));	
}
	


	
	
}
