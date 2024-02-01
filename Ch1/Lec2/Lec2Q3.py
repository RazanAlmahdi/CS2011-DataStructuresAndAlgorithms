'''
Read the input one line at a time. At any point after reading the first 
42 lines, if some line is blank (i.e., a string of length 0), then output the 
line that occurred 42 lines prior to that one. For example, if Line 242 is 
blank, then your program should output line 200. This program should 
be implemented so that it never stores more than 43 lines of the input 
at any given time
'''

f = open("words.txt", "r")
queue = []
words = f.readline()

for line in f:
    for j in range (0,43):
        queue.append(words)
        words = f.readline()
    if queue[-1] == '\n':
        print(queue.pop(0))
    for i in queue:
        queue.pop()
f.close()
