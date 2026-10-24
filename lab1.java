import static java.lang.Math.*;

public class lab1{
	
	float[][] f2 = new float[7][18];

	public void main(String[] args){
		short[] f1={15, 13, 11, 9, 7, 5, 3};

		float[] x = new float[18];
		for(int i = 0; i < x.length; i++){
			x[i] = (float) (Math.random() * (14 - (-15)) - 15);
		}

		element(f1, x);
		
		output();
	}
	
	public void element(short[] f1, float[] x){
		for(int i = 0; i < f2.length; i++){
			for(int j = 0; j < f2[i].length; j++){
				if(f1[i]==15){
					f2[i][j] = (float)sin(cos(cos(x[j])));
				}
				else if(f1[i]==3 || f1[i]==7 || f1[i]==13){
					f2[i][j] = (float)pow(asin(1/pow(E, abs(x[j]))), 3);
				}
				else{
					float fact1 = (float)pow(pow(cos(x[j])/PI, atan((x[j]-0.5)/29))/2, 3);
					float fact2 = (float) 1 - (float) cbrt( pow(2 * x[j], 2) * (4 / (pow(x[j] / (x[j] + 1), 3) + 1)) );
					f2[i][j] = fact1*(float)pow(fact2, 2);	
				}
			}
		}
	}
	public void output(){
		for(int i = 0; i < f2.length; i++){
			for(int j = 0; j < f2[i].length; j++){
				System.out.printf("%.4f ", f2[i][j]);
			}		
			System.out.println("");
		}
	}
}
