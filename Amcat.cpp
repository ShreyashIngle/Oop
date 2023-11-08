#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    int start = 2;
    int end = 100;

    for (int i = start ; i < end +1; i++)
    {
        /* code */
        int count = 0;

        for (int j = start; j <= i; j++)
        {
            /* code */
            if (i%j == 0)
            {
                count ==1;

            }
            else if (count==0)
            {
                /* code */
                cout<<i;
               cout<<endl;
            }
            
            
        }
        
    }
    
    return 0;
}
