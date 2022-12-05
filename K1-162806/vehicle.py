class Verhicle:
    ## atrybuty


    def __init__(self, brand: str, model: int, price: float, min_speed: int, weight: int) -> None:
        self.brand = brand
        self.model = model
        self.price = price
        self.min_speed = min_speed
        self.weight = weight

        if self.weight < 0:
            self.weight = 0
        if self.price < 0:
            self.price = 0
        if self.model < 0:
            self.model = 0
        if self.min_speed < 10:
            self.min_speed = 10

        # propercje setter i getter

    def price_increase(self, procent) -> float:
        self.price = self.price + self.price * procent

    def __str__(self) -> str:
        return str('"Szczegóły: \nMarka ' + str(self.brand) + '\nModel ' + str(self.model) + '\nCena: ' + str(self.price) + '\nMinimalna prędkość: ' + str(self.min_speed) + '\nWaga: ' + str(self.weight) + '"')

    def __iadd__(self, other) -> None:
        self.brand = self.brand + ' ' + other.brand
        self.weight = self.weight + other.weight
        self.min_speed -= 10





