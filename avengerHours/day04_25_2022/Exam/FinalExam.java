package day04_25_2022.Exam;


public class FinalExam extends GradeActivity {
    int numQuestions;
    double pointsEach;
    int numMissed;

    public FinalExam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        calculateNumericScore();
    }

    public void calculateNumericScore(){
        pointsEach = 100.00 / numQuestions;
        double numericScore = 100.0 - (numMissed * pointsEach);
        setScore(numericScore);
    }
}
