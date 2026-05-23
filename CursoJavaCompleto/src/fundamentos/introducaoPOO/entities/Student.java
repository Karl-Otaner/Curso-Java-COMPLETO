package fundamentos.introducaoPOO.entities;

public class Student {
    public String nome;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrand() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (finalGrand() < 60.0) {
            return 60.0 - finalGrand();
        } else {
            return 0.0;
        }
    }
}
