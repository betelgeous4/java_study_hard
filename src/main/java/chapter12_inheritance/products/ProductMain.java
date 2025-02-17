package chapter12_inheritance.products;

import chapter08_classes.products.Product;

public class ProductMain {
    public static void main(String[] args) {
        Item item1 = new Item("일반 상품", "일반 카테고리");
        // item1.displayInfo() : 이상의 코드가 오류가 발생한다는 점에서,
        // 자식은 부모의 필드 및 메서드를 사용 가능하지만 부모 클래스의 객체는
        // 자식 클래스의 필드 및 메서드를 사용하지 못 한다는 것을 알 수 있다.

        System.out.println("이 상품의 이름은 " + item1.getName() + "이고, 카테고리는 " + item1.getCategory() + "입니다.");

        /*
            Product 클래스의 인스턴스인 product1을 생성하고,
            이름 -> 전자제품
            카테고리 -> 가전제품
            가격 -> 100000
            재고 -> 10 으로 생성하라
            setter 사용해 가전제품을 백색 가전제품으로 바꾸고
            getter 사용해서 해당 상품은 백색 가전 제품입니다. 를 콘솔에 출력하라.
            다 바꾼 뒤 product1.displayInfo()를 통해 전체 정보를 출력하라.
         */

        Products product1 = new Products("전자제품", "가전제품", 100000, 10);
        product1.setCategory("백색 가전 제품");
        System.out.println("해당 제품은 " + product1.getCategory() + "입니다.");

        product1.displayInfo();
    }
}
