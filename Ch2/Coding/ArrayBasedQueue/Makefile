TARGETS	=		ArrBasedQueue

all:		$(TARGETS)

ArrBasedQueue:		ArrBasedQueueTestDriver.o  ArrBasedQueue.o
	g++ -o		ArrBasedQueue		ArrBasedQueueTestDriver.o		ArrBasedQueue.o

ArrBasedQueueTestDriver.o:		ArrBasedQueueTestDriver.cpp		ArrBasedQueue.h
	g++ -c ArrBasedQueueTestDriver.cpp

ArrBasedQueue.o:		ArrBasedQueue.cpp		ArrBasedQueue.h
	g++ -c ArrBasedQueue.cpp

clean:$
	rm -f *.o ArrBasedQueue
