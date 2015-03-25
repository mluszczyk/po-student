import java.util.ArrayList;

class Student {
    String imię;
    String nazwisko;
    String numerIndeksu;
    int rok;
    ArrayList<String> listaPrzedmiotów;

    /* Domyślny konstruktor. Kopiuje listę przedmiotów, jeżeli nie jest null.
     * W przeciwnym wypadku tworzy pustą listę przedmiotów. */
    public Student(String imię, String nazwisko, String numerIndeksu,
            int rok, ArrayList<String> listaPrzedmiotów)
    {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.rok = rok;
        this.listaPrzedmiotów = new ArrayList<>();
        if (listaPrzedmiotów != null) {
            for(String przedmiot : listaPrzedmiotów) {
                this.listaPrzedmiotów.add(przedmiot);
            }
        }
    }

    public Student(String imię, String nazwisko, String numerIndeksu,
            int rok)
    {
        this(imię, nazwisko, numerIndeksu, rok, null);
        this.dodajPrzedmiot("Programowanie Obiektowe");
    }

    public void dodajPrzedmiot(String przedmiot) {
        this.listaPrzedmiotów.add(przedmiot);
    }

    /* Usuwa wskazany przedmiot i zwraca true lub jeżeli przedmiotu nie było
     * na liście, nie robi nic i zwraca false. */
    public boolean usuńPrzedmiot(String przedmiot) {
        boolean usunięto = this.listaPrzedmiotów.remove(przedmiot);
        return usunięto;
    }

    public String numerIndeksu() {
        return numerIndeksu;
    }

    public int rok() {
        return rok;
    }

    public void zwiększRok() {
        this.rok += 1;
    }

    public String imięNaziwsko() {
        return String.format("%s %s", imię, nazwisko);
    }

    public String toString() {
        String przedmioty = "";
        for (String przedmiot : listaPrzedmiotów) {
            if (!przedmioty.isEmpty()) {
                przedmioty += ", ";
            }
            przedmioty +=  przedmiot;
        }
        return String.format("%s, nr ind. %s, rok %d, %s", imięNaziwsko(),
            numerIndeksu, rok, przedmioty);
    }
}
