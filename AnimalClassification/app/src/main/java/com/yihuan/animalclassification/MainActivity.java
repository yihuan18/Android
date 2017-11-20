package com.yihuan.animalclassification;

import android.net.wifi.aware.PublishConfig;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TreeNode node;
    TreeNode root;
    TextView Question;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DecisionMakingTree Tree = new DecisionMakingTree();
        Tree.TreeMaking();
        node = Tree.root;
        root = Tree.root;

        Question = (TextView) findViewById(R.id.question);

        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        Question.setText(node.getText());
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_1:
                node = node.left;
                if(node == null){
                    Toast.makeText(MainActivity.this , "DONE! Return to main interface!" , Toast.LENGTH_LONG).show();
                    node = root;
                }
                Question.setText(node.text);

                break;
            case R.id.button_2:
                node = node.right;
                if(node == null){
                    Toast.makeText(MainActivity.this , "DONE! Return to main interface!" , Toast.LENGTH_LONG).show();
                    node = root;
                }
                Question.setText(node.text);
                break;
            default:
                break;
        }
    }
}
