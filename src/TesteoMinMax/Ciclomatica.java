package TesteoMinMax;

import org.junit.*;

import MinMax_package.EmptyNumberException;
import MinMax_package.MinMax;

public class Ciclomatica {
	private int[] xs;
	
	@Before
	public void inicio(){
		xs = null;
	}
	
	@Test
	public void primerCamino(){
		xs =new int[] {2,1};
		MinMax.minMax(xs);
	}
	
	@Test(expected = EmptyNumberException.class)
	public void segundoCamino(){
		MinMax.minMax(xs);
	}
	
	@Test
	public void tercerCamino(){
		xs =new int[] {1};
		MinMax.minMax(xs);
	}
	
	@Test
	public void cuartoCamino(){
		xs =new int[] {2,3,0};
		MinMax.minMax(xs);
	}

}
