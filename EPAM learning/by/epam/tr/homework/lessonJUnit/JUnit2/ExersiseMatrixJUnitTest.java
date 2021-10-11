public class ExersiseMatrixJUnitTest {
				@Test
	public void ZeroTest() {
				int[] mas = {2,2,3};
				int[][] realmas;
				int[][] expectedmas = {{1, 1, 1}, {2, 2, 3}, {4, 4, 9}};
				int n = 3;
				realmas = ExersiseMatrixJUnit.Printmatrix(n, mas);
				for(int i = 0; i < expectedmas.length; i++){
					for(int j = 0; j < realmas[j].length - 1; j++){
						Assert.assertEquals(expectedmas[i][j], realmas[i][j]);
			}
		}
	}
}
