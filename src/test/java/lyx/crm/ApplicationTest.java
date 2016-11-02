/**
 * 
 */
package lyx.crm;

import static org.junit.Assert.assertTrue;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liangyx
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	@ClassRule
	public static OutputCapture out = new OutputCapture();

	@Test
	public void test() {
		String output = out.toString();
//		System.out.println(output);
//		assertTrue("Wrong output: " + output, output.contains("1,San Francisco,CA,US"));
	}
}
