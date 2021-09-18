class StringUtil01 {
  def concat(s: String*) = s.reduce((a, b) => a + b);
}

object StringUtil02 {
  def concat(s: String*) = s.reduce((a, b) => a + b);
}

println(new StringUtil01().concat("I", "'m", " ", "kickscar1"));
println(StringUtil02.concat("I", "'m", " ", "kickscar2"));


