package test_JUnit;

import static org.junit.Assert.*;

import java.util.Date;

import org.joda.time.DateTime;
import org.junit.Test;

import com.cricri.Dahouët.metiers.Licencie;
import com.cricri.Dahouët.utils.Calculs;

public class test_calculAge {

	@Test
	public void test() {
		DateTime dt = new DateTime(1973, 12, 11, 12, 12);
		assertEquals(41, Calculs.calculAge(dt.toDate()));

	}

}
