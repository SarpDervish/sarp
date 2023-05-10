import java.util.List;

public class Bibliothek {
    private String name;
    private List<Standort> standorte;

    public Bibliothek(String name, List<Standort> standorte) {
        this.name = name;
        this.standorte = standorte;
    }
}

public class Standort {
    private String name;
    private Adresse adresse;
    private List<Abteilung> abteilungen;

    public Standort(String name, Adresse adresse, List<Abteilung> abteilungen) {
        this.name = name;
        this.adresse = adresse;
        this.abteilungen = abteilungen;
    }
}

public class Adresse {
    private String name;
    private String strasse;
    private int hausnummer;
    private int plz;
    private String stadt;

    public Adresse(String name, String strasse, int hausnummer, int plz, String stadt) {
        this.name = name;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.stadt = stadt;
    }
}

public class Abteilung {
    private String name;
    private int stockwerk;
    private List<Regal> regale;

    public Abteilung(String name, int stockwerk, List<Regal> regale) {
        this.name = name;
        this.stockwerk = stockwerk;
        this.regale = regale;
    }
}

public class Regal {
    private int nummer;
    private List<String> themen;
    private List<Buch> buecher;

    public Regal(int nummer, List<String> themen) {
        this.nummer = nummer;
        this.themen = themen;
        this.buecher = new ArrayList<>();
    }

    public boolean buchHinzufuegen(Buch buch) {
        // ...
        return true;
    }

    public Buch buchEntfernen(Buch buch) {
        // ...
        return null;
    }
}

public class Buch {
    private String titel;
    private String beschreibung;
    private String autor;
    private int jahr;

    public Buch(String titel, String beschreibung, String autor, int jahr) {
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.autor = autor;
        this.jahr = jahr;
    }
}

public class Sachbuch extends Buch {
    private String fachbereich;

    public Sachbuch(String titel, String beschreibung, String autor, int jahr, String fachbereich) {
        super(titel, beschreibung, autor, jahr);
        this.fachbereich = fachbereich;
    }
}
