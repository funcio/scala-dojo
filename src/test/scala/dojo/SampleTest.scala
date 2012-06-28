package dojo

import org.scalatest.FlatSpec

class SampleTest extends FlatSpec {
  
   val five = 5

  "The Scala language" must "add correctly" in {
     val sum = 2 + 3
     assert(sum === five)
   }

   it must "subtract correctly" in {
     val diff = 7 - 2
     assert(diff === five)
   }
}