class Human:
    def __init__(self):
        self.leg_count = 4

    def get_gender(self):
        return "Unknown"

class Man(Human):
    def get_gender(self):
        return "man"

class Woman(Human):
    def get_gender(self):
        return "woman"

# Instantiate the Man and Woman classes
man = Man()
woman = Woman()

# Print out the values of the get_gender() method
print("Man's gender:", man.get_gender())
print("Woman's gender:", woman.get_gender())
