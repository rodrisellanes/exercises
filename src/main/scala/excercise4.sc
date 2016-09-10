//Find the number of the elements of a remaining list

val list = List(1, 1, 2, 3, 5, 8, 9)

list.length

def lengthList(list: List[Int]): Int = {
  if (list.isEmpty) 0
  else 1 + lengthList(list.tail)
}

lengthList(list)

def lengthListMatch(list: List[Int]): Int = list match {
  case Nil => 0
  case _ :: lis => 1 + lengthListMatch(lis)
}

lengthListMatch(list)

def lengthFunctional[A](ls: List[A]): Int =
  ls.foldLeft(0) { (c, _) => c + 1 }

lengthFunctional(list)