def second_largest(numbers):
    if len(numbers) < 2:
        raise ValueError("List must contain at least two numbers.")

    # Remove duplicates to ensure proper ranking
    unique_numbers = list(set(numbers))
    
    if len(unique_numbers) < 2:
        raise ValueError("List must contain at least two unique numbers.")

    # Sort the unique numbers in descending order
    unique_numbers.sort(reverse=True)
    
    # Return the second largest number
    return unique_numbers[1]

# Example usage
numbers = [10, 30, 20, 5, 30, 15]
result = second_largest(numbers)
print("The second largest number is:", result)