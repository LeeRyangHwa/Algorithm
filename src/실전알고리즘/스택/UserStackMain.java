package 실전알고리즘.스택;

public class UserStackMain {
    public static void main(String[] args) {
        UserArrayStack s = new UserArrayStack(5);
        s.push(1);
        s.peek();
        s.pop();
        s.push(7);
        s.push(9);
        s.push(3);
        s.push(2);
        int search = s.search(3);
        System.out.println(search);
    }
}
