//  Eliminate consecutive duplicates of list elements.

val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
val easyList = List('a', 'a', 'b', 'c', 'c', 'b')


def compress[T](list: List[T]): List[T] = {
  list.foldLeft(List[T]()) {
    (r, c) => if (!r.isEmpty && r.head == c) r else r ::: List(c)
  }
}

compress(list)
list.distinct

List('a, 'b) :: List('c, 'd)
List('a, 'b) ::: List('c, 'd)

def compressRec[T](list: List[T]): List[T] = list match {
  case Nil => Nil
  case ls :: lss => ls :: compressRec(lss.dropWhile(ls ==))
}

compressRec(list)