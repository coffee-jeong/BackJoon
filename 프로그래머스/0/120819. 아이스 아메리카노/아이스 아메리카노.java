class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int price = 5500;
        
        int count = money / price;
        answer[0] = count;
        
        int change = money % price;
        answer[1] = change;
        
        return answer;
    }
}