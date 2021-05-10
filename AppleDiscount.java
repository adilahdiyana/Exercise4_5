package Exercise4_5;

//discount for Apple
class AppleDiscount implements Discount { //lebih kurang sama dgn extends
	//method implementation
	public float rateOfDiscount() {
		return 9.15f;
	}
}

//discount for Green Apple
class GreenAppleDiscount implements Discount {
	//method implementation
	public float rateOfDiscount() {
		return 8.15f;
	}
}

//discount for Red Apple
class RedAppleDiscount implements Discount {
	//method implementation
	public float rateOfDiscount() {
		return 7.15f;
	}
}

