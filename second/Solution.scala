val input = "DDDURLURURUDLDURRURULLRRDULRRLRLRURDLRRDUDRUDLRDUUDRRUDLLLURLUURLRURURLRLUDDURUULDURDRUUDLLDDDRLDUULLUDURRLUULUULDLDDULRLDLURURUULRURDULLLURLDRDULLULRRRLRLRULLULRULUUULRLLURURDLLRURRUUUDURRDLURUURDDLRRLUURLRRULURRDDRDULLLDRDDDDURURLLULDDULLRLDRLRRDLLURLRRUDDDRDLLRUDLLLLRLLRUDDLUUDRLRRRDRLRDLRRULRUUDUUDULLRLUDLLDDLLDLUDRURLULDLRDDLDRUDLDDLDDDRLLDUURRUUDLLULLRLDLUURRLLDRDLRRRRUUUURLUUUULRRUDDUDDRLDDURLRLRLLRRUDRDLRLDRRRRRRUDDURUUUUDDUDUDU\nRLULUULRDDRLULRDDLRDUURLRUDDDUULUUUDDRDRRRLDUURDURDRLLLRDDRLURLDRRDLRLUURULUURDRRULRULDULDLRRDDRLDRUDUDDUDDRULURLULUDRDUDDDULRRRURLRRDLRDLDLLRLUULURLDRURRRLLURRRRRLLULRRRDDLRLDDUULDLLRDDRLLUUDRURLRULULRLRUULUUUUUDRURLURLDDUDDLRDDLDRRLDLURULUUDRDLULLURDLLLRRDRURUDDURRLURRDURURDLRUDRULUULLDRLRRDRLDDUDRDLLRURURLUDUURUULDURUDULRLRDLDURRLLDRDUDRUDDRLRURUDDLRRDLLLDULRRDRDRRRLURLDLURRDULDURUUUDURLDLRURRDRULLDDLLLRUULLLLURRRLLLDRRUDDDLURLRRRDRLRDLUUUDDRULLUULDURLDUUURUDRURUDRDLRRLDRURRLRDDLLLULUDDUULDURLRUDRDDD\nRDDRUDLRLDDDRLRRLRRLUULDRLRUUURULRRLUURLLLRLULDDLDLRLULULUUDDDRLLLUDLLRUDURUDDLLDUDLURRULLRDLDURULRLDRLDLDRDDRUDRUULLLLRULULLLDDDULUUDUUDDLDRLRRDLRLURRLLDRLDLDLULRLRDLDLRLUULLDLULRRRDDRUULDUDLUUUUDUDRLUURDURRULLDRURUDURDUULRRULUULULRLDRLRLLRRRLULURLUDULLDRLDRDRULLUUUDLDUUUDLRDULRDDDDDDDDLLRDULLUDRDDRURUDDLURRUULUURURDUDLLRRRRDUDLURLLURURLRDLDUUDRURULRDURDLDRUDLRRLDLDULRRUDRDUUDRLURUURLDLUDLLRDDRDU\nLLDDDDLUDLLDUDURRURLLLLRLRRLDULLURULDULDLDLLDRRDLUDRULLRUUURDRLLURDDLLUDDLRLLRDDLULRLDDRURLUDRDULLRUDDLUURULUUURURLRULRLDLDDLRDLDLLRUURDLUDRRRDDRDRLLUDDRLDRLLLRULRDLLRLRRDDLDRDDDUDUDLUULDLDUDDLRLDUULRULDLDULDDRRLUUURUUUDLRDRULDRRLLURRRDUDULDUDUDULLULLULULURLLRRLDULDULDLRDDRRLRDRLDRLUDLLLUULLRLLRLDRDDRUDDRLLDDLRULLLULRDDDLLLDRDLRULDDDLULURDULRLDRLULDDLRUDDUDLDDDUDRDRULULDDLDLRRDURLLRLLDDURRLRRULLURLRUDDLUURULULURLRUDLLLUDDURRLURLLRLLRRLDULRRUDURLLDDRLDLRRLULUULRRUURRRDULRLRLRDDRDULULUUDULLLLURULURRUDRLL\nUULLULRUULUUUUDDRULLRLDDLRLDDLULURDDLULURDRULUURDLLUDDLDRLUDLLRUURRUDRLDRDDRRLLRULDLLRUUULLLDLDDULDRLRURLDRDUURLURDRUURUULURLRLRRURLDDDLLDDLDDDULRUDLURULLDDRLDLUDURLLLLLRULRRLLUDRUURLLURRLLRDRLLLRRDDDRRRDLRDRDUDDRLLRRDRLRLDDDLURUUUUULDULDRRRRLUDRLRDRUDUDDRULDULULDRUUDUULLUDULRLRRURDLDDUDDRDULLUURLDRDLDDUURULRDLUDDLDURUDRRRDUDRRDRLRLULDRDRLRLRRUDLLLDDDRURDRLRUDRRDDLDRRLRRDLUURLRDRRUDRRDLDDDLRDDLRDUUURRRUULLDDDLLRLDRRLLDDRLRRRLUDLRURULLDULLLUDLDLRLLDDRDRUDLRRDDLUU"

val testInput = "ULL\nRRDDD\nLURDL\nUUUUD"


val strings = input.split("\n").toList

val testString = testInput.split("\n").toList


def keyBoard1(list: List[Char], acc: Char): Char = {
  if(list.isEmpty) acc
  else {
    acc match {
      case '1' ⇒ list.head match{
        case 'U' ⇒ keyBoard1(list.tail,'1')
        case 'D' ⇒keyBoard1(list.tail,'4')
        case 'R' ⇒keyBoard1(list.tail,'2')
        case 'L' ⇒keyBoard1(list.tail,'1')
      }
      case '2' ⇒list.head match{
        case 'U' ⇒ keyBoard1(list.tail,'2')
        case 'D' ⇒keyBoard1(list.tail,'5')
        case 'R' ⇒keyBoard1(list.tail,'3')
        case 'L' ⇒keyBoard1(list.tail,'1')
      }
      case '3' ⇒list.head match{
        case 'U' ⇒ keyBoard1(list.tail,'3')
        case 'D' ⇒keyBoard1(list.tail,'6')
        case 'R' ⇒keyBoard1(list.tail,'3')
        case 'L' ⇒keyBoard1(list.tail,'2')
      }
      case '4' ⇒list.head match{
        case 'U' ⇒ keyBoard1(list.tail,'1')
        case 'D' ⇒keyBoard1(list.tail,'7')
        case 'R' ⇒keyBoard1(list.tail,'5')
        case 'L' ⇒keyBoard1(list.tail,'4')
      }
      case '5' ⇒list.head match{
        case 'U' ⇒ keyBoard1(list.tail,'2')
        case 'D' ⇒keyBoard1(list.tail,'8')
        case 'R' ⇒keyBoard1(list.tail,'6')
        case 'L' ⇒keyBoard1(list.tail,'4')
      }
      case '6' ⇒list.head match{
        case 'U' ⇒ keyBoard1(list.tail,'3')
        case 'D' ⇒keyBoard1(list.tail,'9')
        case 'R' ⇒keyBoard1(list.tail,'6')
        case 'L' ⇒keyBoard1(list.tail,'5')
      }
      case '7' ⇒list.head match{
        case 'U' ⇒ keyBoard1(list.tail,'4')
        case 'D' ⇒keyBoard1(list.tail,'7')
        case 'R' ⇒keyBoard1(list.tail,'8')
        case 'L' ⇒keyBoard1(list.tail,'7')
      }
      case '8' ⇒list.head match{
        case 'U' ⇒ keyBoard1(list.tail,'5')
        case 'D' ⇒keyBoard1(list.tail,'8')
        case 'R' ⇒keyBoard1(list.tail,'9')
        case 'L' ⇒keyBoard1(list.tail,'7')
      }
      case '9' ⇒list.head match{
        case 'U' ⇒ keyBoard1(list.tail,'6')
        case 'D' ⇒keyBoard1(list.tail,'9')
        case 'R' ⇒keyBoard1(list.tail,'9')
        case 'L' ⇒keyBoard1(list.tail,'8')
      }
    }
  }
}

def keyBoard2(list: List[Char], acc: Char): Char = {
  if(list.isEmpty) acc
  else {
    acc match {
      case '1' ⇒ list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'1')
        case 'D' ⇒keyBoard2(list.tail,'3')
        case 'R' ⇒keyBoard2(list.tail,'1')
        case 'L' ⇒keyBoard2(list.tail,'1')
      }
      case '2' ⇒list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'2')
        case 'D' ⇒keyBoard2(list.tail,'6')
        case 'R' ⇒keyBoard2(list.tail,'3')
        case 'L' ⇒keyBoard2(list.tail,'2')
      }
      case '3' ⇒list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'1')
        case 'D' ⇒keyBoard2(list.tail,'7')
        case 'R' ⇒keyBoard2(list.tail,'4')
        case 'L' ⇒keyBoard2(list.tail,'2')
      }
      case '4' ⇒list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'4')
        case 'D' ⇒keyBoard2(list.tail,'8')
        case 'R' ⇒keyBoard2(list.tail,'4')
        case 'L' ⇒keyBoard2(list.tail,'3')
      }
      case '5' ⇒list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'5')
        case 'D' ⇒keyBoard2(list.tail,'5')
        case 'R' ⇒keyBoard2(list.tail,'6')
        case 'L' ⇒keyBoard2(list.tail,'5')
      }
      case '6' ⇒list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'2')
        case 'D' ⇒keyBoard2(list.tail,'A')
        case 'R' ⇒keyBoard2(list.tail,'7')
        case 'L' ⇒keyBoard2(list.tail,'5')
      }
      case '7' ⇒list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'3')
        case 'D' ⇒keyBoard2(list.tail,'B')
        case 'R' ⇒keyBoard2(list.tail,'8')
        case 'L' ⇒keyBoard2(list.tail,'6')
      }
      case '8' ⇒list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'4')
        case 'D' ⇒keyBoard2(list.tail,'C')
        case 'R' ⇒keyBoard2(list.tail,'9')
        case 'L' ⇒keyBoard2(list.tail,'7')
      }
      case '9' ⇒list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'9')
        case 'D' ⇒keyBoard2(list.tail,'9')
        case 'R' ⇒keyBoard2(list.tail,'9')
        case 'L' ⇒keyBoard2(list.tail,'8')
      }
      case 'A' ⇒list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'6')
        case 'D' ⇒keyBoard2(list.tail,'A')
        case 'R' ⇒keyBoard2(list.tail,'B')
        case 'L' ⇒keyBoard2(list.tail,'A')
      }
      case 'B' ⇒list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'7')
        case 'D' ⇒keyBoard2(list.tail,'D')
        case 'R' ⇒keyBoard2(list.tail,'C')
        case 'L' ⇒keyBoard2(list.tail,'A')
      }
      case 'C' ⇒ list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'8')
        case 'D' ⇒keyBoard2(list.tail,'C')
        case 'R' ⇒keyBoard2(list.tail,'C')
        case 'L' ⇒keyBoard2(list.tail,'B')
      }
      case 'D' ⇒ list.head match{
        case 'U' ⇒ keyBoard2(list.tail,'B')
        case 'D' ⇒keyBoard2(list.tail,'D')
        case 'R' ⇒keyBoard2(list.tail,'D')
        case 'L' ⇒keyBoard2(list.tail,'D')
      }
    }
  }
}


def getCode(steps: List[String], recurs: (List[Char], Char) ⇒ Char, lastNum: Char='5', acc:String = ""): String = {
  if(steps.isEmpty) acc
  else {
    val res = recurs(steps.head.toList,lastNum)
    getCode(steps.tail,recurs,res,acc + res)
  }
}


getCode(strings,keyBoard1)
getCode(strings,keyBoard2)

