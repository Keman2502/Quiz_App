package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Activity3 extends AppCompatActivity {

    private TextView tvQuestion,tvScore,tvQuestionNo;
    private RadioGroup radioGroup;
    private RadioButton rb1,rb2,rb3,rb4;
    private Button btnNext;

    int totalQuestions;
    int qCounter=0;

    private QuestionModel currentQuestion;
    private List<QuestionModel> questionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        questionsList = new ArrayList<>();
        tvQuestion= findViewById(R.id.textQuestion);
        tvScore= findViewById(R.id.textScore);
        tvQuestionNo= findViewById(R.id.textQuestionNo);

        radioGroup= findViewById(R.id.radioGroup);
        rb1= findViewById(R.id.rb1);
        rb2= findViewById(R.id.rb2);
        rb3= findViewById(R.id.rb3);
        rb4= findViewById(R.id.rb4);
        btnNext= findViewById(R.id.btnNext);
        
        addQuestions();
        totalQuestions = questionsList.size();
        showNextQuestion();
    }

    private void showNextQuestion() {
        if(qCounter < totalQuestions){
            currentQuestion = questionsList.get(qCounter);
            tvQuestion.setText(currentQuestion.getQuestion());
            rb1.setText(currentQuestion.getOption1());
            rb2.setText(currentQuestion.getOption2());
            rb3.setText(currentQuestion.getOption3());
            rb4.setText(currentQuestion.getOption4());

            qCounter++;
        }else{
            finish();
        }
    }

    private void addQuestions() {
        questionsList.add(new QuestionModel("A is correct?","A","B","C","D",1));
        questionsList.add(new QuestionModel("B is correct?","A","B","C","D",2));
        questionsList.add(new QuestionModel("C is correct?","A","B","C","D",3));
        questionsList.add(new QuestionModel("D is correct?","A","B","C","D",4));
    }
}