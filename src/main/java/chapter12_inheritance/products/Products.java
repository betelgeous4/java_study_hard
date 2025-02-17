package chapter12_inheritance.products ;
/*
    부모클래스 Item
    자식 클래스 Product
    실행 클래스 ProductMain 클래스 생성

    1. field 로 private String name, private String category 선언
    2. 필드 둘 다 사용하는 생성자 작성
        생성자 name, category 하나만 가지는 생성자를 2 개 만드는 것은 불가능하다.
        Item("스트링 자료형")을 argument 로 받았다고 가정할 때, 컴퓨터는 "스트링 자료형"을
        name 에 대입해야 하는지 아님 category 에 대입해야 하는지 모른다.
    3. Setter/getter 작성
    4. Product.java 가서 Item - 부모클래스 / Products - 자식 클래스가 되도록 명령어 입력

 */
public class Products extends Item{
   // 자식 클래스 만의 field 를 선언
     private int price;
     private int stock;

    public Products(String name, String category, int price, int stock) {
        super(name, category);   //부모의 field 들을 가지고 오는 super() 키워드
        this.price = price;      // 자식 클래스의 필드 생ㅅ어자 만들 때 썼던 것
        this.stock = stock;
    }

    // 부모 필드에 관한 setter / getter

    public Products(String name, String category) {
        super(name, category);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }


    // 자식 필드에 관한 setter / getter

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // 고유 메서드
    public void displayInfo(){
        System.out.println("제품명 : " + this.getName());
        System.out.println("카테고리 : " + this.getCategory());
        System.out.println("가격 : " + this.price);
        System.out.println("재고 : " + this.stock);
    }













}
