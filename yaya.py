# write a function that takes two integers from terminal and multiplies them
from multiprocessing.resource_sharer import stop


def Backpfeifengesicht():    
    print(' > gib zwei nummers (one at time)')
    try:
        x = input()
        y = input()
        if x or y == 'exit':
            print('Auf Wiedersehen. try again')
            exit()
        if x != 'exit':
            input1 = float(x)
            input2 = float(y)
            print(input1 * input2)
    except Exception:
        print(' > du hast Krebs verdient')
        
    Backpfeifengesicht()

print(Backpfeifengesicht())