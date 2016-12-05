import scala.collection.mutable.ListBuffer

val coordinates = "L5, R1, L5, L1, R5, R1, R1, L4, L1, L3, R2, R4, L4, L1, L1, R2, R4, R3, L1, R4, L4, L5, L4, R4, L5, R1, R5, L2, R1, R3, L2, L4, L4, R1, L192, R5, R1, R4, L5, L4, R5, L1, L1, R48, R5, R5, L2, R4, R4, R1, R3, L1, L4, L5, R1, L4, L2, L5, R5, L2, R74, R4, L1, R188, R5, L4, L2, R5, R2, L4, R4, R3, R3, R2, R1, L3, L2, L5, L5, L2, L1, R1, R5, R4, L3, R5, L1, L3, R4, L1, L3, L2, R1, R3, R2, R5, L3, L1, L1, R5, L4, L5, R5, R2, L5, R2, L1, L5, L3, L5, L5, L1, R1, L4, L3, L1, R2, R5, L1, L3, R4, R5, L4, L1, R5, L1, R5, R5, R5, R2, R1, R2, L5, L5, L5, R4, L5, L4, L4, R5, L2, R1, R5, L1, L5, R4, L3, R4, L2, R3, R3, R3, L2, L2, L2, L1, L4, R3, L4, L2, R2, R5, L1, R2".replace(" ","").split(",").toList

val res = coordinates.map{x ⇒
 x.head → x.tail.toInt
}
val listCoord = ListBuffer[(Int, Int)]()
// 1-N=Y 2-E=X 3-S=-Y 4-W=-X

def recurs(coord: (Int, Int), list: List[(Char, Int)], watch: Int): (Int, Int) = {
  listCoord += coord._1 → coord._2
  if(list.nonEmpty) {
    val move = list.head
    watch match {
      case 1 ⇒ if (move._1 == 'L') {
        val watchNew = 4
        val x = coord._1 - move._2
        val y = coord._2
        recurs((x, y), list.tail, watchNew)
      } else {
        val watchNew = 2
        val x = coord._1 + move._2
        val y = coord._2
        recurs((x, y), list.tail, watchNew)
      }
      case 2 ⇒
        if (move._1 == 'L') {
          val watchNew = 1
          val x = coord._1
          val y = coord._2 + move._2
          recurs((x, y), list.tail, watchNew)
        } else {
          val watchNew = 3
          val x = coord._1
          val y = coord._2 - move._2
          recurs((x, y), list.tail, watchNew)
        }
      case 3 ⇒
        if (move._1 == 'L') {
          val watchNew = 2
          val x = coord._1 + move._2
          val y = coord._2
          recurs((x, y), list.tail, watchNew)
        } else {
          val watchNew = 4
          val x = coord._1 - move._2
          val y = coord._2
          recurs((x, y), list.tail, watchNew)
        }
      case 4 ⇒
        if (move._1 == 'L') {
          val watchNew = 3
          val x = coord._1
          val y = coord._2 - move._2
          recurs((x, y), list.tail, watchNew)
        } else {
          val watchNew = 1
          val x = coord._1
          val y = coord._2 + move._2
          recurs((x, y), list.tail, watchNew)
        }
    }
  } else coord
}



def abs(num: Int): Int = {
  if(num < 0) -num
  else num
}


def range(x1: Int, y1: Int, x2: Int, y2: Int): Int = {
  abs(x1 - y2) + abs(x2 - y1)
}

val (px1, py2) = recurs((0,0),res,1)

range(0,0,px1,py2)

//println(listCoord.map(x ⇒ s"(${x._1};${x._2})").mkString(" "))

val road = ListBuffer[(Int,Int)]()
def count(coord: (Int,Int), list: List[(Int,Int)]): List[(Int,Int)] = {
  if(list.nonEmpty){
    val (x1,y1) = coord
    val (x2,y2) = list.head
    if(x1 == x2){
      val steps = abs(y1 - y2)
      for{
        i ← 1 to steps
      } {
        if(y2 > y1)
          appendRoad(x1,y1+i)
        else
          appendRoad(x1,y1-i)
      }
      count(list.head,list.tail)
    } else {
      val steps = abs(x1 - x2)
      for{
        i ← 1 to steps
      } {
        if(x2 > x1)
          appendRoad(x1 + i,y1)
        else
          appendRoad(x1 - i,y1)
      }
      count(list.head,list.tail)
    }
  } else road.toList

}

def appendRoad(x:Int, y: Int) = {
  road.append((x,y))
}

val allRoute = count((0,0), listCoord.toList)

range(0,0,75,-4)