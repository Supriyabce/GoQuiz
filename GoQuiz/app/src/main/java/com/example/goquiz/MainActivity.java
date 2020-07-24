package com.example.goquiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button answer1,answer2,answer3,answer4;
TextView score,question;
private Questions mQuestion=new Questions();
private String mAnswer;
private int mScore=0;
private int mQuestionLength=mQuestion.mQuestion.length;
Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=new Random();
        answer1=findViewById(R.id.answer1);
        answer2=findViewById(R.id.answer2);
        answer3=findViewById(R.id.answer3);
        answer4=findViewById(R.id.answer4);
        score=(TextView)findViewById(R.id.score);
        question=(TextView)findViewById(R.id.question);
        score.setText("Score:"+mScore);
        updateQuestion(r.nextInt(mQuestionLength));
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else
                {
                    gameOver();
                }

            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else
                {
                    gameOver();
                }

            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else
                {
                    gameOver();
                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else
                {
                    gameOver();
                }

            }
        });
    }
    private void updateQuestion(int num)

    {
        question.setText(mQuestion.getQuestion(num));
        answer1.setText(mQuestion.getChoice1(num));
        answer2.setText(mQuestion.getChoice2(num));
        answer3.setText(mQuestion.getChoice3(num));
        answer4.setText(mQuestion.getChoice4(num));
        mAnswer=mQuestion.getCorrectAnswers(num);
    }
    private void gameOver()
    {
        AlertDialog.Builder alertDilougeBuilder=new AlertDialog.Builder(MainActivity.this);
        alertDilougeBuilder.setMessage("Quiz Over!Your Score is "+mScore+" points.").setCancelable(false).setPositiveButton("New Game",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      startActivity(new Intent(getApplicationContext(),MainActivity.class));
                      finish();
                    }
                })
        .setNegativeButton("Exit",
        new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            finish();
            }
        });
        AlertDialog alertDialog=alertDilougeBuilder.create();
        alertDialog.show();
    }
}
