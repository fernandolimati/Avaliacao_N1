package avaliacao;

import java.util.Date;

import junit.framework.TestCase;

public class PrincipalTest extends TestCase {

	public void testGetHorario() {
		assertEquals(new Date().getTime(), new Principal().getHorario().toDateTimeToday().toDate().getTime(),100);
		//assertTrue((new Date().getTime()-new Principal().getHorario().toDateTimeToday().toDate().getTime())<1);
	}

}
