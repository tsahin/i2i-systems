
/*
DBC EXAMPLE
author: Tugba Sahin
date: 29.06.2018
definiton: Design by Contract for Java example

*/
 package dbc.test;
 /**
 * LIFO Container
 * @invariant obj().count() >= 0
 * @invariant obj().count() < obj().capacity()
 * @invariant obj().empty() == (obj().count() == 0)
 * @invariant obj().full() $implies !obj().empty()
 */
 public interface Stack
 {
   /**
   * Maximum number of stack elements
   */
   public int capacity();

   /**
   * Number of stack elements
   */
   public int count();

   /**
   * Top element
   * @pre !obj().empty(), wait
   */
   public Object item();
   /**
   * Is stack empty?
   * @post $return == (obj().count() == 0)
   */
   public boolean empty();


   /**
   * Is stack full?
   * @post $return == (obj().count() == obj().capacity())
   */
   public boolean full();

   /**
   * Add obj on top
   * @pre !obj().full(), wait
   * @post !obj().empty()
   * @post obj().item() == obj
   * @post obj().count() == old().count() + 1
   */
   public void put(Object obj);
   /**
   * Remove top element
   * @pre !obj().empty()
   * @post obj().count() == old().count() - 1
   */
   public void remove();

   }