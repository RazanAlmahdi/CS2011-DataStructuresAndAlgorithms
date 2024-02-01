#ifndef LinkedListQueue_H
#define LinkedListQueue_H
#include <string>
#include "Node.h"
using namespace std;
class LinkedListQueue
{
    private:
        Node *head;
        Node *tail;
        int n;
    public:
        LinkedListQueue();
        void push(string);
        string pop();
};
#endif