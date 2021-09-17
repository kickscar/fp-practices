package example

object Upper {
  def upper(strings: String*): Seq[String] = {
    return strings.map(e => e.toUpperCase());
  }

  def main(args: Array[String]): Unit = {
    println(upper("hello", "world"));
  }
}
