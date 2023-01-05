from elementy import Element
from file import File

class Directory(Element):
    elements: list[File]

    def __init__(self, name: str, year: int, size: int, elements=[]) -> None:
        self.elements = elements
        self.name = name
        self.year = year
        self.size = size



    def __setter_ele__(self, wartosc) -> None:
        self.elements = wartosc

    def __getter_ele__(self) -> list:
        return self.elements

    def add_element(self, plik) -> None:
        self.elements.append(plik)

    #def rozmiar_katalogu()

    def __str__(self):
        return f"Nazwa: {self.name}. Utworony {self.year}. Rozmiar {self.elements[0].size}. {self.elements}"


f1 = File("p", 1999, 14)
d1 = Directory("P", 1999, 14, [f1])
print(d1)