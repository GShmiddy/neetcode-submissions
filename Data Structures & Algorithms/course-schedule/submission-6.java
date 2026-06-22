class Solution {
    public static final Integer NOTVISITED=0;
    public static final Integer VISITING=1;
    public static final Integer VISITED=2;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }
        for(int [] preReq: prerequisites){
            adjList.get(preReq[0]).add(preReq[1]);
        }

        int[] states = new int[numCourses];
        for(int i =0; i<numCourses; i++){
            states[i]=NOTVISITED;
        }
        for(int i =0;i<numCourses; i++){
            if(!dfs(i, states, adjList)) return false;
        }
        return true;
    }

    public boolean dfs(int node, int[] states, List<List<Integer>> adj){
        if(states[node]==VISITING) return false;
        if(states[node]==VISITED) return true;
        states[node]=VISITING;
        List<Integer> neighbors = adj.get(node);
        for(int neighbor: neighbors){
            if(!dfs(neighbor, states, adj)) return false;
        }
        states[node]=VISITED;
        return true;
    }

}
