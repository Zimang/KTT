package top.zimang.HOFs

import java.math.BigDecimal

fun main() {
//    println(fib(5965))
//    println(fib(6000))
    fun format(name:String,i:Int,f:(Int)->BigDecimal):String ="$name 的结果是 ${f(i)}"
    println(format("斐波那契", 20, ::fib))
    println(format("阶乘", 20, ::factorial))
}
fun fib(i:Int):BigDecimal {
    tailrec fun go(pp: BigDecimal,p:BigDecimal,stop:Int):BigDecimal{
//    fun go(pp: BigDecimal,p:BigDecimal,stop:Int):BigDecimal{
        if (stop == 1) return pp
//        println(" pp:$pp p:$p  stop:$stop")
        return go(p,pp+p,stop-1)
    }
    return go(BigDecimal.ZERO,BigDecimal.ONE,i)
}

fun factorial(i:Int):BigDecimal{
    fun go(i:Int,acc:BigDecimal):BigDecimal{
        if (i==1){
            return acc
        }
        return go(i-1,acc*BigDecimal.valueOf(i.toLong()))
    }
    return go(i,BigDecimal.ONE)
}

