//20000065

object MyApp extends App {
    
    val p1 = point(1, 2);
    val p2 = point(2, 3);
    val p3 = p1.distance(p2);

    println(p3);

}

case class point(a:Int, b:Int) {
    def x:Int = a
    def y:Int = b

    def distance(that:point):Double = {
        math.sqrt(math.pow(math.abs(this.x - that.x), 2) + math.pow(math.abs(this.y - that.y), 2));   
    }
}