class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(array[0]-n);

        for(int i=1; i<array.length; i++){
            int distance=Math.abs(array[i]-n);

            if(distance<min ||
                    (distance == min && array[i] < answer)){
                min = distance;
                answer =array[i];
            }
        }
        return answer;
    }
}