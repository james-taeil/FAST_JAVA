package ch08;

public class Order {

    public String orderId;
    public String phoneNumber;
    public String orderAddress;
    public String orderDate;
    public String orderTime;
    public String orderPrice;
    public String orderMenuNumber;

    public Order(){}

    public Order(
            String orderId,
            String phoneNumber,
            String orderAddress,
            String orderDate,
            String orderTime,
            String orderPrice,
            String orderMenuNumber
    ){

        this.orderId = orderId;
        this.phoneNumber = phoneNumber;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.orderMenuNumber = orderMenuNumber;

    }

    public String showOrderInfo() {

        return "주문 접수 번호 : " + orderId+ "\n" +
                "주문 핸드폰 번호 : " + phoneNumber+ "\n" +
                "주문 집 주소 : " + orderAddress+ "\n" +
                "주문 날짜 : " + orderDate+ "\n" +
                "주문 시간 : " + orderTime+ "\n" +
                "주문 가격 : " + orderPrice+ "\n" +
                "메뉴 번호 : " + orderMenuNumber;
    }


}
