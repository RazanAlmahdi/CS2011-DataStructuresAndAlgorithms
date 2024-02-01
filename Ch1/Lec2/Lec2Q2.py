'''
Read the first 50 lines of input and then write them out in reverse 
order. Read the next 50 lines and then write them out in reverse 26 
order. Do this until there are no more lines left to read, at which point 
any remaining lines should be output in reverse order. 
In other words, your output will start with the 50th line, then the 49th, 
then the 48th, and so on down to the first line. This will be followed by 
the 100th line, followed by the 99th, and so on down to the 51st line. 
And so on. Your code should never have to store more than 50 lines at 
any given time.
'''

f = open("1-200.txt", "r")
stack = []
numbers = f.readline().strip().split(' ')
for line in f:
    for i in range(1,50): # started from 1 because I read the first line before the loop
        stack.append(numbers)
        numbers = f.readline().strip().split(' ')
    for j in range(1,50):
        print(stack.pop())
f.close()
