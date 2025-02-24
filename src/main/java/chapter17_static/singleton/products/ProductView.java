package chapter17_static.singleton.products;
/*
    싱글톤 패턴 작성
 */
public class ProductView {

        // 정적 참조 변수(싱글톤 객체를 담을 변수)
        private static ProductView instance;

        // private 생성자
        private ProductView() {
            int counter = 1;
            System.out.println(counter + "번째 ProductView 가 생성되었습니다.");
        }

        // getInstance()
        public static ProductView getInstance() {
            if (instance == null) {
                instance = new ProductView();
            }

            return instance;
        }


    public void showMainView() {
    }
}
   //  출처: https://ittrue.tistory.com/563 [IT is True:티스토리]


