package MinMax_package;

public class MinMax {
	
	public static int[] minMax(int[] xs){
		int[] result=null;
		int mi, ma;
		if(xs != null && xs.length != 0){
			mi = ma = xs[0];
			for(int i = 1; i< xs.length; i++){
				int n =xs [i];
				if(n > ma){
					ma = n;
				}else if(n < mi){
					mi = n;
				}
			}
			result =new int[] {mi,ma};
		}
		return result;
	}
}
