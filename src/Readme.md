1. program umozliwia stworzenie uzytkownika
2. umozliwia stworzenie kont bankowych
3. uzytkownik moze zasilic wskazane przez siebie konto bankowe i zrobic przelew na inne konto bankowe

Wymagania:
program:
1.zadaje pytanie o utworzenie uzytkownika
2.program sprawdza czy taki uzytkownik istnieje w systemie. jezeli nie to tworzy konto. Jezeli uzytkownik istnieje to prosi
o podanie hasla
3. jezeli haslo jest ok to pyta uzytkownika o to co chce zrobic:
    a.uzytkownik musi wybrac bank w ktorym ma konto
    b. nastepnie uzytkownik moze wplacic kasse albo przelac pieniadze na inne konto
    c. program wyswietla po skonczonej akcji potwierdzenie ze stanem konto uzytkownika w danym banku

Zalozenia:

uzytkownik moze przelewac pieniadze tylko do bankow w ktorych ma konto
domyslnie podczas dzialania palikacji uzytkownik ma juz utworzone konta w 4 bankach. W przyszlosci uzytkownik moze miec
wiecej kont bankowych. Uzytkownik w jednym banku moze miec kilka kont.
W programie jest 5 uzytkownikow.

Struktura programu
klasa uzytkownik:
    wlasciwosci: nazwa uzytkownika
    metody: wplaty, wyplaty, przelewy

Klasa bank:
    wlasciwosci: nazwa konta, konta bankowe
    metody: utworz konto, usun konto, dodaj uzytkownika, usun uzytkwonika

KLasa konto bankowe:
    wlasciwosci: numer konta, stan konta
    metody: zwieksz stan konta, zmniejsz stan konta, sprawdz stan konta


Zadania:

    1. stworzenie interfejsu uzytkownika - DONE
        1. zadaje pytanie o utworzenie uzytkownika - DONE
            1.podaj nazwe uzytkownika DONE
            2. wyswietlamy odpowiedz czy uzytkownik istnieje DONE
                1. jezeli uzytkownik istnieje to uzytkownik dostaje informacje ze konto istnieje i wyswietla sie informacja
                    co dalej chce zrobic i przechodzimy do pkt. 3 - IN PROGRESS
                2. jezeli uzytkonik nie istnieje to zadajemy pytanie czy chce utworzyc konto DONE
                    1. jezeli chce to tworzymy DONEE
                        1. pytamy w jakim banku - do wybory 10 bankow ( lub baza danych )
                        2. czy posiada konto w danym banku
                            1. jesli posiada to przechodzimy do pkt 4
                            2. jesli nie posaida to pytamy czy chce utworzyc
                                1. jesli nie chce to pytamy z jakiego banku chce skorzytac
                                2. jezeli nie wybierze banku to konczymy program
                                3. jezeli wybierze to przechodzimy pkt. 2
                    2. jesli nie to koniec programu DONE
            3. z jakiego banku chce skorzystac ( z posiadanych przez uzytkownika )
                1. bank jeden z posiadanych
                2. mozliwosc otworzenia nowego
            4. z jakiego konta chce skorzystac ( z posiadanych z uzytkownika )
                1. jedno z posiadanych
                2. mozliwosc utworzenia nowego
            4. wyswietlamy uzytkownikowi dostepne operacje
                1. sprawdzanie stanu konta
                2. dokonanie wyplaty
                3. dokonanie wplaty
                4. transfer na inne konto (czy mozna pobrac baze danych kont bankowych)
                    1. na jakie konto chce przetransferowac pieniadze
                    2. podac kwote przelewu
                5. zakonczenie dzialania programu
    2. wypisanie funkcji programu
        1. utworzenie uzytkownika
        2. utworzenie konta
        //TODO finish describe functionality  of our program
    3. stworzenie struktury danych
        1. tworzymy klase uzytkownik
        2. tworzymy klase bank
        3. tworzymy klase konto bankowe
    4. zaprogramowanie funkcjonalnosci
    5. podpiecie funkcjonalnosci do interfejsu uzytkownika
