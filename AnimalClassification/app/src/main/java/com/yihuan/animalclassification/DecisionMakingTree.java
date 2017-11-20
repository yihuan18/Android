package com.yihuan.animalclassification;

/**
 * Created by Yihuan on 2017/11/19.
 */

public class DecisionMakingTree {
    public TreeNode root;
    public void TreeMaking(){
        root = new TreeNode();
        TreeNode current;
        root.setText("More than 4 legs?");
        TreeNode left = new TreeNode();
        left.setText("It's an insect!\nIf an animal has more than four legs then it's an insect!");
        root.setLeft(left);
        TreeNode right = new TreeNode();
        right.setText("Warm-blooded?");
        root.setRight(right);

        current = root.right;  //warm-blooded?
        current.setFather(root);
        left = new TreeNode();
        left.setText("Break or bill?");
        current.setLeft(left);
        right = new TreeNode();
        right.setText("Using gills?");
        current.setRight(right);
        TreeNode father;
        father = current;

        current = current.left; //Break or bill?
        current.setFather(father);
        left = new TreeNode();
        left.setText("It's a Bird!\nIf an animal has no more than four legs and it's warm-blooded and it has break or bill then it's a bird!");
        current.setLeft(left);
        right = new TreeNode();
        right.setText("It's a Mammal!\nIf an animal has no more than four legs and it's warm-blooded and it doesn't have break or bill then it's a mammal!\n");
        current.setRight(right);


        current = current.father.right; //Using gills?
        current.setFather(father);
        left = new TreeNode();
        left.setText("Using gills all of its life?");
        right = new TreeNode();
        right.setText("It's a reptile!\nIf an animal has no more than four legs and it isn't warm-blooded and it doesn't use gills then it's a reptile!");
        current.setLeft(left);
        current.setRight(right);

        current = current.left; //Using gills all of its life?
        left = new TreeNode();
        left.setText("It's a fish!\nIf an animal has no more than four legs and it isn't warm-blooded and it uses gills all of its life then it's a fish!");
        current.setLeft(left);
        right = new TreeNode();
        right.setText("It's an amphibian!\nIf an animal has no more than four legs and it isn't warm-blooded and it uses gills but doesn't use it all of its life then it's a amphibian!");
        current.setRight(right);

    }

}
