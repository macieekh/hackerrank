package hr_12;


public class Student extends Person{
    private int identification;
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
        this.testScores = testScores;
    }

    public char calculate() {
        int sum = 0;
        for (int i = 0; i < this.testScores.length-1; i++) {
            sum = sum + this.testScores[i];
        }
        double avg = sum / this.testScores.length;

        if ((avg >= 90) && (avg <=100)) {
            return 'O';
        }
        if ((avg >= 80) && (avg <90)) {
            return 'E';
        }
        if ((avg >= 70) && (avg <80)) {
            return 'A';
        }
        if ((avg >= 55) && (avg <70)) {
            return 'E';
        }
        if ((avg >= 40) && (avg <55)) {
            return 'E';
        }

    return 'T';
    }

}