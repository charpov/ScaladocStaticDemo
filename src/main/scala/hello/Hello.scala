package hello

/** This is the one and only object in the package.
  *
  * @author
  *   John Doe
  */
object Hello:
   /** Prints command-line arguments.
     *
     * Can link to Scala, e.g., uses [[Seq.mkString]].
     *
     * Can link to Java, but `java` must be in the name, e.g., might throw
     * [[java.lang.IllegalStateException]].
     */
   def main(args: Array[String]): Unit = println("Hello" + args.mkString(" ", " ", "!"))
