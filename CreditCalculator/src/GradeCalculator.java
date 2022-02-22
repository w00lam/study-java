import java.util.ArrayList;

public class GradeCalculator {
    public final String name;
    public final double currentScore;
    public final int currentCredit;

    private final ArrayList<Course> courses = new ArrayList<>();

    public GradeCalculator(String name, double currentScore, int currentCredit) {
        this.name = name;
        this.currentScore = currentScore;
        this.currentCredit = currentCredit;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void print() {
        System.out.format("직전 학기 성적: %f (총 %d학점)\n", currentScore, currentCredit);

        int creditSum = 0;
        double scoreSum = 0;

        for(Course c : courses) {
            creditSum += c.credit;
            scoreSum += c.credit * c.getScore();
        }

        System.out.format("이번 학기 성적: %.10f (총 %d학점)\n", scoreSum / creditSum, creditSum);

        int totalCredit = currentCredit + creditSum;
        double totalScore = currentScore * currentCredit + scoreSum;

        System.out.format("전체 예상 학점: %.10f (총 %d학점)\n", totalScore / totalCredit, totalCredit);
    }
}