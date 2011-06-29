package com.design.patterns.visitor;

class Gladiolus implements Flower {  
  public void accept(Visitor v) { v.visit(this);}
}