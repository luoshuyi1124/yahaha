print("Play my game *puts gun to your head*")

playing = input('Yes / no ')

if playing.lower() != "yes":
    print('Thank you for ordering our special slimy salt! Check your bedsheets tonight :)')
    quit()

print('you shouldn\'t have')

def repeat(Qnum = 1, score = 0, Qanswer = 0):

    list = [1,2,3,4]

    questions = ['What is 34 + 23? ', 'Who lives in the pineapple under the sea? ', 'Which legendary did Pokemon White have on the box art? ', 'Which bending in ATLA is the most OP? ']

    correct = ['57', 'spongebob', 'Zekrom', 'waterbending']
    
    for x in list:
        answer = input('Q' + str(Qnum) + ': ' + questions[Qanswer])
        if answer.lower() == str(correct[Qanswer]).lower():
            print('wowe you did it')
            score += 1
            Qnum += 1
            Qanswer += 1
        else:
            print(':(')
            Qnum += 1
            Qanswer += 1
    print('Score: ' + str(score))

repeat()