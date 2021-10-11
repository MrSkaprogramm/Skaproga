package by.epam.tr.main;

import org.junit.Assert;
import org.junit.Test;

public class ExersiseArrayJUnitTest {
				@Test
	public void ZeroTest() {
				int[] mas = {1,2,3,4,5,6,7,8,9,10,11};
				int[] realmas;
				int[] expectedmas = {1,0,3,0,5,0,7,0,9,0,11};
				realmas = ExersiseArrayJUnit.newArray(mas);
				for(int i = 0; i < expectedmas.length; i++){
					Assert.assertEquals(expectedmas[i], realmas[i]);
				}
			}
	}
