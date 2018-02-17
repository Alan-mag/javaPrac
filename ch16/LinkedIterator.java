import java.util.NoSuchElementException;

private class LinkedIterator implements Iterator<E> {
  private ListNode<E> current;
  private boolean removeOK;

  public LinkedIterator() {
    current = front.next;
    removeOK = false;
  }

  public boolean hasNext() {
    return current != back;
  }

  public E next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    E result = current.data;
    current = current.next;
    removeOK = true;
    return result;
  }

  public void remove() {
    if (!removeOK) {
      throw new IllegalStateException();
    }
    ListNode<E> prev2 = current.prev.prev;
    prev2.next = current;
    current.prev = prev2;
    size--;
    removeOK = false;
  }

  public void addAll(List<E> other) {
    for (E value : other) {
      add(value);
    }
  }
}