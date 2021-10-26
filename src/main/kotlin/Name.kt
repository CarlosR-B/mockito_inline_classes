@JvmInline
value class Name(
    val my: String
)

open class ClassToBeMocked {
    fun methodToBeMocked(name: Name): String {
        return "I am an $name"
    }
}
