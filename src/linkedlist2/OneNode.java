package linkedlist2;

public class OneNode {

    int value;
    OneNode nextNode;

    public OneNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public OneNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(OneNode nextNode) {
        this.nextNode = nextNode;
    }

}
