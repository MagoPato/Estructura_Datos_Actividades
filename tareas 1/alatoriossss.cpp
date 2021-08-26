#include<iostream>
#include<windows.h>

using namespace std;

int main(){
	double a=0;
	for(int i=1; i<=10; i++){
		for(int j=1; j<=10; j++){
			cout<<i<<" * "<<j<<" = "<<i*j;
			cout<<endl;
		}
		cout<<endl;
	}
}
