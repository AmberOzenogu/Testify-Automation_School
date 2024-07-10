class Human:
    def __init__(self):
        self.leg_count = 4
        self.can_walk = True

    def get_description(self):
        print("This is human")

    def get_leg_count(self):
        return self.leg_count

# Instantiate the Human class
person = Human()

# Invoke the get_description method
person.get_description()

# Invoke the method that returns the leg count
print("Leg count:", person.get_leg_count())
