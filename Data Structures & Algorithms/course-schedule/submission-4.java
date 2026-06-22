class Solution {
    public static final Integer NOTVISITED=0;
    public static final Integer VISITING=1;
    public static final Integer VISITED=2;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        //gotta initialize
        for(int i = 0; i<numCourses; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] prereq: prerequisites){
            adjList.get(prereq[0]).add(prereq[1]);
        }
    
        int[] states = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            states[i]=NOTVISITED;
        }
        for(int i = 0; i<numCourses;i++){
            if(!dfs(states, adjList, i)) return false;
        }
        return true;
    }

    public boolean dfs(int[] states, List<List<Integer>> adjList, int node){
        if(states[node]==VISITING) return false;
        if(states[node]==VISITED) return true;
        states[node]=VISITING;
        List<Integer> adj = adjList.get(node);
        for(Integer neighbor: adj){
            if(!dfs(states, adjList, neighbor)) return false;
        }
        states[node]=VISITED;
        return true;
    }
}
