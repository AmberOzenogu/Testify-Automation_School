def length_converter(meter):
    # Convert meters to centimeters (1 meter = 100 centimeters)
    centimeter = meter * 100
    return centimeter

length = 27
converted_length = length_converter(length)

print(f"{length} meters is equivalent to {converted_length} centimeters")
