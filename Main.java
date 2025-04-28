import com.binarytree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = createBinaryTree();
        System.out.println("has 6 = " + bt.containsNode(6));
        System.out.println("has 4 = " + bt.containsNode(4));
        System.out.println("has 1 = " + bt.containsNode(1));
        System.out.println("has 9 = " + bt.containsNode(9));
        bt.delete(9);
        System.out.println("has 9 = " + bt.containsNode(9));
        System.out.println("traverseInOrder = " + bt.traverseInOrder());
        System.out.println("traversePreOrder = " + bt.traversePreOrder());
        System.out.println("traversePostOrder = " + bt.traversePostOrder());
        System.out.println("traverseLevelOrder = " + bt.traverseLevelOrder());
    }

    private BinaryTree createBinaryTree() {
        BinaryTree binarytree = new BinaryTree();
        binarytree.add(6);
        binarytree.add(4);
        binarytree.add(8);
        binarytree.add(3);
        binarytree.add(5);
        binarytree.add(7);
        binarytree.add(8);

        return binarytree;
    }
}