package solution.list.doubly;

public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        if (this.next == null) {
            return String.valueOf(this.val);
        }
        System.out.println(this.val);
        return this.next.toString();
    }
}
