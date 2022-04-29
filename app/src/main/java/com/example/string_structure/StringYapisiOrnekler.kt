package com.example.string_structure

fun main(){

    val str1= "Merhaba"
    println(str1)

    var str2 = String()
    str2 = "Kotlin"
    println(str2)

    val str3 = """
        MERHABALAR
        EFENDİM
    """.trimIndent()

    println(str3)

    val str4 = ""
    val str5 = String()
    println("******************")

    if (str4.isEmpty()){
        println("str4 boş")
    }else{
        println("str4 dolu")
    }

    val varA = 10
    val varB = 20
    println("$varA x $varB = ${varA*varB}")

    val str6 = "Merhaba"
    val str7 = " Dünya"
    println(str6+str7)

}