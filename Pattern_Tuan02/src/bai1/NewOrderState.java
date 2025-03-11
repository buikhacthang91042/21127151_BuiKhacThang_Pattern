package bai1;

public class NewOrderState implements OrderState {

	@Override
	public void handleOrder(Order order) {
		// TODO Auto-generated method stub
		System.out.println("Kiểm tra thông tin đơn hàng.");
        order.setState(new ProcessingOrderState());
	}

}
