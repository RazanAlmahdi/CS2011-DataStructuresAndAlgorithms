import random

file1 = open("words.txt","a") 
PsudoRandomWords = ["Apple\n", "Banana\n", "Tree\n", "\n", "Orange\n", "Coffee\n", "Done\n", "A\n", "B\n", "C\n", "D\n"]

index = 0
#Increase the range to make a bigger file
for x in range(1000):
   #Change end range of the randint function below if you add more words
   index = random.randint(0,10)
   file1.write(PsudoRandomWords[index])
file1.close()