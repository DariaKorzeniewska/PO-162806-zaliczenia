from paralleogram import Paralleogram
import array


class Square(Paralleogram):
    _kolor: str

    def __int__(self, side: float, color: str) -> None:
        self._kolor = color
        super().angle = 90
        super().side_1 = side
        super().side_2 = side
        if color == "":
            print("zla awrtosc color")
            exit(-2)


    def set_kolor(self, value):
        if value != "":
            if value is str:
                self._kolor = value
            else:
                print("zly typ zmiennej")
                exit(-2)
        else:
            print("zmienna nie moze byc pusta")
            exit(-2)

    def get_kolor(self):
        return self._kolor

    def __str__(self):
        return f"dlugosc boku = %s, kolor = %s, obwod = %s", (self.side_1, self._kolor, super().perimeter())


