import difflib
#open text and store in variable called contents
with open("linuxwords.txt","r" ) as f: 
    contents = f.read()
 
#make text into a list 
contents = contents.casefold().splitlines()
 
#spellcheck method 
def spellcheck(word): 
    if word in contents: 
        return True
    return False
 
#autocheck method 
def auto_check(s): 
    for word in s.casefold().split(): 
        if word not in contents: 
            suggestion = difflib.get_close_matches(word, contents)
            print(f'Did You Mean: {", " .join(str(x) for x in          mmmmmmmmmmmmmmmmmmsuggestion)} instead of {word}?')
 
 
#user interface 
s = input("Enter a sentence")
auto_check(s)
 
w = input("Enter a word")
spellcheck(w)
