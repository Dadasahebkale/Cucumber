package amazonimplementation;

public class BatteryTypes {

	public String DisplayBatteryList(AddToCart types) {
		
		if(types.getProductTypeList().contains(types.getProductType())) {
			return types.getProductType();
		}
		return null;
	}
}
