sentence = input("Enter a sentence >> ")
split_sentence = sentence.split()
for word in split_sentence:
    print( word.capitalize() + " ",end="")
print()
