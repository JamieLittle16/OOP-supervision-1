package Q7;

import Q6.LinkedList;
import Q6.Node;

public class Cycle {

  public static boolean detectCycles(LinkedList list) {
    Node slow;
    Node fast;

    try {
      slow = list.getHeadNode();
      fast = list.getHeadNode();
    } catch (Exception e) { // Empty list cannot have cycles
      return false;
    }
    while (fast != null && fast.getNext() != null) {
      slow = slow.getNext(); // Slow takes 1 step
      fast = fast.getNext().getNext(); // Fast node takes 2 steps

      if (fast == slow) { // If slow ctaches up, must be in a loop
        return true;
      }
    }

    return false;
  }
}
