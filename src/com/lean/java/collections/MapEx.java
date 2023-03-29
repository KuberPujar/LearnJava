package com.lean.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> languages=new HashMap<>();
if(languages.containsKey("Java"))
{
	System.out.println("Java already exists");
}
else
{
	languages.put("Java", "Java is a High Level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere, meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.");
	System.out.println("Java added successfully");
}

	languages.put("Python", "Python is an interpreted high-level general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant indentation. Its language constructs as well as its object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.");
	languages.put("ALGOL", "ALGOL is a family of imperative computer programming languages originally developed in 1958. ALGOL heavily influenced many other languages and was the standard method for algorithm description used by the Association for Computing Machinery in textbooks and academic sources for more than thirty years.");
	languages.put("BASIC", "BASIC is a family of general-purpose, high-level programming languages whose design philosophy emphasizes ease of use. The original version was designed by John G. Kemeny and Thomas E. Kurtz and released at Dartmouth College in 1964. They wanted to enable students in fields other than science and mathematics to use computers. At the time, nearly all use of computers required writing custom software, which was something only scientists and mathematicians tended to learn.");
	languages.put("Lisp", "Lisp (historically LISP) is a family of programming languages with a long history and a distinctive, fully parenthesized prefix notation. Originally specified in 1958, Lisp is the second-oldest high-level programming language in widespread use today. Only Fortran is older, by one year. Lisp has changed since its early days, and many dialects have existed over its history. Today, the best-known general-purpose Lisp dialects are Racket, Common Lisp, Scheme and Clojure.");
	
	if(languages.containsKey("Java"))
	{
		System.out.println("Java already exists");
	}
	else
	{
		languages.put("Java", "Java is a High Level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
		//System.out.println("Java added successfully");
	}
	System.out.println(languages.get("Java"));
	
	languages.entrySet().stream().forEach(s->System.out.println(s.getKey()+":::"+s.getValue()));
	}
	

}
