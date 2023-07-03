class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            // First element of the row is always 1
            currentRow.add(1);

            // Calculate the elements in between based on the previous row
            for (int j = 1; j < i; j++) {
                int num = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(num);
            }

            // Last element of the row is always 1
            currentRow.add(1);

            triangle.add(currentRow);
        }

        return triangle;
    }
}