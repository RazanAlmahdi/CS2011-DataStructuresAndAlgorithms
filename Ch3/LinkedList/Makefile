TARGETS	=		LinkedListQueue

all:		$(TARGETS)

LinkedListQueue:		LinkedListQueueTestDriver.o  LinkedListQueue.o
	g++ -o		LinkedListQueue		LinkedListQueueTestDriver.o		LinkedListQueue.o

LinkedListQueueTestDriver.o:		LinkedListQueueTestDriver.cpp		LinkedListQueue.h
	g++ -c LinkedListQueueTestDriver.cpp

LinkedListQueue.o:		LinkedListQueue.cpp		LinkedListQueue.h
	g++ -c LinkedListQueue.cpp

clean:$
	rm -f *.o LinkedListQueue
