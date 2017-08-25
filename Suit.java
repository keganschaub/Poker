
public enum Suit {
	Clubs(0), Diamonds(1), Hearts(2), Spades(3);
	
	private int value;
	
	Suit(int value){
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
