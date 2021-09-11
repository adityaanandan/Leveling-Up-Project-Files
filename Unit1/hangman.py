print("Welcome to Hangman in Python. You have six guesses to correctly guess a   specific word. ")
print ("Make sure not to fail, or suffer the consequences!!"
yeet = ['''
  +---+
  |   |
      |
      |
      |
      |
=========''', '''
  +---+
  |   |
  0   |
      |
      |
      |
=========''', '''
  +---+
  |   |
  0   |
  |   |
      |
      |
=========''', '''
  +---+
  |   |
  0   |
 /|   |
      |
      |
=========''', '''
  +---+
  |   |
  0   |
 /|\  |
      |
      |
=========''', '''
  +---+
  |   |
  0   |
 /|\  |
 /    |
      |
=========''', '''
  +---+
  |   |
  0   |
 /|\  |
 / \  |
      |
========='''] 
 
gameOver = 0
while gameOver == 0:
    from random import randint
    wordList = ["yeet", "bruh", "yoink", "sussy", "brother", "sister"]
    word = wordList[randint(0, 5)]
    dashes = "-" * len(word)
    result = 0
    correct = "" 
    missed = ""
    guesses = 6
    print(dashes)
    while len(missed) < 6: 
        player = input("Please guess a letter (lowercase only)")
        if (player in word): 
            print("Your guess is correct!")
            correct = correct + player
        else: 
            print("Your guess is incorrect")
            missed = missed + player
        for i in range(len(word)):
            if word[i] in correct: 
                dashes = dashes[:i] + word[i] + dashes[i+1:]
        print(dashes)
        print(yeet[len(missed)])
        if (dashes == word): 
            print("You have won!")
            result = 1
            break 
    if result == 0: 
        print("You have DIED!!!") 
    next = input("Want to play again (enter y/n)")
    if next == "n": 
        gameOver = 1
