package com.scala.basics.helloworld

object foreach extends App {

  case class Person(name: String, isMale: Boolean, children: Person*)

  val lara = Person("lara",false)
  val bob = Person("bob",true)
  val julie = Person("Julie",false,lara,bob)
  val persons = List(lara, bob,julie)

  print(persons filter (p=> !p.isMale) flatMap(p=>(p.children map(c=> (p.name, c.name)))))


  for(p<- persons; if !p.isMale; c<-p.children)
    println (p.name,c.name)

  for {
    p <- persons
    n = p.name
    if (n startsWith "l")
  } println(n)

  for (x<- List(1,2);y<-List("One","Two"))
    println(x,y)

}
