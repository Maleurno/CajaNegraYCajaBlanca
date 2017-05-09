package MinMax_package;

import static org.junit.Assert.*;

import org.junit.*;

public class CajaNegra {
	private int[] xs;
	private static final double EPSILON = 1e-15; 
	
	@Before
	public void inicio(){
		xs =new int[] {0};
	}

	@Test
	public void comprobarTamano() {
		xs = MinMax.minMax(xs);
		int tam = xs.length;
		assertEquals(2,tam,EPSILON);
	}
	
	@Test
	public void comprobarResultadoIgualACero(){
		xs = MinMax.minMax(xs);
		assertEquals(0,xs[0],EPSILON);
		assertEquals(0,xs[1],EPSILON);
	}
	
	@Test
	public void comprobarResultadoDiferenteACero(){
		xs =new int[] {1};
		xs = MinMax.minMax(xs);
		assertEquals(1,xs[0],EPSILON);
		assertEquals(1,xs[1],EPSILON);
	}
	
	@Test
	public void comprobarResultadosPrimeroMenorSegundoMayor(){
		xs =new int[] {0,1};
		xs = MinMax.minMax(xs);
		assertEquals(0,xs[0],EPSILON);
		assertEquals(1,xs[1],EPSILON);
	}
	
	@Test
	public void comprobarResultadosPrimeroMayorSegundoMenor(){
		xs =new int[] {1,0};
		xs = MinMax.minMax(xs);
		assertEquals(0,xs[0],EPSILON);
		assertEquals(1,xs[1],EPSILON);
	}
	
	@Test
	public void comprarResultadosConMasDeDosValores(){
		xs =new int[] {1,0,2};
		xs = MinMax.minMax(xs);
		assertEquals(0,xs[0],EPSILON);
		assertEquals(2,xs[1],EPSILON);
	}

}
