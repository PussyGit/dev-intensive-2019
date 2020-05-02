package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

data class User (
    val id : String,
    var firstName : String? = null,
    var lastName : String? = null,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false
) {


    //    var introBit: String
    constructor(id: String, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    constructor(id: String) : this(id, "John", "Doe")

    init {

//        introBit = getIntro()
 //       println("Zaebis! ${if(lastName==="Doe") "User name is $firstName $lastName" else "He is not Doe, he is $firstName $lastName"}\n")
        println("Zaebis! ${if(lastName==="Doe") "User name is Doe" else "And user name is $firstName $lastName"}")

        //        "${getIntro()}!!!")
    }
/*
    private fun getIntro()="""
        jskdfhksjdhf awdsad
        jskdfhksjdhf awdsad
        ${"\n"}
        $firstName $lastName
    """.trimIndent()

    fun printMe(): Unit {
        println(
            """
            id : $id
            firstName : $firstName
            lastName : $lastName
            avatar : $avatar
            rating : $rating
            respect : $respect
            lastVisit : $lastVisit
            isOnline : $isOnline
        """.trimIndent()
        )
    }
*/
        companion object Factory {
        private var lastId : Int = -1
            fun makeUser(fullName:String?):User{
                lastId++

            val (firstName, lastName) = Utils.parseFullName(fullName)
            return User(id = "$lastId", firstName = firstName, lastName = lastName)
        }
    }
}