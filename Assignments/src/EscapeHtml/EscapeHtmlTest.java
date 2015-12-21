package EscapeHtml;

import org.apache.commons.lang3.StringEscapeUtils;


/**
 * @author Anjita
 * EscapeHtmlTest demonstrating encoding and decoding of script tag
 */
public class EscapeHtmlTest {

	public static void main(String[] args) throws Exception {

		String results = StringEscapeUtils.escapeHtml4("<div>hii;</div>");
		System.out.println(results);
	}
}
