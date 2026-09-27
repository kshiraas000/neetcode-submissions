class Solution {

    private Map<Integer, List<Integer>> preMap = new HashMap<>();
    private Set<Integer> visiting = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            preMap.put(i, new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            preMap.get(prereq[0]).add(prereq[1]);
        }

        for (int j = 0; j < numCourses; j++) {
            if (!dfs(j)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int courses) {
        if (visiting.contains(courses)) {
            return false;
        }
        if (preMap.get(courses).isEmpty()) {
            return true;
        }

        visiting.add(courses);
        for (int pre : preMap.get(courses)) {
            if (!dfs(pre)) {
                return false;
            }
        }

        visiting.remove(courses);
        preMap.put(courses, new ArrayList<>());
        return true;
    }
}
