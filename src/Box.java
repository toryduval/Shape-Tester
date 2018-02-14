public class Box{

	float w;
	float h;
	float d;

	public Box(float w, float h, float d){
		this.w = w;
		this.h = h;
		this.d = d;
	}

	public void vol(){
		float v = w * h * d;
		System.out.println("Volume: " + v);
	}

	public void sArea(){
		
		float wh = w * h;
		float wd = w * d;
		float hd = h * d;
		float sa = (wh + wd + hd) * 2;
		System.out.println("Surface Area:" + sa);
	}
}
