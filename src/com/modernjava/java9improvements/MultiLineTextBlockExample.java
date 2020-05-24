package com.modernjava.java9improvements;

public class MultiLineTextBlockExample {
	public static void main(final String[] args) {

		final String st1 = """
				Hello World
				Using
				text blocks !""";

		System.out.println("st1 = " + st1);

		final String phrase = """
				{
				employee : "Mike",
				employeeId: 10001;
				employeeType: FT
				}
				""";

		System.out.println("phrase = " + phrase);

		final String html = """
				<html>
				    <body>
				    <p>"Java, Programming"</p>
				    </body>
				</html>
				""";

		System.out.println("html = " + html);

		final String st2 = st1.concat("This is my first text block");
		System.out.println("st2 = " + st2);

	}
}
