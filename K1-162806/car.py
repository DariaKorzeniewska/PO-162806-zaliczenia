from vehicle import Verhicle
class Car(Verhicle):
    # atrbut

    def __init__(self, brand: str, model: int, price: float, min_speed: int, weight: int, is_combi: bool, ) -> None:
        self.is_combi = is_combi
        self.brand = brand
        self.model = model
        self.price = price
        self.min_speed = min_speed
        self.weight = weight

        if self.min_speed < 50:
            self.min_speed = 50

    # setter i getter

    def __iadd__(self, other):
        self.brand = self.brand + ' ' + other.brand
        self.weight += other.weight
        self.min_speed -= 20

    def __str__(self):
        return str('"Szczegóły: \nMarka ' + str(self.brand) + '\nModel ' + str(self.model) + '\nCena: ' + str(self.price) + '\nMaksymalna prędkość: ' + str(self.min_speed) + '\nWaga: ' + str(self.weight) + '\nCombi: ' + str(self.is_combi) + '"')













