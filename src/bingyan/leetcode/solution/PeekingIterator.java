package bingyan.leetcode.solution;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {
	Iterator<Integer> iterator;
	Integer peek;
	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		this.iterator = iterator;
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		if(this.peek == null)
			this.peek = iterator.next();
		return this.peek;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if(this.peek != null) {
			Integer r = this.peek;
			this.peek = null;
			return r;
		}
		return iterator.next();
	}

	@Override
	public boolean hasNext() {
		return this.peek != null || iterator.hasNext();
	}
}
