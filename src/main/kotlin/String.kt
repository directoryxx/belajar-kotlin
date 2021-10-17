fun main(){
    var firstName:String = "Angga"
    var lastName:String = "Wijaya"
    var fullName:String = "Angga Wijaya"
    // Jika ingin membuat variabel lebih dari satu baris
    // trimindent supaya tulisan mentok ke kiri semua
    var fullDetail:String = """
        Jalan: Belum dibuat
        Kota: Sidoarjo
        Provinsi Jawa Timur
        Negara: Indonesia
    """.trimIndent()
    // trim memojokkan kata dengan mencari "|" sebagai default
    var fullDetail2:String = """
        |Jalan: Belum dibuat
        |Kota: Sidoarjo
        |Provinsi Jawa Timur
        |Negara: Indonesia
    """.trimMargin()
    // trim memojokkan kata dengan mencari ">" (custom)
    var fullDetail3:String = """
        >Jalan: Belum dibuat
        >Kota: Sidoarjo
        >Provinsi Jawa Timur
        >Negara: Indonesia
    """.trimMargin(">")
    println(fullDetail3)
    // concatenate string
    var concat: String = firstName + " " +lastName
    println(concat)
    // String Template
    var fullNameTemplate:String = "$firstName $lastName. Panjang string: ${firstName.length + lastName.length}"
    println(fullNameTemplate)
}