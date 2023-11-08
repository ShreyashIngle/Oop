#include <iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;
    int n;
    cin >> n;
    int ch = 0;
    int A[100];

    while (t--)
    {
        /* code */
        for (int i = 0; i < n; i++)
        {
            cin >> A[i];
        }
        for (int i = 1; i < n; i++)
        {
            if (A[i] < A[i - 1])
            {
                ch = 1;
            }
        }
    }
        if (ch == 1)
        {
            cout << "no" << endl;
            break;
        }

        else
        {
            cout << "yes" << endl;
        }

    return 0;
}
