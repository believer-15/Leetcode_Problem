class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] nextgreat = new int[nums2.length];

        for (int i = nums2.length - 1; i >= 0; i--) {
            int ele = nums2[i];

            // Remove elements from the stack that are smaller than the current element
            while (!stack.isEmpty() && stack.peek() <= ele) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nextgreat[i] = -1;
            } else {
                nextgreat[i] = stack.peek();
            }
            stack.push(ele);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], nextgreat[i]);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}

// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int[] nums3 = new int[nums1.length];

//         for (int i = 0; i < nums3.length ; i++)
//         {
//             nums3[i] =  findNextMaxNum(nums2 , nums1[i]);
//         }
//         return nums3;
//     }

//     public static int findNextMaxNum(int[] arr , int n )
//     {
//          int temp = -1 ;
//         for (int i = 0 ; i < arr.length ; i++)
//         {
//             if (arr[i] == n) {
//                 while ((i + 1) < arr.length && temp <= n) {
//                     i++;
//                     temp = Math.max(n, arr[i]);
//                 }
//                 break;
//             }
//         }
//         return (temp == n) ? -1 : temp ;
//     }
// }