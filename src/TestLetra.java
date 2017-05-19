import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestLetra {

	@Test
	public void test() {
		CalcularLetra cl = new CalcularLetra("26762872");
		assertEquals('A',cl.devuelveLetra());
	}
}
