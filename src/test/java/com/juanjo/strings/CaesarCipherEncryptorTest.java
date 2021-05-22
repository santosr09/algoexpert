package com.juanjo.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CaesarCipherEncryptorTest {
	private CaesarCipherEncryptor testClass;
	
	@BeforeAll
	private void setUp() {
		testClass = new CaesarCipherEncryptor();
	}
	
	@Test
	public void testEncrypto_1() {
		String str = "abcdef";
		int key = 1;
		Assertions.assertEquals("bcdefg", testClass.caesarCypherEncryptor(str, key));
	}
	
	@Test
	public void testEncrypto_2() {
		String str = "xyz";
		int key = 2;
		Assertions.assertEquals("zab", testClass.caesarCypherEncryptor(str, key));
	}
	
	@Test
	public void testEncrypto_3() {
		String str = "abc";
		int key = 52;
		Assertions.assertEquals("abc", testClass.caesarCypherEncryptor(str, key));
	}
	
}
