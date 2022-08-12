#include <iostream>
using namespace std;

void bfs(vector<int> adj,int v,int s)
{
    vector<bool> visted(v+1,false);
    queue<int> q;
    visited[s] = true;
    q.push(s);

    while(!q.empty())
    {
        int u = q.front();
        q.pop();
        for(auto v: adj[u]) //traversing the adjacent edges 
        {
            if(visited[v]==false)
            {
                visited[v] = true;
                q.push(v);
            }
        }
    }
}

int main()
{
    
}