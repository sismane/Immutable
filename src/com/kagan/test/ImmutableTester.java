package com.kagan.test;

public class ImmutableTester {

	public static void main(String[] args) {
		Immutable1 immutable1 = new Immutable1(1);
		//immutable1.count = 2;//compile error because final field can not be assigned after first initialization!
        Immutable2 immutable2 = new Immutable2();
        ImmutableBase base = new ImmutableBase();//final base class
	}

}
