package word10;

public class homework06 {
    //给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。
    // 编写一个方法，将 B 合并入 A 并排序。
    public void merge(int[] A, int m, int[] B, int n) {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] < B[j]) {
                A[k--] = B[j--];
            } else {
                A[k--] = A[i--];
            }
        }
        while (j >= 0) {
            A[k--] = B[j--];
        }
    }

    //输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int[] nums = new int[matrix.length * matrix[0].length];
        int r1 = 0;
        int r2 = matrix.length - 1;
        int c1 = 0;
        int c2 = matrix[0].length - 1;
        int index = 0;
        while (r1 <= r2 && c1 <= c2) {
            for (int i = c1; i <= c2; i++) {
                nums[index++] = matrix[r1][i];
            }
            for (int i = r1 + 1; i <= r2; i++) {
                nums[index++] = matrix[i][c2];
            }
            if (r1 != r2) {
                for (int i = c2 - 1; i >= c1; i--) {
                    nums[index++] = matrix[r2][i];
                }
            }
            if (c1 != c2) {
                for (int i = r2 - 1; i > r1; i--) {
                    nums[index++] = matrix[i][c1];
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return nums;
    }

    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
    // 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 != 0) {
                left++;
            }
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }
        return nums;

    }

    // 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B 中的元素
    // B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
    //left存放左侧的累乘结果
    //right存放右侧的累乘结果
    //result等于左侧的累乘结果*右侧的累乘结果
    public int[] constructArr(int[] a) {
        int length = a.length;
        if (length == 0) {
            return new int[0];
        }
        int[] left = new int[length];
        int[] right = new int[length];
        left[0] = a[0];
        right[length - 1] = a[length - 1];
        for (int i = 1; i < length - 1; i++) {
            left[i] = left[i - 1] * a[i];
        }
        for (int i = length - 2; i > 0; i--) {
            right[i] = right[i + 1] * a[i];
        }
        int[] result = new int[length];
        result[0] = right[1];
        result[length - 1] = left[length - 2];
        for (int i = 1; i < length - 1; i++) {
            result[i] = left[i - 1] * right[i + 1];
        }
        return result;
    }

}
