class Pyramid{
	double w;
	double h;
	double l;

	public Pyramid(double w, double h, double l){
		this.w = w;
		this.h = h;
		this.l = l;
	}

	public void vol(){
		double v = (w * h * l) / 3;
		System.out.println("Volume: " + v);
	}

	public void sArea(){
		double a = Math.pow((w / 2), 2);
		double b = Math.pow(h, 2);
		double ab = Math.pow((a + b), (.5));

		double c = Math.pow((l / 2), 2);
		double d = Math.pow(h, 2);
		double cd = Math.pow((c + d), (.5));

		double sa = (l * w) + (l * ab) + (w * cd);
		System.out.println("Surface Area:" + sa);
	}
}