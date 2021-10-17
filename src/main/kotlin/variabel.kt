// contoh pengunaan const tetap harus memanggil val karena immutable
// Pengunaan const harus menjadi variabel global
const val APP_NAME = "coba"

fun main(){
    var age:Int = 100000
    var ageLong:Long = 100000000
    var test:String = "test"
    // untuk set float harus ditambahi F dibelakangnya
    var float:Float = 90.9F
    println(float)

    // ditambahi "0x"
    var hexadecimal:Int = 0xFF
    // ditambahi "0b"
    var binaryLiteral:Int = 0b0001


    // bisa ditambahi _ sebagai separator
    var ageTest:Byte = 3_0
    var price:Int = 3_000_000

    var num:Int = 10000
    // Contoh konversi dari int to string
    var string:String = num.toString()

    //Disarankan menggunakan immutable daripada mutable
    var nama = "Angga"

    nama = "test"

    val tempat = "warkop"
    // dibawah gagal diassign karena immutable(tidak dapat diubah)
//    tempat = "warung"

    //membuat variabel nullable
    var coba:String? = null

    //Mengakses variabel nullable yang salah
//    println(coba.length)
    // mengakses variabel nullable yang benar
//    println(coba?.length)
    // Menampilkan const
    println("Nama Aplikasi : $APP_NAME")
}