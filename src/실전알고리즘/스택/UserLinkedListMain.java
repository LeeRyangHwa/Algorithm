package 실전알고리즘.스택;

public class UserLinkedListMain {
    public static void main(String[] args) {
        UserLinkedListStack s = new UserLinkedListStack();
        s.push(1);
        int temp = s.peek();
        System.out.println("peek!! " + temp);
        s.push(2);
        s.push(3);
        s.push(4);
        int search = s.search(2);
        System.out.println("2 search:"+search);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
