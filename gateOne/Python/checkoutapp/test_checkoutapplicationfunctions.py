from unittest import TestCase
import checkoutapplicationfunctions
from datetime import datetime

class TestCheckOutApplicationFunctions(TestCase):
    def test_that_function_display_breaker_one_exists(self):
        checkoutapplicationfunctions.display_breaker_one()
    def test_that_function_display_breaker_two_exists(self):
        checkoutapplicationfunctions.display_breaker_two()
    
    def test_that_function_update_checkout_header_exists(self):
        checkoutapplicationfunctions.update_checkout_header("cashier_name", "customer_name")
   
    
    
