from unittest import TestCase
import creditCardValidator

class TestCreditCardValidator(TestCase):
    def test_that_credit_card_validator_exists(self):
        creditCardValidator
    
    def test_that_function_validate_card_length_exists(self):
        creditCardValidator.validate_card_length("4388576018402626")
    
    def test_that_function_validate_card_length_returns_correct_value(self):
        card_number = "4388576018402626"
        actual = creditCardValidator.validate_card_length(card_number)
        expected = card_number
        self.assertEqual(actual, expected)
        
        card_number = "4388576018/02626"
        actual = creditCardValidator.validate_card_length(card_number)
        expected = "Invalid character found in card number! Card number must contain digits only"
        self.assertEqual(actual, expected)
