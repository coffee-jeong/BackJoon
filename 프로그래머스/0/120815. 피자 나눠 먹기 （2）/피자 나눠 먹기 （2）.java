class Solution {
	public int solution(int n) {
		int pizzas = 1;
		while ((6 * pizzas) % n != 0) {
			pizzas++;
		}
		return pizzas;
	}
}
