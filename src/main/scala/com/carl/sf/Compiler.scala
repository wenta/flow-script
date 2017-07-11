package com.carl.sf

import com.carl.sf.compiler.AST.Module
import com.carl.sf.compiler.{Parser, TypeChecker, SymbolChecker}

/**
  * Compiler for FlowScript. It consists of the following phases:
  *  1. Parser and Lexer implemented with the help of ANTLR
  *  2. Semantic Analysis
  *   2.1. Variable Checker
  *   2.2. Type Checker
  *  3. Code generation
  */
object Compiler {

  def compile(code: String): Either[String, Module] = {
    Parser.parse(code)
      .flatMap(SymbolChecker.check)
      .flatMap(TypeChecker.check)
  }
}
