from unittest import TestCase
import creditCardValidator

class TestCreditCardValidator(TestCase):
    def test_that_credit_card_validator_exists(self):
        creditCardValidator
    
    def test_that_function_validate_card_details_exists(self):
        creditCardValidator.validate_card_details("4388576018402626")
    
    def test_that_function_validate_card_details_returns_correct_value(self):
        card_number = "4388576018402626"
        actual = creditCardValidator.validate_card_details(card_number)
        expected = f"**Credit Card Number:   {'4388576018402626'}\n**Credit Card Digit Length: {'16'}"
        self.assertEqual(actual, expected)
        
    def test_that_function_check_card_type_returns_correct_value(self):
        self.assertEqual(creditCardValidator.check_card_type("4388576018402626") , "**Credit Card Type:   Visa Card")
     
    def test_that_function_double_second_digits_from_right_returns_correct(self):
        self.assertEqual(creditCardValidator.double_second_digits_from_right("4388576018402626") , [4,4,8,2,3,1,7,8])
    
    def test_that_function_sum_doubled_digits_returns_correct_value(self):
        self.assertEqual(creditCardValidator.sum_doubled_digits("4388576018402626") , 37)
    
    def test_that_function_sum_digits_in_odd_places_from_right_returns_correct_value(self):
        self.assertEqual(creditCardValidator.sum_digits_in_odd_places_from_right("4388576018402626") , 38)
    
    def test_that_function_get_card_validity_status_returns_correct_value(self):
        self.assertEqual(creditCardValidator.get_card_validity_status("4388576018402626") ,  "**Credit Card Validity Status:  Invalid")
    
    def test_that_function_credit_card_validator_returns_nothing(self):
        self.assertEqual(creditCardValidator.credit_card_validator(), None)
