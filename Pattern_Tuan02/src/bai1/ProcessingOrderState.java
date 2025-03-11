package bai1;

public class ProcessingOrderState implements OrderState {

	@Override
	public void handleOrder(Order order) {
		// TODO Auto-generated method stub
		System.out.println("Đóng gói và vận chuyển.");
        order.setState(new DeliveredOrderState());
	}

}
