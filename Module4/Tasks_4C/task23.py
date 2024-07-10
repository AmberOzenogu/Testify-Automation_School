class User:
    def __init__(self):
        self.__password = "password"

    def get_password(self):
        return self.__password

class ActiveUser(User):
    def get_password(self):
        return "********"

# Instantiate an object of the ActiveUser class
active_user = ActiveUser()

# Print the value of get_password() from the object instance
print(active_user.get_password())
