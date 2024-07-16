def filter_negative(numbers):
    # Use list comprehension to filter out negative numbers
    return [num for num in numbers if num >= 0]

# Test list
numbers = [4, -9, 1, -2, 8, 0, 3, 7, -6]
filtered_numbers = filter_negative(numbers)
print("Original numbers:", numbers)
print("Positive numbers:", filtered_numbers)
