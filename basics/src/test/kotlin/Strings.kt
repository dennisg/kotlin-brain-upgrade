import org.junit.Test


class Strings {

    @Test
    fun string_template() {
        var a = 1

        // simple name in template:
        val s1 = "a is $a"
        println(s1)

        a = 2

        // arbitrary expression in template:
        val s2 = "${s1.replace("is", "was")}, but now is $a"
        println(s2)
    }

    @Test
    fun string_literals() {
        val text = """
    for (c in "foo") {
        print(c)
    }
"""
        println(text)

    }
}