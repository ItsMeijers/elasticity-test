2. Background: Reactive Programming
===================================

Reactive programming is a programming paradigm for creating distributed web-scale systems. It is indepeneded from other paradigms, where reactive programming can be combined with other paradigms, such as imperative, object-oriented and functional programming. The origins of reactive programming are found in the functional reactive programming (FRP) area during the late 1990s. FRP was first seen in creating animations, with the use of Functional Reactive Animation (Fran), an embedded domain specific language in Haskell. Fran is a collection of functions and data types that introduced a seperation between behaviors and events. Behaviors are values that react to events, with no coupling in time. Events encapsulate composable values that contain side effect ** AND MORE ** __[Functional Reactive Animation]__. FRP has been further developed in papers such as _Functional Reactive Programming from First Principles_ and _Functional Reactive Programming, Continued_. __Summarize shortly the two papers [CITE PAPERS]__. In the more recent years, reactive programming has been gaining more popularity through programming languages such as Scala. Scala is a programming language that combines functional, imperative and object-oriented programming and will be used to provide code snippets. To unite the main stream developers in reactive programming, a document called _The Reactive Manifesto_ has been created. The next sections will use the reactive manifesto as a guideline for finding the origins of reactive programming and introduce the actor model, a model that can be used to create reactive programs.

2.1 The Reactive Manifesto
--------------------------

The reactive manifesto is a document originally created by four well known figures in the programming community; Jonas Bonér, Dave Farley, Roland Kuhn, and Martin Thompson. The manifest gives a high level overview of reactive programming, to provide a coherent approach for the design of reactive systems. However, the document is created by individuals, not verified and it is a manifest. The Oxford Dictonary defines the term manifesto as follows:

_`A written statement in which a group of people, especially a political party, explain their beliefs and say what they will do if they win an election.`_

The reactive manifesto is created in a different perspective then the means of a political party, but it still advocates a very opionated style of programming. It can be adjusted or expended by anyone, where the changes need to be approved by the maintainers of the reactive manifesto. When a developer agrees with the techniques of the reactive manifesto, he or she can sign the manifesto to show their support. At the time of writing the manifesto has been signed by 14501 people.

Since the reactive manifesto is not verified by an authorative organization, it cannot be fully trusted as a source containing true information. Since reactive programming is quite new and upcomming technique, it has a scarce amount of sources. The reactive manifesto thefore will only be used as a guideline for exploring further sources and find the origins of the ideas of reactive programming.

These origins of reactive programming can be found by looking at four traits that the reactive manifesto introduces; _event driven, resilient, elastic_ and _responsive_. The manifesto states that a a program can only be called _reactive_ when the program fullfills each of these traits. In the following sections, each trait will be covered, where the trait _responsive_ will unite all of the traits, since responsiveness is the main goal of a reactive program. 

2.2 Event Driven
----------------

2.3 Resilient
-------------

2.4 Elastic
-----------

2.5 Responsive
--------------

2.6 The Actor Model
-------------------
