# Function to print multiplication table
def multiplication_table():
    # Print the header row
    print("    ", end="")
    for i in range(1, 11):
        print(f"{i:4}", end="")
    print("\n" + " " * 4 + "-" * 40)

    # Print the table rows
    for i in range(1, 11):
        print(f"{i:2} |", end="")
        for j in range(1, 11):
            print(f"{i * j:4}", end="")
        print()

# Call the function to print the table
multiplication_table()
