//Find the Kth element of a list.

val list2 = List(1, 1, 2, 3, 5, 8)


def kthElement(elem: Int, list2: List[Int]): Int = {
  if (elem < list2.length) list2(elem)
  else throw new NullPointerException("Over-range element")
}

kthElement(2, list2)