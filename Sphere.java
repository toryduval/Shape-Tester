import java.lang.Math.*;
public class Sphere{
	double r;

	public Sphere(double r){
		this.r = r;
	}

	public void vol(){
		double v = (4 * (Math.pow(r,3)) * Math.PI) / 3; 
		System.out.println("Volume: " + v);
	}

	public void sArea(){
		double sa = 4 * (Math.pow(r,2)) * Math.PI; 
		System.out.println("Surface Area:" + sa);
	}
}