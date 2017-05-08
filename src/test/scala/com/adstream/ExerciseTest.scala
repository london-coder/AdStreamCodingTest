package com.adstream

import org.scalatest.{FlatSpec, Matchers}

class ExerciseTest extends FlatSpec with Matchers {
	
	"A collection" should "have distinct entries" in {
		val myList = List("Mary", "had", "had", "a", "little", "lamb", "lamb")
		assert(Exercise.removeDuplicates(myList).length === 5)
	}

	"A summation function" should "return a sum of unknown file of unknown numeric content" in {
		assert(Exercise.sumDataFromFile("someFileName") === 20)
	}
}