

/**
 * Name: Izzy Hurley
 * Lab Name: RBTreeDriver
 * Lab Purpose: The goal of RBTreeDriver is to create a program
 * Date: 10/15/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class RBTreeDriver {
    public static void main(String[] args) {
Node root = new Node(10, "ten", Node.BLACK,2);

Node left = new Node(9, "nine", Node.RED,2);
Node leftleft = new Node (7,"seven",Node.BLACK,1);

root.setLeft(left);
root.left.setLeft(leftleft);

        Node right = new Node(11, "eleven", Node.RED,2);
        Node rightright = new Node (13,"thirteen",Node.BLACK,1);

root.setRight(right);
root.right.setRight(rightright);
            RBTree n = new RBTree(root);

        System.out.println("printing isRBT on fake RBT expected result false"+ n.isRBT() );

Node leftRight = new Node (8,"eight",Node.BLACK,1);
root.left.setRight(leftRight);
    Node rightLeft = new Node (12,"twelve",Node.BLACK,1);
    root.right.setLeft(rightLeft);

            System.out.println("printing isRBT on real RBT expected result true"+ n.isRBT() );

        System.out.println("testing isGparent expected result = true");
        System.out.println(n.isGParent(root));
        System.out.println("testing isGparent on second level of 3 node deep tree expected result = false");
        System.out.println(n.isGParent(right));


        root.setLeft(null);
        System.out.println("make unbalanced tree by setting left side to null");
        System.out.println("balance by shifting left");
        n.rotateLeft(n.root.left);
        System.out.println(n);

        System.out.println("printing isRBT on real RBT because now balanced expected result"+ n.isRBT());




    }


}
