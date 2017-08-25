import static org.junit.Assert.*;

import org.junit.Test;

public class TestPokerGame {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Card C2 = new Card(Rank.Deuce, Suit.Clubs);
		Card C3 = new Card(Rank.Three, Suit.Clubs);
		Card C4 = new Card(Rank.Four, Suit.Clubs);
		Card C5 = new Card(Rank.Five, Suit.Clubs);
		Card C6 = new Card(Rank.Six, Suit.Clubs);
		Card C7 = new Card(Rank.Seven, Suit.Clubs);
		Card C8 = new Card(Rank.Eight, Suit.Clubs);
		Card C9 = new Card(Rank.Nine, Suit.Clubs);
		Card C10 = new Card(Rank.Ten, Suit.Clubs);
		Card CJ = new Card(Rank.Jack, Suit.Clubs);
		Card CQ = new Card(Rank.Queen, Suit.Clubs);
		Card CK = new Card(Rank.King, Suit.Clubs);
		Card CA = new Card(Rank.Ace, Suit.Clubs);

		Card D2 = new Card(Rank.Deuce, Suit.Diamonds);
		Card D3 = new Card(Rank.Three, Suit.Diamonds);
		Card D4 = new Card(Rank.Four, Suit.Diamonds);
		Card D5 = new Card(Rank.Five, Suit.Diamonds);
		Card D6 = new Card(Rank.Six, Suit.Diamonds);
		Card D7 = new Card(Rank.Seven, Suit.Diamonds);
		Card D8 = new Card(Rank.Eight, Suit.Diamonds);
		Card D9 = new Card(Rank.Nine, Suit.Diamonds);
		Card D10 = new Card(Rank.Ten, Suit.Diamonds);
		Card DJ = new Card(Rank.Jack, Suit.Diamonds);
		Card DQ = new Card(Rank.Queen, Suit.Diamonds);
		Card DK = new Card(Rank.King, Suit.Diamonds);
		Card DA = new Card(Rank.Ace, Suit.Diamonds);

		Card H2 = new Card(Rank.Deuce, Suit.Hearts);
		Card H3 = new Card(Rank.Three, Suit.Hearts);
		Card H4 = new Card(Rank.Four, Suit.Hearts);
		Card H5 = new Card(Rank.Five, Suit.Hearts);
		Card H6 = new Card(Rank.Six, Suit.Hearts);
		Card H7 = new Card(Rank.Seven, Suit.Hearts);
		Card H8 = new Card(Rank.Eight, Suit.Hearts);
		Card H9 = new Card(Rank.Nine, Suit.Hearts);
		Card H10 = new Card(Rank.Ten, Suit.Hearts);
		Card HJ = new Card(Rank.Jack, Suit.Hearts);
		Card HQ = new Card(Rank.Queen, Suit.Hearts);
		Card HK = new Card(Rank.King, Suit.Hearts);
		Card HA = new Card(Rank.Ace, Suit.Hearts);

		Card S2 = new Card(Rank.Deuce, Suit.Spades);
		Card S3 = new Card(Rank.Three, Suit.Spades);
		Card S4 = new Card(Rank.Four, Suit.Spades);
		Card S5 = new Card(Rank.Five, Suit.Spades);
		Card S6 = new Card(Rank.Six, Suit.Spades);
		Card S7 = new Card(Rank.Seven, Suit.Spades);
		Card S8 = new Card(Rank.Eight, Suit.Spades);
		Card S9 = new Card(Rank.Nine, Suit.Spades);
		Card S10 = new Card(Rank.Ten, Suit.Spades);
		Card SJ = new Card(Rank.Jack, Suit.Spades);
		Card SQ = new Card(Rank.Queen, Suit.Spades);
		Card SK = new Card(Rank.King, Suit.Spades);
	}

	@Test
	public void testPairBeatsHighHand() {
		PokerHand pair = new PokerHand(new Card(Rank.Deuce, Suit.Clubs),
				new Card(Rank.Seven, Suit.Diamonds), new Card(Rank.Jack,
						Suit.Hearts), new Card(Rank.Ace, Suit.Spades),
				new Card(Rank.Ace, Suit.Hearts));

		PokerHand aceHigh = new PokerHand(new Card(Rank.Deuce, Suit.Diamonds),
				new Card(Rank.Seven, Suit.Hearts), new Card(Rank.Jack,
						Suit.Spades), new Card(Rank.Ace, Suit.Clubs), new Card(
						Rank.Three, Suit.Hearts));

		assertTrue(pair.compareTo(aceHigh) > 0);
	}

	@Test
	public void testTwoPairBeatsPairHand() {
		PokerHand pair = new PokerHand(new Card(Rank.Deuce, Suit.Clubs),
				new Card(Rank.Seven, Suit.Diamonds), new Card(Rank.Jack,
						Suit.Hearts), new Card(Rank.Ace, Suit.Spades),
				new Card(Rank.Ace, Suit.Hearts));

		PokerHand twoPair = new PokerHand(new Card(Rank.Deuce, Suit.Diamonds),
				new Card(Rank.Deuce, Suit.Hearts), new Card(Rank.Jack,
						Suit.Spades), new Card(Rank.Ace, Suit.Clubs), new Card(
						Rank.Three, Suit.Hearts));

		assertTrue(twoPair.compareTo(pair) > 0);
	}
	@Test
	public void testThreeOfKindBeatsTwoPairHand() {
		PokerHand threeOfKind = new PokerHand(new Card(Rank.Seven, Suit.Clubs),
				new Card(Rank.Seven, Suit.Diamonds), new Card(Rank.Jack,
						Suit.Hearts), new Card(Rank.Seven, Suit.Spades),
				new Card(Rank.Ace, Suit.Hearts));

		PokerHand twoPair = new PokerHand(new Card(Rank.Deuce, Suit.Diamonds),
				new Card(Rank.Deuce, Suit.Hearts), new Card(Rank.Jack,
						Suit.Spades), new Card(Rank.Ace, Suit.Clubs), new Card(
						Rank.Three, Suit.Hearts));

		assertTrue(threeOfKind.compareTo(twoPair) > 0);
	}
	@Test
	public void testStraightBeatsThreeOfKindHand() {
		PokerHand threeOfKind = new PokerHand(new Card(Rank.Seven, Suit.Clubs),
				new Card(Rank.Seven, Suit.Diamonds), new Card(Rank.Jack,
						Suit.Hearts), new Card(Rank.Seven, Suit.Spades),
				new Card(Rank.Ace, Suit.Hearts));

		PokerHand straight = new PokerHand(new Card(Rank.Deuce, Suit.Diamonds),
				new Card(Rank.Three, Suit.Hearts), new Card(Rank.Four,
						Suit.Spades), new Card(Rank.Five, Suit.Clubs), new Card(
						Rank.Six, Suit.Hearts));

		assertTrue(straight.compareTo(threeOfKind) > 0);
	}
	@Test
	public void testFlushBeatsStraightHand() {
		PokerHand flush = new PokerHand(new Card(Rank.Seven, Suit.Clubs),
				new Card(Rank.Seven, Suit.Clubs), new Card(Rank.Jack,
						Suit.Clubs), new Card(Rank.Seven, Suit.Clubs),
				new Card(Rank.Ace, Suit.Clubs));

		PokerHand straight = new PokerHand(new Card(Rank.Deuce, Suit.Diamonds),
				new Card(Rank.Three, Suit.Hearts), new Card(Rank.Four,
						Suit.Spades), new Card(Rank.Five, Suit.Clubs), new Card(
						Rank.Six, Suit.Hearts));

		assertTrue(flush.compareTo(straight) > 0);
	}
	@Test
	public void testFullHouseBeatsFlush() {
		PokerHand flush = new PokerHand(new Card(Rank.Seven, Suit.Clubs),
				new Card(Rank.Seven, Suit.Clubs), new Card(Rank.Jack,
						Suit.Clubs), new Card(Rank.Seven, Suit.Clubs),
				new Card(Rank.Ace, Suit.Clubs));

		PokerHand fullHouse = new PokerHand(new Card(Rank.Three, Suit.Diamonds),
				new Card(Rank.Deuce, Suit.Hearts), new Card(Rank.Deuce,
						Suit.Spades), new Card(Rank.Three, Suit.Clubs), new Card(
						Rank.Three, Suit.Hearts));

		assertTrue(fullHouse.compareTo(flush) > 0);
	}
	@Test
	public void testFourOfKindBeatsFullHouseHand() {
		PokerHand FourOfKind = new PokerHand(new Card(Rank.Nine, Suit.Clubs),
				new Card(Rank.Nine, Suit.Clubs), new Card(Rank.Jack,
						Suit.Clubs), new Card(Rank.Nine, Suit.Clubs),
				new Card(Rank.Nine, Suit.Clubs));

		PokerHand fullHouse = new PokerHand(new Card(Rank.Three, Suit.Diamonds),
				new Card(Rank.Deuce, Suit.Hearts), new Card(Rank.Deuce,
						Suit.Spades), new Card(Rank.Three, Suit.Clubs), new Card(
						Rank.Three, Suit.Hearts));

		assertTrue(FourOfKind.compareTo(fullHouse) > 0);
	}
	@Test
	public void testStraightFlushBeatsFourOfKindHand() {
		PokerHand FourOfKind = new PokerHand(new Card(Rank.Nine, Suit.Clubs),
				new Card(Rank.Nine, Suit.Clubs), new Card(Rank.Jack,
						Suit.Clubs), new Card(Rank.Nine, Suit.Clubs),
				new Card(Rank.Nine, Suit.Clubs));

		PokerHand straightFlush = new PokerHand(new Card(Rank.Ace, Suit.Hearts),
				new Card(Rank.Queen, Suit.Hearts), new Card(Rank.King,
						Suit.Hearts), new Card(Rank.Jack, Suit.Hearts), new Card(
						Rank.Ten, Suit.Hearts));

		assertTrue(straightFlush.compareTo(FourOfKind) > 0);
	}
	

}
