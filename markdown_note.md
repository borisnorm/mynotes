Reference to: https://help.github.com/articles/markdown-basics/

# The largest heading

## The second largest heading

*This text will be italic*

**This text will be bold**

* Item
* Item
* Item

- Item
- Item
- Item

1. Item 1
2. Item 2
3. Item 3

1. Item 1
  1. A corollary to the above item.
  2. Yet another point to consider.
2. Item 2
  * A corollary that does not need to be ordered.
    * This is indented four spaces, because it's two spaces further than the item above.
    * You might want to consider making a new list.
3. Item 3


* Code block

```java
package dmcoder.mycode.onlinejudge.leetcode.script;

import dmcoder.mycode.onlinejudge.leetcode.ListNode;
import dmcoder.mycode.onlinejudge.leetcode.TreeNode;

/**
 * Title: Convert Sorted List to Binary Search Tree
 * 
 * URL: https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 * 
 * Given a singly linked list where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 * 
 * Tags: [Depth-first Search], [Linked List]
 * 
 * @author Dongye Meng
 *
 */
public class ConvertSortedListToBinarySearchTree {
	private ListNode current = null;

	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}

		int len = getLength(head);
		current = head;

		return sortedListToBSTHelper(len);
	}

	private TreeNode sortedListToBSTHelper(int size) {
		if (size <= 0) {
			return null;
		}

		TreeNode left = sortedListToBSTHelper(size / 2);
		TreeNode root = new TreeNode(current.val);
		current = current.next;
		TreeNode right = sortedListToBSTHelper(size - size / 2 - 1);

		root.left = left;
		root.right = right;

		return root;
	}

	private int getLength(ListNode head) {
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}

		return len;
	}
}
```
