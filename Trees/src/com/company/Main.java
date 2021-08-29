package com.company;

class Tree{
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
    }

}

public class Main {

    public static void main(String[] args) {
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4,
                                        null,
                                        new Tree(6)),
                                new Tree(9)),
                        new Tree(35,
                                new Tree(31,
                                        new Tree(28),
                                        null),
                                new Tree(40,
                                        new Tree(38),
                                        new Tree(52))));

        System.out.println("Сумма дерева: " + sumRecursive(root));
        System.out.println("Сумма дерева: " + sumDeep(root));
    }

    public static int sumRecursive(Tree root){
        int total = root.value;

        if(root.left != null)
            total += sumRecursive(root.left);
        if(root.right != null)
            total += sumRecursive(root.right);

        return total;
    }

    public static int sumDeep(Tree root){
        SimpleStack<Tree> stack = new SimpleStack<>();
        stack.push(root);

        int total = 0;

        while (!stack.isEmpty()){
            Tree node = stack.pop();
            total += node.value;

            if(node.right != null)
                stack.push(node.right);

            if(node.left != null)
                stack.push(node.left);
        }

        return total;
    }
}
