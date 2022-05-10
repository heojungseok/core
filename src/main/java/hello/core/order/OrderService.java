package hello.core.order;

public interface OrderService {
    //주문 생성할 때 회원id, 상품명, 상품 가격을 파라미터로 넘기면 리턴으로 주문 결과 반환
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
