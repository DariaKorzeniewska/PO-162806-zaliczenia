import math
import array

class Paralleogram:
    side_1: float #zakres < 0 >= 100
    side_2: float
    angle: float #zakres 0>  <180

    def __init__(self, side_1: float, side_2: float, angle: float) -> None:
        self.side_2 = side_2
        self.side_1 = side_1
        self.angle = angle

        if side_2 >= 0 or side_2 < 100:
            print("zle parametry")
            exit(-2)

        if side_1 >= 0 or side_1 < 100:
            print("zle parametry")
            exit(-2)

    def area(self) -> float:
        return math.sin(self.angle)*self.side_1*self.side_2

    def perimeter(self) -> float:
        return 2*self.side_1+2*self.side_2

    def duplicate_with_scale(self, scale: array):
        if scale is array:
            if scale.ArrayType == int:
                new = Paralleogram(self.side_1*scale[0], self.side_2*scale[1], self.angle)
                return new
            else:
                print("zly typ")
                exit(-2)
        else:
            print("zle parametry")
            exit(-2)

    def __str__(self):
        return f"%s %s %s", (self.side_1, self.side_2, self.angle)

    def __add__(self, other):
        if isinstance(other, Paralleogram):
            self.side_1 += other.side_1
            self.side_2 += other.side_2
            if self.angle > other.angle:
                self.angle = other.angle






