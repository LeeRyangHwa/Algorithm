package 실전알고리즘.스택;

public class UserArrayStack {
    private int top;
    private int [] stack;
    private int size;

    public UserArrayStack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void push(int item){
        if(top < size){
            top++;
            stack[top] = item;
            System.out.println(stack[top]+" push!!");
        }else{
            System.out.println("full!!");
        }
    }
    public  void peek(){
        System.out.println(stack[top] + " peek!!");
    }
    public void pop(){
        if(empty()){
            System.out.println(stack[top] + " pop!!");
            top--;
        }else{
            System.out.println("empty!!");
        }
    }
    public int search(int item){
        System.out.println(top);
        for(int i=0; i<=top; i++){
            if (item == stack[i]){
                return (top-i)+1;
            }
        }

        return -1;
    }
    public boolean empty(){
        return top != -1;
    }


}
