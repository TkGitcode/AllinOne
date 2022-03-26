package Vehicle;
/** 
* @Author -- TkGitcode
*/
public class FullService extends WaterWash {
	
	@Override
	public int CarDetail()
	{
		System.out.println("Car Full Service");
		return super.BasicPay()+1000;
		
	}
	@Override
	public int BikeDetail()
	{
		System.out.println("Bike Full Service");
		return super.BasicPay()+300;
	}
}
