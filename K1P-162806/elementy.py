class Element:
    name: str
    year: int

    def __init__(self, name=None, year=1970) -> None:
        self.name = name
        self.year = year
        if year < 1970 or year > 2023:
            self.year = 1970

    def __setter__(self, nazwa_atrybutu:str, wartosc) -> None:
        if nazwa_atrybutu == "name":
            if type(wartosc) is str:
                self.name = wartosc
            else:
                print("Atrybut name może być tylko w formacie str, wartość nie została zmieniona")

        if nazwa_atrybutu == "year":
            if type(wartosc) is int:
                if (wartosc > 1970) and (wartosc < 2023):
                    self.year = wartosc
                else:
                    print("Wartość musi się mieścić w przedziale 1970<wartosc<2023, wartość year nie została zmieniona")
            else:
                print("Atrybut year może być tylko w formacie int, wartość nie została zmieniona")

    def __getter_year__(self) -> int:
        return self.year

    def __getter_name__(self) -> str:
        return self.name

    def __str__(self) -> str:
        return f"Nazwa: {self.name}. Utworzony {1999}."


    def __eq__(self, obiekt) -> True or False:
        if (obiekt.year == self.year) and (obiekt.name == self.name):
            return True
        return False

    def __ne__(self, obiekt) -> True or False:
        if (obiekt.year != self.year) or (obiekt.name != self.name):
            return True
        return False





e1 = Element("Pan Tadeusz", 1978)
e2 = Element("Pan Tadeusz", 1999)
e3 = Element("Ela", 2000)
e1.__setter__("year", 1999)
print(e1.__getter_name__())
print(e1.__getter_year__())
print(e1)

print(e2.__eq__(e1))
print(e3.__eq__(e1))

print(e2.__ne__(e1))
print(e3.__ne__(e1))





