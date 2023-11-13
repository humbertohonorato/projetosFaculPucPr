public class BinaryTree {
    private Node root;

    private void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.getInfo() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getInfo() + " ");
            inOrder(node.getRight());
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getInfo() + " ");
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    public Node getRoot() {
        return root;
    }

    public void insert(Integer value) {
        insert(root, value);
    }

    private void insert(Node node, Integer value) {
        if (node == null)
            root = new Node(value);
        else if (value >= node.getInfo())
            if (node.getRight() == null)
                node.setRight(new Node(value));
            else
                insert(node.getRight(), value);
        else if (node.getLeft() == null)
            node.setLeft(new Node(value));
        else
            insert(node.getLeft(), value);
    }
}