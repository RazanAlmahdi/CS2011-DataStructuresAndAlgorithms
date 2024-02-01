'''
Exercise 1.4. Suppose you have a Stack, s, that supports only the push(x)
and pop() operations. Show how, using only a FIFO Queue, q, you can
reverse the order of all elements in s.
'''
n = int(input("How many elements do you have? "))
s = []
q = []

for i in range(0,n):
    s.append(int(input("Enter element: ")))
print("\nElements in reversed order:\n")
for i in range(0,n):
    q.append(s.pop())
    print(q.pop())
