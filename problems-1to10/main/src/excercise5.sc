// Reverse a list.

val list = List(1, 1, 2, 3, 6, 7, 9)

list.reverse

def lastElement(list: List[Int]): Int = list match {
  case Nil => throw new Error("Empty List")
  case li :: Nil => li
  case _ :: lis => lastElement(lis)
}

def reverseList(list: List[Int]): List[Int] = {
  if(list.isEmpty) Nil
  else lastElement(list) :: reverseList(list.init)
}

reverseList(list)

def reverseListFold(list2: List[Int]): List[Int] =
  list2.foldLeft(List[Int]()) { (x, y) => y :: x }

reverseListFold(list)
