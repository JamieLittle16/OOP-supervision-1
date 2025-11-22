import java.util.NoSuchElementException;

public class LinkedList {
  private Node head;

  public int getHead() {
    if (head == null) {
      throw new NoSuchElementException("List is empty");
    }
    return head.getVal();
  }

  private Node getHeadNode() {
    if (head == null) {
      throw new NoSuchElementException("List is empty");
    }
    return head;
  }

  public int length() {
    Node next = head;
    int length = 0;

    while (next != null) {
      next = next.getNext();
      length++;
    }
    return length;
  }

  public void add(int val) {
    Node newNode = new Node(val, null);

    if (head == null) {
      head = newNode;
      return;
    }
    Node next = getHeadNode();

    while (next.getNext() != null) {
      next = next.getNext();
    }
    next.setNext(newNode);
  }

  public void insert(int val, int n) {
    if (n < 0) {
      throw new IndexOutOfBoundsException("Index cannot be negative");
    }
    Node newNode = new Node(val, null);
    int i = 0;

    if (n == 0) {
      newNode.setNext(head);
      head = newNode;
      return;
    }
    Node next = getHeadNode();

    while (i != (n - 1)) {
      if (next.getNext() == null) {
        throw new IndexOutOfBoundsException("Index " + n + " is out of bounds");
      }
      next = next.getNext();
      i++;
    }
    newNode.setNext(next.getNext());
    next.setNext(newNode);
  }

  public void remove(int val) {
    Node prev = null;
    Node next = getHeadNode();

    if (next.getVal() == val) {
      head = next.getNext();
      return;
    }
    while (next.getVal() != val) {
      if (next.getNext() == null) {
        throw new NoSuchElementException();
      }
      prev = next;
      next = next.getNext();
    }
    prev.setNext(next.getNext());
  }

  public void pop(int n) {
    Node next = getHeadNode();

    if (n < 0) {
      throw new IndexOutOfBoundsException("Index cannot be negative");
    }
    if (n == 0) {
      head = head.getNext();
      return;
    }

    int i = 0;
    while (i < (n - 1)) {
      if (next.getNext() == null) {
        throw new IndexOutOfBoundsException("Index " + n + " is out of bounds");
      }
      next = next.getNext();
      i++;
    }
    if (next.getNext() == null) {
      throw new IndexOutOfBoundsException("Index " + n + " is out of bounds");
    }
    next.setNext(next.getNext().getNext());
  }

  public int getNth(int n) {
    if (n < 0) {
      throw new IndexOutOfBoundsException("Index cannot be negative");
    }
    int i = 0;
    Node next = getHeadNode();

    while (i != n) {
      if (next.getNext() == null) {
        throw new IndexOutOfBoundsException("Index " + n + "is out of bounds");
      }
      next = next.getNext();
      i++;
    }
    return next.getVal();
  }
}
