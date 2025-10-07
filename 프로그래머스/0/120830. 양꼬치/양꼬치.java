class Solution {
	public int solution(int n, int k) {

		int meat = n * 12000;
		
		int drink = k * 2000;
		
		int free = n / 10;
		
		int total = meat + drink - (free * 2000);
		
		return total;
	}
}
