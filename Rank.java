
public enum Rank {
	Deuce(0), Three(1), Four(2), Five(3), 
	Six(4), Seven(5), Eight(6), Nine(7), 
	Ten(8), Jack(9), Queen(10), King(11), Ace(12);
	
	private int value;
	
	Rank(int value){
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
