// Class LinkedIntList implementation pg 976 

public class LinkedIntList {
  private ListNode front;

  public LinkedIntList() {
    front = null;
  }

  // returns current number of elements in list
  public int size() {
    int count = 0;
    ListNode current = front;
    while(current != null) {
      current = current.next;
      count++;
    }
    return count;
  }

  // returns int at given index in the list
  public int get(int index) {
    return nodeAt(index).data;
  }

  // returns comma separated bracketed version of list
  public String toString() {
    if (front == null) {
      return "[]";
    } else {
      String result = "[" + front.data;
      ListNode current = front.next;
      while (current != null) {
        result += ", " + current.data;
        current = current.next;
      }
      result += "]";
      return result;
    }
  }

  // returns first occurence of given value (-1 if not found)
  public int indexOf(int value) {
    int index = 0;
    ListNode current = front;
    while (current != null) {
      if (current.data == value) {
        return index;
      }
      index++;
      current = current.next;
    }
    return -1;
  }

  // appends given value to end of list
  public void add(int value) {
    if (front == null) {
      front = new ListNode(value);
    } else {
      ListNode current = front;
      while (current.next != null) {
        current = current.next;
      }
      current.next = new ListNode(value);
    }
  }

  // inserts given value at given index
  public void add(int index, int value) {
    if (index == 0) {
      front = new ListNode(value, front);
    } else {
      ListNode current = nodeAt(index - 1);
      current.next = new ListNode(value, current.next);
    }
  }

  // remove value at a given index
  public void remove(int index) {
    if (index == 0) {
      front = front.next;
    } else {
      ListNode current = nodeAt(index - 1);
      current.next = current.next.next;
    }
  }

  // add value to list while preserving sorted (increasing) order
  public void addSorted(int values) {
    if (front == null || front.data >= value) {
      front = new ListNode(value, front);
    } else {
      ListNode current = front;
      while (current.next != null && current.next.data < value) {
        current = current.next;
      }
      current.next = new ListNode(value, current.next);
    }
  }

  // returns a reference to node at the given index
  private ListNode nodeAt(int index) {
    ListNode current = front;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current;
  }

}