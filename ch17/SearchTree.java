



public class SearchTree<E extends Comparable<E>> {
  private SearchTreeNode<E> overallRoot;

  public SearchTree() {
    overallRoot = null;
  }

  public void add(E value) {
    overallRoot = add(overallRoot, value);
  }

  private SearchTreeNode<E> add(SearchTreeNode<E> root, E value) {
    if (root == null) {
      root = new SearchTreeNode<E>(value);
    } else if (root.data.compareTo(value) >= 0) {
      root.left = add(root.left, value);
    } else {
      root.right = add(root.right, value);
    }
    return root;
  }

  public boolean contains(E value) {
    return contains(overallRoot, value);
  }

  private boolean contains(SearchTreeNode<E> root, E value) {
    if (root == null) {
      return false;
    } else {
      int compare = value.compareTo(root.data);
      if (compare == 0) {
        return true;
      } else if (compare < 0) {
        return contains(root.left, value);
      } else {
        return contains(root.right, value);
      }
    }
  }
  
  public void print() {
    printInorder(overallRoot);
  }

  private void printInorder(SearchTreeNode<E> root) {
    if (root != null) {
      printInorder(root.left);
      System.out.println(root.data);
      printInorder(root.right);
    }
  }

  private static class SearchTreeNode<E> {
    public E data;
    public SearchTreeNode<E> left;
    public SearchTreeNode<E> right;

    public SearchTreeNode(E data) {
      this(data, null, null);
    }

    public SearchTreeNode(E data, SearchTreeNode<E> left, SearchTreeNode<E> right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }
}