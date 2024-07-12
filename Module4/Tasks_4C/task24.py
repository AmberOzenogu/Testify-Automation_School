from abc import ABC, abstractmethod

class Vehicle(ABC):
    @abstractmethod
    def drive_direction(self):
        pass

class Car(Vehicle):
    def drive_direction(self):
        print("Drive Forward")

class Plane(Vehicle):
    def drive_direction(self):
        print("Drive Upward")

car = Car()
plane = Plane()

car.drive_direction()
plane.drive_direction()
