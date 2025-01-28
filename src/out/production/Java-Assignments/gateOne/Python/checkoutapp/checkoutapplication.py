
import os
from checkoutapplicationfunctions import *

print()
customer_name = input("Customer's name -> ")
response = "yes"
print()

while response.lower() != "no" and len(response) == 3 :
    customer_order = input("Item -> ")
    while type(customer_order) != str :
        print("Invalid input! Enter a combination of alphabets")
        print()
        customer_order = input("Item -> ")

    print()
    quantity = int(input("Qty -> "))
    while type(quantity) != int or quantity < 0:
        print("Invalid input! Enter a whole numerical value")
        print()
        quantity = int(input("Qty -> "))
     
    print()
    price_per_unit = float(input("Price per unit -> "))
    while type(price_per_unit) == str or price_per_unit < 0 :
        print("Invalid input! Prices cannot be negative")
        print()
        price_per_unit = float(input("Price per unit -> "))
        
    print()
    update_user_cart(customer_order, quantity, price_per_unit)
    
    response = input("Add more Items?  ")
    print()
    while response.lower() != "yes" and response.lower() != "no" or response.isdigit() == True and len(response) < 2 or len(response) > 3:
        print("Invalid response! Enter 'yes' or 'no'")
        print()
        response = input("Add more Items?  ")
        print()
        
cashier_name = input("Cashier's  name -> ")
print()
discount = float(input("Discount in % -> "))
print()
update_checkout_header(cashier_name, customer_name)

_ = input("Press 'enter' to view the customer's payment invoice >> ")
_ = "clear"
os.system(_)
display_header()
display_cart()
update_bill_breakdown(discount)
display_bill_breakdown()
display_bill_total()
request_payment()

amount_paid = float(input("Amount received from customer -> "))
print()
_ = input("Press 'enter' to view the customer's payment receipt >> ")
_ = "clear"

os.system(_)
display_breaker_one()
print(f"Here is {checkout_header['Customer']}'s receipt")
display_breaker_one()
update_final_calculations(amount_paid)
print_receipt()



