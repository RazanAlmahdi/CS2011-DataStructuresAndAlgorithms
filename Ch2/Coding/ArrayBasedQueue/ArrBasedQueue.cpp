#include "ArrBasedQueue.h"
#include <string>
#include <iostream>
using namespace std;

ArrBasedQueue::ArrBasedQueue()
{
	a = new string[10];
    for (int i=0; i<10; i++)
    {
        a[i] = " ";
    }
    size = 10;
	n = 0; // the number of elements in the list
    j = 0;
}
ArrBasedQueue::~ArrBasedQueue()
{
	delete [] a;
}
void ArrBasedQueue::add(string x)
{
	if (n == size)
		resize();
	a[(j+n) % size] = x;
    n++;
}
string ArrBasedQueue::remove()
{
	string s = a[j];
    n --;
    j = (j+1) % size; // we can't say j++ because j could be == size
    if (n <= size/3)
        resize();
	return s;
}
void ArrBasedQueue::resize()
{
    string *b = new string[2*n];
    for (int i=0; i<n; i++)
        b[i] = a[(j+i) % size];
    
    delete []a;
    a = b;
    j = 0;
    size = 2*n;
}
void ArrBasedQueue::rotate(int r)
{
    string *temp = new string[size];
    for (int i=0; i<size; i++)
        temp[i] = a[i];

    for (int i=0; i<size; i++)
        temp[i] = a[(i+r) % size];
    j = 0;
    delete [] a;
    a = temp;
}