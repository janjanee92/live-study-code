package com.jihan.javastudycode.week12;

import java.lang.annotation.Inherited;

@Inherited
@interface SupperAnno {}

@SupperAnno
class Parent {
}

class Child extends Parent {}
