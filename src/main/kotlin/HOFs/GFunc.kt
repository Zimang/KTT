package top.zimang.HOFs

fun main() {
    fun meow(i:Int,s:Float):String="i:$i s:$s meow"
    fun gg(i:Int) = curry(meow())
    println()
}

fun <A,B,C> curry(f:(A,B)->C):(A)->()->C={a: A-> { b: B -> f(a,b) }  }