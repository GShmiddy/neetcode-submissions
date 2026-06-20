class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> preMap = new HashMap<>();
        for (int [] preReq : prerequisites){
            preMap.computeIfAbsent(preReq[0], k -> new ArrayList<>()).add(preReq[1]);
        }
        HashSet<Integer> visited = new HashSet<>();
        for(int i = 0; i<numCourses; i++){
            if(dfs(i, visited, preMap) == false){
                return false;
            }
        }
        return true;
    }

 private boolean dfs(int course, Set<Integer> visited, HashMap<Integer, List<Integer>> preMap){
        if(visited.contains(course)){
            return false;
        }
        if(preMap.get(course) == null){
            return true;
        }
        visited.add(course);
        List<Integer> preReqList = preMap.get(course);
        for(int preReq : preReqList){
            if(dfs(preReq, visited, preMap) == false){
                return false;
            }
        }
        visited.remove(course);
        preMap.put(course, null);
        return true;
    }
}
