class myClass(private var _hp: Double, private var xp: Double, val maxHp: Double = 1.0) {
    fun Death() {
        _hp = 0.05 * maxHp
        xp /= 2
    }

    override fun toString(): String {
        return "HP: $hp"
    }

    val hp: Double
        get() = _hp
}

fun main(args: Array<String>) {
    val person = myClass(1.0, 10.0)
    println(person)
    person.Death()
    println(person)
}

