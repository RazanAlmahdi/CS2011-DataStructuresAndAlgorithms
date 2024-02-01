#ifndef ArrBasedList_H
#define ArrBasedList_H
#include <string>
using namespace std;
class ArrBasedList
{
    private:
        string *a;
	    int s;
    public:
        ArrBasedList();
        ~ArrBasedList();
        int size();
        string get(int);
        void set(int, string);
        void add(int, string);
        string remove(int);
};
#endif