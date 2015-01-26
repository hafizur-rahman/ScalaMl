/**
 * Copyright (c) 2013-2015  Patrick Nicolas - Scala for Machine Learning - All rights reserved
 *
 * The source code in this file is provided by the author for the sole purpose of illustrating the 
 * concepts and algorithms presented in "Scala for Machine Learning". It should not be used to 
 * build commercial applications. 
 * ISBN: 978-1-783355-874-2 Packt Publishing.
 * Unless required by applicable law or agreed to in writing, software is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * 
 * Version 0.98.1
 */
package org.scalaml.reinforcement

		/**
		 * This package object encapsulates the skeleton for the implementation of the 
		 * extended learning classifiers (XCS) using the following classes:<br>
		 * - Actions triggered following the matching and selection of the most
		 * appropriate rules <b>XcsAction</b><br>
		 * - Rules defined as {predicate, action} and comprising the search space or 
		 * knowledge base <b>XcsRule</b><br>
		 * - Singleton to generate new rule (predicate, action) if no match for the current 
		 * state/condition (predicate) of the environment exists  <b>XcsCover</b><br>
		 * - Sensor or input event (condition met) generated by the environment <b>XcsSensor</b><br>
		 * - Skeleton of the implementation of the XCS algorithm <b>Xcs</b><br>
		 *  @note Scala for Machine Learning Chapter 11 Reinforcement learning / Extended Learning
		 *  classifiers system
		 */
package object xcs { }
// ---------------------------------------  EOF -----------------------------------------