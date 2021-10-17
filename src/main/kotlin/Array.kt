fun main(){
    var names:Array<String> = arrayOf("Angga","Wijaya","Test")

    println(names)
    // mengakses salah satu array
    println(names[0])
    // cara lain mengakses array
    println(names.get(0))
    // mengambil panjang array
    println(names.size)
    // mengubah value array
    names[0] = "juna"
    println(names.get(0))
    // cara lain mengubah array
    names.set(0,"suep")
    println(names[0])

    // membuat array yang boleh null
    val cobaNames: Array<String?> = arrayOfNulls(5)
    cobaNames.set(0,"test")
    cobaNames.set(1,null)
    cobaNames.set(2,"angga")
    cobaNames.set(3,"wijaya")
    cobaNames.set(4,null)
    
}