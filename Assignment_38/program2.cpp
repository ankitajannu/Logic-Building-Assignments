#include<iostream>
using namespace std;

template <class T>
T Max(T no1, T no2, T no3)
{
    if((no1 > no2) && (no1 > no3))
    {
        return no1;
    }
    else if((no2 > no1) && (no2 > no3))
    {
        return no2;
    }
    else
    {
        return no3;
    }
}

int main()
{
    cout<<Max(10,20,30)<<"\n";
    cout<<Max(10.0f,20.5f,10.2f)<<"\n";
    cout<<Max(23.50,20.70,3.5)<<"\n";

    return 0;
}