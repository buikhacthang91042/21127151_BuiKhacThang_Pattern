package bai1;

public class Order {
	private OrderState state;

	public Order() {
        // Mới tạo đơn hàng ban đầu sẽ ở trạng thái New
        state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void handleOrder() {
        state.handleOrder(this);
    }

	public OrderState getState() {
		return state;
	}
	
	
}
