fun main(){
    var angka = 90
    if (angka >= 100){
        println("Yes")
    } else if (angka >= 90){
        println("Interesting")
    } else {
        println("No")
    }

    var mark: String = "A"

    when (mark){
        "A" -> println("Cumlaude")
        "B" -> println("Great")
        "C" -> println("Average")
        "D" -> println("Poor")
        "E" -> println("Bad")
    }

    var mark2: String = "A"

    when (mark2){
        // Multiple mark
        "A,B,C" -> println("Good")
        "D" -> println("Poor")
        "E" -> println("Bad")
    }
}