package bai1;

public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order();
        
        // Bắt đầu với trạng thái Mới tạo
        System.out.println("Trạng thái ban đầu của đơn hàng: Mới tạo");
        order.handleOrder();
        
        // Trạng thái tiếp theo sẽ là Đang xử lý
        System.out.println("\nTrạng thái sau khi chuyển: Đang xử lý");
        order.handleOrder();
        
        // Trạng thái tiếp theo sẽ là Đã giao
        System.out.println("\nTrạng thái sau khi chuyển: Đã giao");
        order.handleOrder();
        
        // Giả sử đơn hàng bị hủy
        System.out.println("\nTrạng thái sau khi chuyển: Hủy");
        order.setState(new CancelledOrderState());
        order.handleOrder();
    }
}
