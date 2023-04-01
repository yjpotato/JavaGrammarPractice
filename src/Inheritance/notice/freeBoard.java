package Inheritance.notice;
//4. 게시판 인터페이스를 구현하고 게시글 저장, 수정, 삭제, 조회 메소드를 만들고 게시판을 상속받는 자유게시판과 공지게시판 클래스를 만들어서 네 개의 메소드를 본인이
//    원하는 대로 구현하세요.
public class freeBoard implements Notice{
    private String document;

    public freeBoard(String name) {
        this.document = document;
    }

    @Override
    public void save() {
        System.out.println(document + "를 저장 합니다.");
    }

    @Override
    public void modify() {
        System.out.println(document + "를 수정 합니다.");

    }

    @Override
    public void delete() {
        System.out.println(document + "를 삭제 합니다.");

    }

    @Override
    public void inquire() {
        System.out.println(document + "를 조회 합니다.");
    }




}
