/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        return checkBST(root, 0, 10000);
    }

    boolean checkBST(Node root, int min, int max) {
        if(root == null){
            return true;
        }
        else if(root.data > max || root.data < min){
            return false;
        }
        else {
            return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);
        }
    }
