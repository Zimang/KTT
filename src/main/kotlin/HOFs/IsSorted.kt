package top.zimang.HOFs


fun main() {
    val li= listOf(1,2,3,4,5,6)
//    println(li.tail)
    println(isSorted(li,{a,b->if (a<b) {true}else{false} }))
}

val <A> List<A>.tail:List<A>
    get() = drop(1)

fun <A> isSorted(list: List<A>,f:(A,A)-> Boolean):Boolean{
    if (list.isEmpty()) return false
    val ig = list.listIterator()
    var a=ig.next()
    var b=ig.next()
    if (b==null) return true
    while (ig.hasNext()){
        if (!f(a,b)){
            return false
        }
        a=b
        b=ig.next()
//        println("a:$a, b:$b")
    }
    return true
}