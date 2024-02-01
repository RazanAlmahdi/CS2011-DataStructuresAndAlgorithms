'''
Exercise 1.3. A matched string is a sequence of {, }, (, ), [, and ] characters
that are properly matched. For example, “{{()[]}}” is a matched string, but
this “{{()]}” is not, since the second { is matched with a ]. Show how to
use a stack so that, given a string of length n, you can determine if it is a
matched string in O(n) time.
'''
openingB = ['[', '{','(']
closingB=[']','}', ')']
stack = []
x = input("Enter: ")
valid = True
for i in x:
    if i in openingB and valid:
        stack.append(openingB.index(i))
    if i in closingB and stack and valid:
        if stack[-1] == closingB.index(i):
            stack.pop()
        else:
            valid = False
            
if valid and not stack:
    print("Valid")
else:
    print("Not Valid")
