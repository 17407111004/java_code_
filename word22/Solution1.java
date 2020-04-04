package word22;

import java.util.*;

class Employee {
    // 它是每个节点的唯一id
    // 此员工的唯一id
    public int id;
    // 该员工的重要价值
    public int importance;
    //直接下属的身份证
    public List<Integer> subordinates;
};
public class Solution1 {
    public int getImportance(List<Employee> employees, int id) {
        int tmp = 0;
        Queue<Employee> que =  new LinkedList<Employee>();
        Map<Integer, Employee> mp = new HashMap<Integer, Employee>();

        for(int i = 0; i < employees.size(); i++)
            mp.put(employees.get(i).id,employees.get(i));

        que.offer(mp.get(id));
        while(!que.isEmpty())
        {
            tmp += que.peek().importance;
            for(int i = 0;i < que.peek().subordinates.size();i++)
                que.offer(mp.get(que.peek().subordinates.get(i)));
            que.poll();
        }
        return tmp;
    }
    public int findJudge(int N, int[][] trust) {
        int[] flag=new int[N+1];
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<trust.length;i++){
            set.add(trust[i][0]);
            flag[trust[i][1]]++;
        }
        for(int i=1;i<N+1;i++){
            if(flag[i]==N-1&&!set.contains(i))
                return i;
        }
        return -1;
    }
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int num: A) {
            sum += num;
        }

        if (sum % 3 != 0) {
            return false;
        }
        sum /= 3;
        int curSum = 0, cnt = 0;
        for (int i = 0; i < A.length; i++) {
            curSum += A[i];
            if (curSum == sum) {
                cnt++;
                curSum = 0;
            }
        }
        return cnt == 3 || (cnt > 3 && sum == 0);

    }
}
