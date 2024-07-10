class Human:
    def __init__(self):
        self.leg_count = 4

    def get_gender(self):
        return "Unknown"

class Man(Human):
    def get_gender(self):
        return "Male"

class Woman(Human):
    def get_gender(self):
        return "Female"
