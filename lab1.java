import static java.lang.Math.*;

public class lab1 {

	public static void main(String[] args) {
		try {
			short[] f = new short[Integer.parseInt(args[0])];
			for (int i = 0; i < f.length; i++) {
				f[i] = (short) (15 - 2 * i);
			}
			
			float[] x = new float[Integer.parseInt(args[1])];
			for (int i = 0; i < x.length; i++) {
				x[i] = (float) (random() * (14 - (-15)) - 15);
			}

			float[][] f1 = new float[f.length][x.length];
			for (int i = 0; i < f1.length; i++) {
				for (int j = 0; j < f1[i].length; j++) {
					f1[i][j] = element(f[i], x[j]);
				}
			}

		output(f1);
	} catch (Exception e) {
		System.err.println("Ошибка: " + e);
	}
}	

	public static float element(short f, float x) {
		if (f == 15) {
			return (float) sin(cos(cos(x)));
		} else if (f == 3 || f == 7 || f == 13) {
			return (float) pow(asin(1 / exp(abs(x))), 3);
		} else {
			double fact1 = pow(pow(cos(x) / PI, atan((x - 0.5) / 29)) / 2, 3);
			double fact2 = 1 - cbrt(pow(2 * x, 2) * (4 / (pow(x / (x + 1), 3) + 1)));
			return (float) (fact1 * pow(fact2, 2));
		}
	}

	public static void output(float[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%6.4f ", a[i][j]);
			}
			System.out.println();
		}
	}
}

