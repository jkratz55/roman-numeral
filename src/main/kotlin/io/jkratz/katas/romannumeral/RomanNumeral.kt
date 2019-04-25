package io.jkratz.katas.romannumeral

class RomanNumeral(numeral: String) {

    val numeral = numeral.toUpperCase()

    val value: Int by lazy {
        extractSymbols().sumBy { it.value }
    }

    private fun extractSymbols(): List<Symbol> {
        val chars = numeral.toMutableList()
        val symbols = ArrayList<Symbol>()
        while (chars.isNotEmpty()) {
            val s1 = chars[0]
            if (chars.size > 1) {
                val s2 = chars[1]
                if (Symbol.exists("$s1$s2")) {
                    symbols.add(Symbol.valueOf("$s1$s2"))
                    chars.removeAt(1)
                    chars.removeAt(0)
                } else {
                    symbols.add(Symbol.valueOf("$s1"))
                    chars.removeAt(0)
                }
            } else {
                symbols.add(Symbol.valueOf("$s1"))
                chars.removeAt(0)
            }
        }
        return symbols
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RomanNumeral

        if (numeral != other.numeral) return false

        return true
    }

    override fun hashCode(): Int {
        return numeral.hashCode()
    }

    override fun toString(): String {
        return numeral
    }
}

enum class Symbol(val value: Int) {
    I(1),
    IV(4),
    V(5),
    IX(9),
    X(10),
    XL(40),
    L(50),
    XC(90),
    C(100),
    CD(400),
    D(500),
    CM(900),
    M(1000);

    companion object {

        fun exists(name: String): Boolean {
            return values()
                .asSequence()
                .filter { it.name == name }
                .firstOrNull()?.let { true } ?: false

        }
    }
}