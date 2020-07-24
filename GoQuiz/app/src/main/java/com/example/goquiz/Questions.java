package com.example.goquiz;

public class Questions {
    public String mQuestion[]={
            "Which is first Indian cricket tournament ?",
            "Which of the following is first cricket club in India ?",
            "Indian played first test match against ________ .",
            "Indian played their First ODI Match against _______.",
            "Indian played their First T20 Match against _______."
    };
    public String mChoice[][]={
            {"None of these", "Bombay Triangular", "Bombay Series", "Pepsi Cup"},
            {"Oriental Cricket Club", "Maharashtra Cricket Club", "Bombay Cricket Club", "East Indian Cricket Club"},
            {"Australia", "England", "South Africa", "Pakistan"},
            {"South Africa", "England", "Pakistan", "Australia"},
            {"Australia"," South Africa","England","Pakistan"}
    };
   private String mCorrectAnswers[]={"Bombay Triangular","Oriental Cricket Club","England","England","South Africa"};
    public String getQuestion(int a)
    {
        String question=mQuestion[a];
        return question;
    }
    public String getChoice1(int a)
    {
        String choice=mChoice[a][0];
        return choice;
    }
    public String getChoice2(int a)
    {
        String choice=mChoice[a][1];
        return choice;
    }
    public String getChoice3(int a)
    {
        String choice=mChoice[a][2];
        return choice;
    }
    public String getChoice4(int a)
    {
        String choice=mChoice[a][3];
        return choice;
    }
    public String getCorrectAnswers(int a)
    {
        String answer=mCorrectAnswers[a];
        return answer;
    }
}
