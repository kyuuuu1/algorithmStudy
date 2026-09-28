import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {

        int last = num_list[num_list.length - 1];
        int before = num_list[num_list.length - 2];

        int add;

        if (last > before) {
            add = last - before;
        } else {
            add = last * 2;
        }

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[answer.length - 1] = add;

        return answer;
    }
}