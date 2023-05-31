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
        System.out.println("---");
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
        System.out.println("---");
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
        System.out.println("---");
    }

    public Node getRoot() {
        System.out.println("---");
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

    public Node search(Integer value) {
        return search(root, value);
    }

    private Node search(Node node, Integer value) {
        if (node != null) {
            if (node.getInfo() == value) {
                System.out.println("Node encontrado!");
                return node;
            } else if (value >= node.getInfo()) {
                return search(node.getRight(), value);
            } else {
                return search(node.getLeft(), value);
            }
        } else {
            System.out.println("Node não encontrado!");
            return null;
        }
    }

    public Node remove(BinaryTree bt, Integer value) {
        Node balancing = remove(bt, root, value, null);
        return balancing;
    }

    private Node remove(BinaryTree bt, Node node, Integer value, Node father) {
        if (node != null) {
            if (node.getInfo() == value) {
                if (node.getLeft() == null && node.getRight() == null) {  //Sem filhos
                    if(father == null) {
                        bt.root = null;
                    }
                    else if (node.getInfo() >= father.getInfo()) {
                        father.setRight(null);
                    } else {
                        father.setLeft(null);
                    }
                    return node;
                } else if (node.getLeft() == null) {                   //Somente um filho na direita
                    if (node.getInfo() >= father.getInfo()) {
                        father.setRight(node.getRight());
                    } else {
                        father.setLeft(node.getRight());
                    }
                    node.setLeft(null);
                    return node;
                } else if (node.getRight() == null) {                  //Somente um filho na esquerda
                    if (node.getInfo() >= father.getInfo()) {
                        father.setRight(node.getLeft());
                    } else {
                        father.setLeft(node.getLeft());
                    }
                    node.setLeft(null);
                    return node;
                } else {
                    int minor = minorLeft(node).getInfo();
                    int removeinfo = remove(bt, minor).getInfo();                         //Dois filhos
                    node.setInfo(removeinfo);
                    return node;
                }
            }
            if (value >= node.getInfo()) {
                return remove(bt, node.getRight(), value, node);
            } else {
                return remove(bt, node.getLeft(), value, node);
            }
        }
        return null;
    }

    private Node minorLeft(Node node) {
        if (node.getLeft() != null) {
            node = node.getLeft();
            while (node.getRight() != null) {
                node = node.getRight();
            }
        }
        return node;
    }
}



