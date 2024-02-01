#include "ArrBasedQueue.h"
#include <string>
#include <iostream>

int main()
{
    ArrBasedQueue q;
    q.add("One");
    q.add("Two");
    q.add("Three");
    q.add("Four");
    q.add("Five");
    q.add("Six");
    q.add("Seven");
    q.add("Eight");
    q.add("Nine");
    q.add("Ten");

    q.rotate(4);
    for (int i=0; i<10; i++)
        cout << q.remove() << " " << endl;
        
    return 0;
}