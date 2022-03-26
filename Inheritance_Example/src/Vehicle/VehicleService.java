package Vehicle;

/** 
* @Author -- TkGitcode
*/
public class VehicleService {

	public static void main(String[] args) {
		FullService v=new FullService();
		WaterWash d=new WaterWash();
		System.out.println(v.CarDetail());
		System.out.println(v.BikeDetail());
		System.out.println(d.BikeDetail());
		System.out.println(d.CarDetail());
		//System.out.println(d.CarDetail());
		


	}

}
