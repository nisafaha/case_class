//20000065

object MyApp extends App {
    val p1 = point(1, 2);

    val p2 = p1.invert();
    println(p1);
    println(p2);

}

case class point(a:Int, b:Int) {
    def x:Int = a
    def y:Int = b

    def invert() = point(this.y, this.x);
}