import org.junit.Test

class Empty

class Simple1(val name: String)

class Simple2 constructor(val name: String)

class Simple3 constructor(val name: String = "Kotlin")

class Simple4 constructor(name: String) {
    private val realName = name

    constructor(name: String, surName: String) : this("$name $surName")
}

class Simple5 constructor(name: String) {
    private val realName: String

    init {
        realName = name
    }
}

class Code {


    @Test
    fun examples() {

        val empty = Empty()

        val s1 = Simple1("Test")
        val s2 = Simple2("Test")

        val s3a = Simple3("Test")
        val s3b = Simple3()

        val s4a = Simple4("Rick Astley")
        val s4b = Simple4("Rick", "Astley")

        //more examples: https://goo.gl/fW9nSp
    }



}


