package TesteoMinMax;

import org.junit.*;
import MinMax_package.MinMax;

public class CajaBlanca {
	private int[] xs;
	
	@Before
	public void inicio(){
		xs = null;
	}
	
	@After
	public void fin(){
		inicio();
	}
	
	@Test
	public void statementCoverage(){
		xs =new int[] {2,1,3,0};
		MinMax.minMax(xs);
	}
	
	@Test
	public void decisionCoverage(){
		xs =new int[] {0,1};
		MinMax.minMax(xs);
		xs =null;
		MinMax.minMax(xs);		
	}
	
	@Test
	public void conditionCoverage(){
		xs =new int[] {0,1};
		MinMax.minMax(xs);
		xs = null;
		MinMax.minMax(xs);
	}
	
	@Test
	public void decisionConditionCoverage(){
		decisionCoverage();
		conditionCoverage();
	}

}
