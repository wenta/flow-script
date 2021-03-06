package com.carl.sf.compiler

import org.scalatest._


/**
  * Test for checking that we can parse specific syntax
  */
class ParserTest extends FlatSpec with Matchers {

  "Parser" should "return error for wrong syntax" in {
    val code =
      """
        |module Test1 aaa
        |
        |def my_fun(a: Int, xs: Int): Int = a
      """.stripMargin
    val ast = Parser.parse(code)
    ast.isLeft shouldBe true
  }

  "Parser" should "at least one function definition is required" in {
    val code =
      """
        |module Test1 aaa
        |
      """.stripMargin
    val ast = Parser.parse(code)
    ast.isLeft shouldBe true
  }

  it should "parse simple function expression" in {
    val code =
      """
        |module Test1
        |
        |def my_fun(a: Int, xs: Int): Int = a
      """.stripMargin
    val ast = Parser.parse(code)
    ast.isRight shouldBe true
  }

  it should "parse function application" in {
    val code =
      """
        |module Test1
        |
        |def my_fun(a: Int, b: Int): Int = min(a, b)
      """.stripMargin
    val ast = Parser.parse(code)
    ast.isRight shouldBe true
  }

  it should "parse function application without params" in {
    val code =
      """
        |module Test1
        |
        |def my_fun(a: Int, b: Int): Int = min()
      """.stripMargin
    val ast = Parser.parse(code)
    ast.isRight shouldBe true
  }

  it should "parse external function definitions" in {
    val code =
      """
        |module Test1
        |
        |external def min(v1: Int, v2: Int): Int
        |
        |def my_fun(a: Int, b: Int): Int = min(a, b)
      """.stripMargin
    val ast = Parser.parse(code)
    ast.isRight shouldBe true
  }

  it should "parse string literal" in {
    val code =
      """
        |module Test1
        |
        |def main(): String = 'hello'
      """.stripMargin
    val ast = Parser.parse(code)
    ast.isRight shouldBe true
  }

  it should "parse string literal in double quotes" in {
    val code =
      """
        |module Test1
        |
        |def main(): String = "hello "\"world\""
      """.stripMargin
    val ast = Parser.parse(code)
    ast.isRight shouldBe true
  }

}