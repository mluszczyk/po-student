import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Programowanie Obiektowe");
        subjects.add("Matematyka Dyskretna");
        Student student = new Student("Jan", "Kowalski", "93452", 2, subjects);
        student.zwiększRok();
        assert student.rok() == 3;
        assert student.imięNaziwsko() == "Jan Kowalski";
        boolean wynik = student.usuńPrzedmiot("Matematyka Dyskretna");
        assert wynik;
        wynik = student.usuńPrzedmiot("Analiza Matematyczna");
        assert !wynik;
        student.dodajPrzedmiot("Analiza Matematyczna");
        System.out.println(student.toString());
    }
}
