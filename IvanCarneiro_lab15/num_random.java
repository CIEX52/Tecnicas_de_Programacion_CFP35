import java.util.Random;


public class num_random {

    public static int rand(int min, int max) {
		
        if (min > max || (max - min > Integer.MAX_VALUE)) {
			throw new IllegalArgumentException("Rango inválido!");
		}
		return new Random().nextInt(max - min) + min;
	}

    public static void main(String[] args){
        int min = -99;
        int max = 99;
        System.out.println(rand(min, max));
    }

}
