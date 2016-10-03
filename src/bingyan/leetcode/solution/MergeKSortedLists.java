package bingyan.leetcode.solution;

public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists == null || lists.length == 0)
			return null;
		if(lists.length == 1)
			return lists[0];

		ListNode[] arr = new ListNode[(lists.length + 1) / 2];
		int index = 0;
		for(int i=0; i<lists.length; i+=2) {
			if(i + 1 >= lists.length) {
		        arr[index++] = lists[i];
		        continue;
		    }
			
			ListNode h = null;
			ListNode t = null;
			
			while(lists[i] != null || lists[i + 1] != null) {
				int in = 0;
				if(lists[i] == null)
					in = i + 1;
				else if(lists[i + 1] == null)
					in = i;
				else if(lists[i].val <= lists[i + 1].val)
					in = i;
				else
					in = i + 1;
				
				ListNode node = lists[in];
				lists[in] = lists[in].next;
				
				node.next = null;
				if(h == null)
					h = t = node;
				else {
					t.next = node;
					t = node;
				}
			}
			
			arr[index++] = h;
		}
		return mergeKLists(arr);
	}
}
