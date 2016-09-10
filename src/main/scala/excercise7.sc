val list = List(List(1, 1), 2, List(3, List(5, 8)))

def flattenList(list: List[Any]): List[Any] = list match {
  case Nil => Nil
  case ls :: lss => ls match {
    case xs :: xss => flattenList(List(xs)) ::: flattenList(xss) ::: flattenList(lss)
    case _ => ls :: flattenList(lss)
  }

}

flattenList(list)
flattenList(List(1, List(2), 3))


val list1 = List(1, 2)
val list2 = List(3, 4)

list1 :: list2
list1 ::: list2 ::: List(1)

def flatten(list: List[Any]): List[Any] = list flatMap {
  case ls: List[_] => flatten(ls)
  case x => List(x)
}
