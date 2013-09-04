// http://www.mathblog.dk/project-euler-problem-3/


/*
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?
*/

// answer = 6857

object Euler3 {
  def factorizeHelper(factor:Long, number:Long) : Long = {
    if(number <= 2) number else {
      if(factor >= number) factor else {
        if(number % factor == 0) {
          factorizeHelper(factor,number/factor)
        } else {
          factorizeHelper(factor+1,number)
        }
      }
    }
  }

  def factorize(number:Long) : Long = {
    factorizeHelper(2, number)
  }

  lazy val answer = factorize(600851475143L)
}
