package Class;
//2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
public class book {

        private String title; //속성
        private String author; //속성
        private String publisher; //속성
        private int price; //속성

        public book(String title, String author, String publisher, int price) { //정보를 저장하는 메소드
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.price = price;
        }

        public void setTitle(String title) { //객체의 속성값을 변경하는 메서드
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getTitle() {  //객체의 속성값을 반환하는 메서드
            return title; //return -> 결과값을 반환하는 키워드
        }

        public String getAuthor() {
            return author;
        }

        public String getPublisher() {
            return publisher;
        }

        public int getPrice() {
            return price;
        }

        public void printInfo() { //정보를 출력하는 메소드드
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Publisher: " + publisher);
            System.out.println("Price: " + price);
        }
    }


