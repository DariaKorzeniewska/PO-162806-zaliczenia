from elementy import Element
class File(Element):
    size: int


    def __init__(self, name: str, year: int, size=0) -> None:
        self.size = size
        self.name = name
        self.year = year

        if size < 0:
            self.size = 0

    def __setter_size__(self, wartosc) -> None:
        if type(wartosc) is int:
            if wartosc > 0:
                self.size = wartosc
            else:
                print("Podana wartośc jest mniejsza od 0, wartosc nie zostala nadpisana")
        else:
            print("Wartość nie jest typu int, wartość nie została nadpisana")

    def __getter_size__(self) -> int:
        return self.size

    def __eq__(self, other) -> True or False:
        if self.size == other.size:
            return True
        return False

    def __ne__(self, other) -> True or False:
        if self.size != other.size:
            return True
        return False

    def __str__(self):
        return f"Nazwa: {self.name}. Utworzony {self.year}. Rozmiar {self.size}B"














