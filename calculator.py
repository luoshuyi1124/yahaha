print("bees knees")
equation = input()
number = ""
signs = ""
for x in equation: #build number from string(equation)
    if x.isnumeric():
        number += x
    else:
        if x == "+" or '-':
            signs += x

print(number + signs)



    