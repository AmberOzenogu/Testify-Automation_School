class Hunt:
    def __init__(self):
        self.__weapon = "Assault Rifle"

    def get_weapon(self):
        return "Not Available"

# Instantiate an object of the Hunt class
hunt = Hunt()

# Print the value of get_weapon() from the object instance
print(hunt.get_weapon())
