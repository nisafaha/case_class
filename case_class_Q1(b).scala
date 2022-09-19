//20000065

object MyApp extends App {

    val p1 = point(1, 2);
    val p2 = point(2, 3);
    val p3 = p1.move(5,4);

    println(p1);
    println(p2);
    println(p3);

}

case class point(a:Int, b:Int) {
    def x:Int = a
    def y:Int = b

    def move(dx:Int, dy:Int) = point(this.x+dx, this.y+dy); 
}