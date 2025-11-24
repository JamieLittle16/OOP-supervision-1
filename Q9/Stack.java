package Q9;

import Q6.LinkedList;
import java.util.NoSuchElementException;

public class Stack {
  private int size;
  private LinkedList list;

  public void push(int element) {
    list.insert(element, 0);
    size++;
  }

  public int pop() {
    if (isEmpty()) {
      throw new NoSuchElementException("Stack is Empty");
    }
    size--;
    return list.pop(0);
  }

  public int peek() {
    if (isEmpty()) {
      throw new NoSuchElementException("Stack is Empty");
    }
    return list.getNth(0);
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public int length() {
    return size;
  }

  public void clear() {
    list = new LinkedList();
    size = 0;
  }

  public Stack() {
    list = new LinkedList();
    size = 0;
  }

  public Stack(int[] arr) {
    list = new LinkedList(arr);
    size = list.length();
    list.reverse();
  }

  public Stack(LinkedList list) {
    list.reverse();
    this.list = list;
    size = list.length();
    list.reverse(); // In case the linked list is used elsewhere
  }
}
