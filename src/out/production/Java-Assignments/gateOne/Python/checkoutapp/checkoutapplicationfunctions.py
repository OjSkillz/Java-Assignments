from datetime import datetime
user_cart = {
        "products" : [],
        "quantity" : [],
        "prices" : [],
        "totals" : []
    }

checkout_header = {
    "LOCATION": "312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS.",
    "TEL 📞" : "032938287870",
    "Date" : datetime.now(),
    "Cashier" : "",
    "Customer" : ""
    }

bill_breakdown = {
    "Sub Total": 0.00,
    "Discount": 0.00,
    "VAT @ 7.5%" : 0.00,
    }
sub_total = []
bill_total = {"Bill Total": 0.00}
final_calculations = {"Amount Paid": 0.00, "Balance": 0.00}
def display_breaker_one():
    print(f"{'=' * 72}")

def display_breaker_two():
    print("------------------------------------------------------------------------")

def update_checkout_header(cashier_name: str, customer_name:str): 
    for name in cashier_name.split():
        checkout_header["Cashier"] += (name.capitalize() + " ")
    for names in customer_name.split():
        checkout_header["Customer"] += (names.capitalize() + " ")
    return checkout_header
    
def update_user_cart(product, quantity, price_per_unit):
    user_cart["products"].append(product.capitalize())
    user_cart["quantity"].append(quantity)
    user_cart["prices"].append(f"{price_per_unit:.2f}")
    user_cart["totals"].append(f"{quantity * price_per_unit:.2f}")
    return user_cart

def display_header():
    checkout_header["Date"] = datetime.now()
    print(f"SEMICOLON STORES\nMAIN BRANCH")
    for key, value in checkout_header.items():
        print(f"{key} : {value}")
    display_breaker_one()

def display_cart():
    print(f"\t\tITEM\t\tQTY\tPRICE(NGN)\tTOTAL(NGN)")
    display_breaker_two()
    for index in range(len(user_cart["products"])):
        print(f"\t\t{user_cart['products'][index]:<16}{user_cart['quantity'][index]:<8}{user_cart['prices'][index]:<16}{user_cart['totals'][index]:<18}")
    print()
    
def update_bill_breakdown(discount:float):
    VAT = 17.5 / 100
    for index in range(len(user_cart["totals"])):
        sub_total.append(float(user_cart['totals'][index]))
    bill_breakdown["Sub Total"] = f"{sum(sub_total):.2f}"
    bill_breakdown["Discount"] = (discount/100) * float((sum(sub_total)))
    bill_breakdown["VAT @ 7.5%"] = VAT * (sum(sub_total))
    return bill_breakdown

def display_bill_breakdown():
    display_breaker_two()
    for key, value in bill_breakdown.items():
        print(f"{'\t' * 5}{key}:\t{float(value):.2f}")
    display_breaker_one()

def display_bill_total():
    bill_total["Bill Total"] = float(bill_breakdown["Sub Total"]) - float(bill_breakdown["Discount"]) +float( bill_breakdown["VAT @ 7.5%"])
    for key, value in bill_total.items():
        print(f"{'\t' * 5}{key}:\t{value:.2f}")
        

def request_payment():
    display_breaker_one()
    print(f"\t\tTHIS IS NOT A RECEIPT. REQUEST NGN {bill_total['Bill Total']:.2f} FROM CUSTOMER")
    display_breaker_one()
    print()
    print()

def update_final_calculations(amount_paid):
    final_calculations["Amount Paid"] = float(amount_paid)
    final_calculations["Balance"] = (final_calculations["Amount Paid"]) - (bill_total["Bill Total"])
    return final_calculations

def display_final_calculations():
    for key, value in final_calculations.items():
        print(f"\t\t\t\t\t{key}:\t{value:.2f}")
    display_breaker_one()
    
def print_receipt():
    display_header()
    display_cart()
    display_bill_breakdown()
    display_bill_total()
    display_final_calculations()
    print("\t\tTHANK YOU FOR YOUR PATRONAGE")
    display_breaker_one()
    
