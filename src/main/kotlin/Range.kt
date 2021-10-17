fun main(){
    // membuat range
    // range 1-100
    // biasanya untuk sequence / looping
    var range = 1..100
    // step 2 = i+2 di for
    var range2 = 1..100 step 2
    println(range2.last)
    println(range2.step)
    // downto 2 = i-2
    var range3 = 1000 downTo 0 step 2
    println(range3.step)
    println(range3.last)
}