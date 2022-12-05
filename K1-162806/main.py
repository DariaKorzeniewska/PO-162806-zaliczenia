from vehicle import Verhicle
from car import Car

v_1 = Verhicle('Kia', 123, 30000, 30, 1000)
v_2 = Verhicle('Toyota', 200, 200000.10, 20, 2000)

print(v_1)
print(v_2)

v_1.min_speed = 10
print(v_1)

v_1.price_increase(0.1)

v_1.__iadd__(v_2)

c_1 = Car('Kia', 132, 20000, 30, 1200, False)
c_2 = Car('Combi', 123, 20000, 20, 2000, True)

print(c_1)
print(c_2)

c_1.__iadd__(c_2)
print(c_1)

c_1.__iadd__(v_2)
print(c_1)