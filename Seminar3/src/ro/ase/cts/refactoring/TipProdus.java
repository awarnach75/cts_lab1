package ro.ase.cts.refactoring;

public enum TipProdus {
NEW(0),
ONSALE(0.1f),
LIMITED(0.25f),
ENDOFSEASON(0.35f);

	private float discount;
	
	TipProdus(float discount) {
		this.discount = discount;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	
}
