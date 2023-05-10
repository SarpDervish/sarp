@startuml
class Bibliothek {
    -name: String
    -standorte: List<Standort>

    +Bibliothek(name: String, standorte: List<Standort>)
}

class Standort {
    -name: String
    -adresse: Adresse
    -abteilungen: List<Abteilung>

    +Standort(name: String, adresse: Adresse, abteilungen: List<Abteilung>)
}

class Adresse {
    -name: String
    -strasse: String
    -hausnummer: int
    -plz: int
    -stadt: String

    +Adresse(name: String, strasse: String, hausnummer: int, plz: int, stadt: String)
}

class Abteilung {
    -name: String
    -stockwerk: int
    -regale: List<Regal>

    +Abteilung(name: String, stockwerk: int, regale: List<Regal>)
}

class Regal {
    -nummer: int
    -themen: List<String>
    -buecher: List<Buch>

    +Regal(nummer: int, themen: List<String>)
    +buchHinzufuegen(buch: Buch): boolean
    +buchEntfernen(buch: Buch): Buch
}

class Buch {
    -titel: String
    -beschreibung: String
    -autor: String
    -jahr: int

    +Buch(titel: String, beschreibung: String, autor: String, jahr: int)
}

class Sachbuch {
    -fachbereich: String

    +Sachbuch(titel: String, beschreibung: String, autor: String, jahr: int, fachbereich: String)
}

Bibliothek "1" *-- "*" Standort
Standort "1" *-- "*" Abteilung
Abteilung "1" *-- "*" Regal
Regal "1" *-- "*" Buch
Buch <|-- Sachbuch
@enduml
