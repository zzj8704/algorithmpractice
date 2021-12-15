package leetcode;

//实现 int sqrt(int x) 函数。
//
// 计算并返回 x 的平方根，其中 x 是非负整数。
//
// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
//
// 示例 1:
//
// 输入: 4
//输出: 2
//
//
// 示例 2:
//
// 输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842...,
//     由于返回类型是整数，小数部分将被舍去。
//
// Related Topics 数学 二分查找
// 👍 513 👎 0


class Question0069 {
    public int mySqrt(int x) {
        double xi = x, C = x;
        while (xi != 0) {
            double xi1 = (xi + C / xi) / 2;
            if (Math.abs(xi1 - xi) < 1e-6) {
                break;
            }
            xi = xi1;
        }
        return (int) xi;
    }


    public int mySqrt1(int x) {
        long c = System.currentTimeMillis();
        int current, left = 0, right = x, ans = 0;
        while (left <= right) {
            current = (right - left) / 2 + left;
            if (current * current <= x) {
                ans = current;
                left = current + 1;
            } else {
                right = current - 1;
            }
        }
        System.out.println(x + ":" + (System.currentTimeMillis() - c));
        return ans;
    }

    public int mySqrt1(int x, int N) {
        int current, left = 0, right = x, ans = 0;
        while (left <= right) {
            current = (right - left) / N + left;
            if ((long) current * current <= x) {
                ans = current;
                left = current + 1;
            } else {
                right = current - 1;
            }
        }
        return ans;
    }


    public int mySqrt2(int x) {

        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }

}
