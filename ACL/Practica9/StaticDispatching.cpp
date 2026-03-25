#include <iostream>

using namespace std;

class A {
    public:
    virtual void hello() {
        cout << "hello from A!";
    }
};

class B : public A {
    public:
    void hello() {
        cout << "hello from B!";
    }
};

int main() {
    cout << "\nFrom C++ programm\n";
    A* i = new B();
    i->hello();

    return 0;
}
