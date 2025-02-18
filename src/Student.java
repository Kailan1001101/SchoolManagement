public class Student {

    private int grade;
    private int feesPaid;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    public void payFees(int amount){
        setFeesPaid(getFeesPaid()+amount);
    }
    public void FeesLeft(){
        setFeesPaid(getFeesTotal()-getFeesPaid());
    }

    public Student(int grade, int feesPaid, int feesTotal) {
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = feesTotal;
    }

    private int feesTotal;
}
