package by.epam.tr.main;

import org.junit.Assert;
import org.junit.Test;

public class ExersiseArrayJUnitTest {
				@Test
	public void ZeroTest() {
				int[] mas = {1,2,3,4,5,6,7,8,9,10,11};
				int[] realmas;
				int[] expectedmas = {1,0,3,0,4,0,6,0,8,0,10,0};
				realmas = ExersiseArrayJUnit.newArray(mas);
				Assert.assertEquals(expectedmas, realmas);
				}
	}
