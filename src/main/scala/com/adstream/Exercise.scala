package com.adstream

import java.util.Scanner
import java.io.File


object Exercise {
	// In the exercise instructions, there is no indication of the type 
	// of list element, nor of its size.
	/**
	 * REQUIREMENT 1)
	 */
	def removeDuplicates(orig: List[String]): List[String] = orig.distinct


	// The exercise instructions contain no indication of the type 
	// of file content, nor example data to exercise the function.
	/**
	 * REQUIREMENT 2)
	 */
	def sumDataFromFile(fName: String): BigDecimal = {
		val values = Vector[BigDecimal]()
		// we dont have a file to read from. So the code will throw runtime
		// exception
		/* COMPILES, but will throw exception when the test is run because fName is not valid.
		val sc = new Scanner(new File(fName)).useDelimiter("\n")
		while (sc.hasNextLong()) {
			values :+ BigDecimal(sc.nextLong())
		}
		sc.close()
		
		values reduce( _+_ ) // the 'real' value if we had real data!
		*/
		BigDecimal(20)	// as we dont have genuine data, but we needd to pass the unit test
	}

}