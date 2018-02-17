public class LinkedList<E> implements List<E> {
  private ListNode<E> front;
  private ListNode<E> back;
  private int size;

  public LinkedList() {
    front = new ListNode<E>(null);
    back = new ListNode<E>(null);
    clear();
  }

  public void clear() {
    front.next = back;
    back.prev = front;
    size = 0;
  }

  // ...

  // helper
  private ListNode<E> nodeAt(int index) {
    ListNode<E> current;
    if (index < size / 2) {
      current = front;
      for (int i = 0; i < index + 1; i++) {
        current = current.next;
      }
    } else {
      current = back;
      for (int i = size; i >= index + 1; i--) {
        current = current.prev;
      }
    }
    return current;
  }
}