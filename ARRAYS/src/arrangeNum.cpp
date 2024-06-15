#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;

bool myComp(string x,string y){
    return x.append(y)>y.append(x)?true:false;
}

int main(){
    int n;
    vector<string>in;
    cin>>n;
    string x;
    for(int i=0; i<n; i++){
        cin>>x;
        in.push_back(x);
    }
    sort(in.begin(),in.end(),myComp);
    for(int i=0; i<n; i++){
        cout<<in[i];
    }
    return 0;
}

/*
T.C = O(NlogN);
S.C = O(X) // X=max no. of digits in the given numbers
*/