#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    int n;
    cin >> n;
    vector<pair<int, int>> v;
    int x, y;
    for (int i = 0; i < n; i++)
    {
        cin >> x >> y;
        v.push_back({x, y});
    }

    // sort
    sort(v.begin(), v.end());

    vector<pair<int, int>> ans;
    ans.push_back(v[0]);
    for(int i=1; i<n; i++){
        if(v[i].first<=ans.back().second) ans.back().second=max(v[i].second,ans.back().second);
        else ans.push_back(v[i]);
    }
    for(auto it:ans){
        cout<<it.first<<" "<<it.second<<endl;
    }

    return 0;
}

/*
T.C = O(N*logN)
S.C = O(1)
*/