package MinMax_package;

public class MinMax {
	
	public static int[] minMax(int[] xs){
		int[] result=null;
		int mi, ma;
		if(xs != null){
			mi = ma = xs[0];
			for(int n : xs){
				if(n > ma){
					ma = n;
				}else if(n < mi){
					mi = n;
				}
			}
			result =new int[] {mi,ma};
		}else{
			throw new EmptyNumberException("No se admite número negativo");
		}
		return result;
	}
}
