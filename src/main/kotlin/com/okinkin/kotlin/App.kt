/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.okinkin.kotlin


    class User(val name: String, val age: Int) {
        override fun toString(): String {
            return "User(name=$name, age=$age"
        }
    }

    data class  DataUser(val name: String, val agee: Int){
        fun intro(){
            println("Perkenalkan nama saya $name")
        }
    }

fun main(args: Array<String>) {
    val user = User ("Okin", 20)
    val dataUser = DataUser ("Okin", 20)

    println(user)
    println(dataUser)

    val ( name, age ) = dataUser
    println("perkenalkan nama saya $name")

    dataUser.intro()

}
