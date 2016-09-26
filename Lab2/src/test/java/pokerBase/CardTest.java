package pokerBase;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerBase.Card;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class CardTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCardGetters() {
		Card testcard = new Card(eSuit.SPADES , eRank.SEVEN, 3);
		
		assertTrue(testcard.geteSuit() == eSuit.SPADES);
		assertTrue(testcard.geteRank() == eRank.SEVEN);
		assertTrue(testcard.getiCardNbr() == 3);
	}
	@Test
	public void testCardSetters() {
		
	}
}
