import java.text.DecimalFormat;

public class Modify {

	
	public String CalcModified (double payment)
	{
	DecimalFormat dFormat = new DecimalFormat("####,###,###.##");
	return("$" + dFormat.format(payment));
	}
}
