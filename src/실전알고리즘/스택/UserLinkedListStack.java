package 실전알고리즘.스택;

public class UserLinkedListStack {
    node top;
    public UserLinkedListStack(){
        this.top = null;
    }
    public void push(int data){
        node n = new node(data);
        n.linkNode(top);
        top = n;
        System.out.println(data +" push!!");
    }
    public int peek(){
        return top.getData();
    }
    public void pop(){
        if(!empty()){
            System.out.println(top.getData());
            top = top.getNextNode();
        }else{
            System.out.println("empty!!");
        }
    }
    public int search(int item){
        node search = top;
        int index = 1;
        while(true){
            if(search.getData()==item){
                return index;

            }else{
                index++;
                search = search.getNextNode();
            }
            if(search==null){
                break;
            }
        }
        return -1;
    }

    public boolean empty(){
        return top == null;
    }
}
