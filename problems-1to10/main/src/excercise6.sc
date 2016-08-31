val listPar = List(1, 2, 3, 3, 2, 1)
val listNoPar = List(1, 2, 3, 2, 1, 2)

def isPalindrome(ls: List[Int]): Boolean = ls == ls.reverse

isPalindrome(listPar)
isPalindrome(listNoPar)

def palindrome(ls: List[Int]): Boolean = {
  if(ls.isEmpty || ls.length == 1) true
  else if(ls.head == ls.last) palindrome(ls.tail.init)
  else false
}

palindrome(listPar)

def palindromeMatch(ls: List[Int]): Boolean = ls match {
  case Nil => true
  case _ :: Nil => true
  case ls :: lss => if(ls == lss.last) palindromeMatch(lss.init) else false
}

palindromeMatch(listPar)
palindromeMatch(listNoPar)

listPar.length
listPar((listPar.length)/2)

listPar.tail.init.tail.init.length
