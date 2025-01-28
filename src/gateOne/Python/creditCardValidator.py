def validate_card_details(number:str):
    valid_elements = "0123456789"
    while len(number) < 13 or len(number) > 16:
        print("\nInvalid card length! Card length must be between 13 and 16 digits")
        number = input("Enter card number >>>  ")
        for character in number:
            if character not in valid_elements:
                print("\nInvalid character found in card number! Card number must contain digits only")
                number = input("Enter card number >>>  ")
    return (f"**Credit Card Number:   {number}\n**Credit Card Digit Length: {len(number)}")
    
def check_card_type(number: str):
    if number[:1 :] == "4":
        return "**Credit Card Type:   Visa Card"
    elif number[:1 :] == "5":
        return "**Credit Card Type:   MasterCard"
    elif number[: 2: ] == "37" :
        return "**Credit Card Type:   American Express Card"
    elif number[:1:] == "6":
        return "**Credit Card Type:   Discover Card"
    return "**Credit Card Type:   Invalid Card"

def double_second_digits_from_right(number:str):
    number_reversed = number[ : : -1]
    doubled_digits = []
    for index in range(1, len(number), 2):
        doubled_digits.append(int(number_reversed[index]) * 2)
    for element in doubled_digits:
        if element - 1 >= 9 :
            new_element = int(str(element)[0]) + int(str(element)[1])
            doubled_digits[doubled_digits.index(element)] = new_element
    return doubled_digits

def sum_doubled_digits(number:str):
    return sum(double_second_digits_from_right(number))

def sum_digits_in_odd_places_from_right(number:str):
    number_reversed = number[ : : -1]
    odd_placed_digits = []
    for index in range(0, len(number), 2):
        odd_placed_digits.append(int(number_reversed[index]))
    return sum(odd_placed_digits)

def get_card_validity_status(number:str):
    result = sum_doubled_digits(number) + sum_digits_in_odd_places_from_right(number)
    if result % 10 == 0:
        return "**Credit Card Validity Status:  Valid"
    return "**Credit Card Validity Status:  Invalid"

def credit_card_validator():
    card_number =  input("Hello, Kindly Enter Card Number to Validate Your Card >>>  ")
    response = input("Card Number Saved Successfully. Enter ↩️  to view your card status  >>>  ")
    print(check_card_type(card_number))
    print(validate_card_details(card_number))
    print(get_card_validity_status(card_number))
 
credit_card_validator()
