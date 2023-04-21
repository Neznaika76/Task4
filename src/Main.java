public class Main {
    public static void main(String[] args) {
        var node = new RedBlackTree();

        node.insert(10);
        node.inorder();
        System.out.println("\n");
        node.insert(30);
        node.inorder();
        System.out.println("\n");
        node.insert(20);
        node.inorder();
        System.out.println("\n");
        node.insert(-20);
        node.inorder();
        System.out.println("\n");
        node.insert(-10);
        node.inorder();
        System.out.println("\n");
        node.insert(-30);
        node.inorder();
        System.out.println("\n");
        node.insert(-40);
        node.inorder();
        System.out.println("\n");
        node.insert(-50);
        node.inorder();
        node.insert(60);
        node.inorder();
        System.out.println("\n");
        node.insert(40);
        node.inorder();
    }
}