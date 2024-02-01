TARGETS	=		ArrBasedList

all:		$(TARGETS)

ArrBasedList:		ArrBasedListTestDriver.o  ArrBasedList.o
	g++ -o		ArrBasedList		ArrBasedListTestDriver.o		ArrBasedList.o

ArrBasedListTestDriver.o:		ArrBasedListTestDriver.cpp		ArrBasedList.h
	g++ -c ArrBasedListTestDriver.cpp

ArrBasedList.o:		ArrBasedList.cpp		ArrBasedList.h
	g++ -c ArrBasedList.cpp

clean:$
	rm -f *.o ArrBasedList
