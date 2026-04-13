class Solution {
    public int countOdds(int low, int high) {
        return countFromOne(high) - countFromOne(low - 1);
    }

    private int countFromOne(int n) {
        return (n + 1) / 2;
    }
}