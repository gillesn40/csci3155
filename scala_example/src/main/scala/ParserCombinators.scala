// http://henkelmann.eu/2011/01/28/an_introduction_to_scala_parser_combinators-part_2_literal_expressions
// http://kerflyn.wordpress.com/2012/08/25/playing-with-scala-parser-combinator/

import scala.util.parsing.combinator._
import scala.util.parsing.input._

object SimpleParser extends JavaTokenParsers {
  def expr: Parser[Float] = ((term ~ "+" ~ expr) | term) ^^ {
    case((s:Float) ~ _ ~ (t:Float)) => s+t
    case(s:Float) => s
  }
  def term: Parser[Float] = ((atom ~ "*" ~ term) | atom) ^^ {
    case((s:Float) ~ _ ~ (t:Float)) => s*t
    case(s:Float) => s
  }
  def atom: Parser[Float] = (floatingPointNumber | ("(" ~ expr ~ ")")) ^^ {
    case(s:String) => s.toFloat
    case(_ ~ (e:Float) ~ _) => e
  }

  def parse(s:String) : Float = {
    expr(new CharSequenceReader(s)).get
  }
}

// val x = SimpleParser.parse("1+2+((3*(2+2)))")
