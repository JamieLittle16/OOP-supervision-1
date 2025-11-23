package Q6;

public class Node {
  private int data;
  private Node next;

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public int getVal() {
    return data;
  }

  public void setVal(int val) {
    data = val;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node n) {
    next = n;
  }
}
