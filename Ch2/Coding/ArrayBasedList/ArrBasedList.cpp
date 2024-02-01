#include "ArrBasedList.h"
#include <string>
#include <iostream>
using namespace std;

ArrBasedList::ArrBasedList()
{
	a = new string[10];
	s = 0; // the number of elements in the list
}
ArrBasedList::~ArrBasedList()
{
	delete [] a;
}
int ArrBasedList::size()
{
	return s;
}
string ArrBasedList::get(int i)
{
	return a[i];
}
void ArrBasedList::set(int i, string x)
{
	a[i] = x;
}
void ArrBasedList::add(int i, string x)
{
	if (s == 10)
		cout << "You cannot add new elements." << endl;
	else
	{
		for (int j = s; j > i; j--) // start from the right
			a[j] = a[j - 1];
	}
	a[i] = x;
	s++;
}
string ArrBasedList::remove(int i)
{
	string x = a[i];				// store the element
	for (int j = i; j < s - 1; j++) // start from the right
		a[j] = a[j + 1];
	s--;
	return x;
}