package org.sbolstandard.core2;

import static org.junit.Assert.assertTrue;

import org.junit.Assume;

public class SBOLWriterTest extends SBOLAbstractTests {

	@Override
	public void runTest(final String fileName, final SBOLDocument expected, String fileType, boolean compliant) throws Exception {
		assumeNotNull(expected);
		SBOLValidate.validateSBOL(expected, false, compliant, false);
		if (SBOLValidate.getNumErrors()>0) {
			for (String error : SBOLValidate.getErrors()) {
				System.err.println(error);
			}
			assertTrue(false);
		}
		SBOLDocument actual = SBOLTestUtils.writeAndRead(expected,compliant);
		if (!actual.equals(expected)) {
			System.out.println("Expected:"+expected.toString());
			System.out.println("Actual  :"+actual.toString());
		}
		assertTrue(actual.equals(expected));
	}

	private static <A> void assumeNotNull(A a) {
		Assume.assumeNotNull(a);
	}

}