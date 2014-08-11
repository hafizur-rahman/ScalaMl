package org.scalaml.app.chap5


import org.scalaml.supervised.bayes._
import org.scalaml.core.{Types, XTSeries}
import org.scalaml.workflow.data.{DataSource,TextSource}
import scala.collection.mutable.ArrayBuffer
import Types.ScalaMl._
import org.scalaml.filtering.SimpleMovingAverage
import SimpleMovingAverage._
import scala.collection.immutable.HashSet
import org.scalaml.supervised.bayes.NaiveBayes


object Chap5 extends App {
  private def runAll = {
	 BinomialBayesEval.run(Array[String]("0.5", "8"))
	 TextBayesEval.run
  }
	
  final val cmdDescriptor: String = {
	new StringBuilder("Command line: Chap 5 arg\n")
		  .append(" bayes: Evaluation Binomial Naive Bayes\n")
		  .append(" textBayes:  Evaluation Naive Bayes for text analysis\n")
		  .append(" all: All evaluation").toString
  }
  
  try {
     if( args == null || args.length == 0) "?" else args(0) match {
	  	 case "?" => println(cmdDescriptor)
	  	 case "bayes" => BinomialBayesEval.run(Array[String]("0.5", "8"))
	  	 case "textBayes" => TextBayesEval.run
	  	 case "all" => runAll
	  	 case _ =>  println(cmdDescriptor)
	 }
  }
  catch {
     case e: IllegalArgumentException => println( "Naive Bayes failed " + e.toString)
  	 case e: RuntimeException =>  println("Naive Bayes failed " + e.toString)
  }
}

// -----------------------------  EOF ------------------------------------