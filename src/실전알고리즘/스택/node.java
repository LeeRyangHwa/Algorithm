package 실전알고리즘.스택;

public class node {
    private int data;
    private node nextNode;

    public node(int data){
        this.data = data;
        this.nextNode = null;
    }
    public void linkNode(node node){
        this.nextNode = node;
    }
    public int getData(){
        return this.data;
    }
    public node getNextNode(){
        return this.nextNode;
    }
}
