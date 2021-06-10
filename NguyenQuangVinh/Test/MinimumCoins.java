package Test;
public class MinimumCoins {
    /**
   * This method finds the minimum number of coins needed for a given amount.
   *
   * @param coins The list of coins
   * @param amount The amount for which we need to find the minimum number of coins. Finds the the
   *     minimum number of coins that make a given value.
   */
    public static int minimumCoins(int[] coins, int amount) {
        // minimumCoins[i] will store the minimum coins needed for amount i
        int[] minimumCoins = new int[amount + 1];

        minimumCoins[0] = 0;

        for (int i = 1; i <= amount; i++) {
        minimumCoins[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    int sub_res = minimumCoins[i - coin];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < minimumCoins[i])
                        minimumCoins[i] = sub_res + 1;
                }
            }
        }
        return minimumCoins[amount];
    }

    public static void main(String args[]) {
        int[] coins = new int[]{1,2,3,5,7,11};
        System.out.println(minimumCoins(coins, 24));


    }
}