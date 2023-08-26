package amazonimplementation;

import java.util.ArrayList;
import java.util.List;

public class AddToCart {

	private String productType;
	private int price;
	public AddToCart(String productType, int price) {
		this.productType = productType;
		this.price = price;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<String> getProductTypeList(){
		List<String> productTypeList=new ArrayList<String>();
		productTypeList.add("iPhone 3GS");
		productTypeList.add("iPhone 4s");
		productTypeList.add("iPhone 4");
		productTypeList.add("iPhone 5");
		return productTypeList;
	}
}
