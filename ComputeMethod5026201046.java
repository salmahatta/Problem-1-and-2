import java.util.*;

public class ComputeMethod5026201046 {
	public double fToc (double degreeF) {
		return (5.0/9*(degreeF-32));
	}
	public double hypotenuse (int a, int b) {
		return (Math.sqrt((a*a)+(b*b)));
	}
	public int roll() {
		Random dice = new Random();
		return ((dice.nextInt(6)+1) + (dice.nextInt(6)+1));
 	}
}