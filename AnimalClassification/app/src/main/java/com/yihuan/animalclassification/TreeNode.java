package com.yihuan.animalclassification;

/**
 * Created by Yihuan on 2017/11/19.
 */

public class TreeNode {
    public String text;
    public TreeNode left;
    public TreeNode right;
    public TreeNode father;

    public void setText(String s){
        this.text = s;
    }

    public void setLeft(TreeNode left_node){
        this.left = left_node;
    }

    public void setRight(TreeNode right_node){
        this.right = right_node;
    }

    public void setFather(TreeNode father_node){
        this.father = father_node;
    }

    public String getText(){
        return text;
    }
}
