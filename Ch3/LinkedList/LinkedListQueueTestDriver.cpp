#include "LinkedListQueue.h"
int main()
{
    LinkedListQueue q;
    q.push("1");
	q.push("2");
	q.push("3");
	q.push("4");
	for (int i=0; i<4; i++)
		cout << q.pop() << endl;
    return 0;
}