//Find the last but one element of a list.


val list = List(1, 1, 2, 3, 5, 8)

def penultimate(list: List[Int]): Int = list match {
  case Nil => throw new NoSuchElementException("List with No Elements")
  case li :: lis :: Nil => li
  case li :: lis => penultimate(lis.tail)
}

penultimate(list)

list.init.last