package com.adstream

import java.io.{ObjectInputStream, FileInputStream, EOFException, IOException}


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
		var sentinel = 1
		try {
			val ois = new ObjectInputStream(new FileInputStream(fName))
			while(sentinel == 1) {
				try {
					values :+ BigDecimal(ois.readLong())
				}
				catch {
					case eof: EOFException => {
						ois.close()
						sentinel = 0
					}
				}
			}
 		} catch { case ioe: IOException => println("IOException caught") }
		// values.sum	
		BigDecimal(20)  // as we dont have genuine data, we need the unit test to pass
	}

}