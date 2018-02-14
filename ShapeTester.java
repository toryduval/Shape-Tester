import java.util.Scanner;

public class ShapeTester{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to shape maker, where you can find volume and surface area for a few shapes!");

		System.out.println("What shape do you want to use? Choose by typing either: box, sphere, or pyramid!");
		String shape = sc.nextLine();

		if (shape.equals("box")){
			System.out.println("Please enter the width of a box: ");
			float width = sc.nextFloat();
			System.out.println("Please enter the height of a box: ");
			float height = sc.nextFloat();
			System.out.println("Please enter the depth of a box: ");
			float depth = sc.nextFloat();

			Box boxOne = new Box(width, height, depth);
			boxOne.vol();
			boxOne.sArea();
		} else if (shape.equals("sphere")){
			System.out.println("Please enter the length of a sphere's radius: ");
			double r = sc.nextDouble();

			Sphere sOne = new Sphere(r);
			sOne.vol();
			sOne.sArea();
		}else if (shape.equals("pyramid")){
			System.out.println("Please enter the width of a pyramid: ");
			double w = sc.nextFloat();
			System.out.println("Please enter the height of a pyramid: ");
			double h = sc.nextFloat();
			System.out.println("Please enter the length of a pyramid: ");
			double l = sc.nextFloat();

			Pyramid pyramidOne = new Pyramid(w, h, l);
			pyramidOne.vol();
			pyramidOne.sArea();
		}else {
			System.out.println("Sorry, there was an error!");
		}
	}
}

