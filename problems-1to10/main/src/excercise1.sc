//Find the last element of a list.


val list = List(1,1,2,3, 5,8)

list.reverse.head
list.last

def lastElement(list: List[Int]): Int = list match {
  case Nil => throw new Exception("No elements")
  case li :: Nil => li
  case li :: lis => lastElement(lis)
}

lastElement(list)

def lastElementRec(list: List[Int]): Int = {
  if(list.tail.isEmpty) list.head
  else lastElementRec(list.tail)
}

lastElementRec(list)