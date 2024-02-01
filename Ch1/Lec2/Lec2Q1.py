'''
Read the input one line at a time and then write the 
lines out in reverse order, so that the last input line is 
printed first, then the second last input line, and so 
on.
'''
f = open("1-200.txt", "r")
stack = []

for line in f:
    numbers = line.strip().split(' ')
    stack.append(numbers)
for i in range(0,200):
    print(stack.pop())
f.close()
