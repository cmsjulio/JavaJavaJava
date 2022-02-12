package chapter1.Riddle;

public class Riddle {
    private String question;
    private String answer;

    private static Integer createdRiddles;
    static {createdRiddles = 0;}

    public static Integer getCreatedRiddles() {
        return  Riddle.createdRiddles;
    }

    public Riddle(){++createdRiddles;};

    public Riddle(String question, String answer){
        this.question = question;
        this.answer = answer;
        ++createdRiddles;
    }

    public String getQuestion(){
        return this.question;
    }

    public String getAnswer(){
        return this.answer;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }


}
