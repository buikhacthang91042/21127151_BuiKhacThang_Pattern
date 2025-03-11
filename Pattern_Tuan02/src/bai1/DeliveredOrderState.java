package bai1;

public class DeliveredOrderState implements OrderState {

	@Override
	public void handleOrder(Order order) {
		// TODO Auto-generated method stub
		System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
	}

}
