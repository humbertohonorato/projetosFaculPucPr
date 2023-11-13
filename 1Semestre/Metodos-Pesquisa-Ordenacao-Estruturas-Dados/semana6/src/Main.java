public class Main {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(20);
        binaryTree.insert(25);
        binaryTree.insert(10);
        binaryTree.insert(15);
        binaryTree.insert(30);
        binaryTree.insert(23);
        binaryTree.insert(24);
        binaryTree.insert(35);


        binaryTree.getRoot();
        binaryTree.preOrder();
        binaryTree.inOrder();
        binaryTree.postOrder();


    }
}