package com.dmlab.util;

import java.util.EmptyStackException;

import com.dmlab.interfaces.Stack;

/**
 * Array-based Stack
 * The size of the internal array should be 128
 */
public class MyStack<E> implements Stack<E> {
	
	private E[] mData;
	private int mCursor;
	
	public MyStack() {
		clear();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		/* Code Here */

	}

	@Override
	public void push(E item) throws RuntimeException {
		/* Code Here */

	}

	@Override
	public E pop() throws EmptyStackException {
		/* Code Here */

	}
 
	@Override
	public E peek() throws EmptyStackException {
		/* Code Here */

	}

	@Override
	public boolean empty() {
		/* Code Here */

	}

}
