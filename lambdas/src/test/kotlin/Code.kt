import org.junit.Test

class Code {

    fun show(x: String, fn: (String) -> Unit) {

    }

    @Test
    fun lambdas() {

        show("hello", { s: String -> println(s) })
        show("hello") { s: String -> println(s) }

        show("hello") { s -> println(s) }
        show("hello") { println(it) }
    }

}