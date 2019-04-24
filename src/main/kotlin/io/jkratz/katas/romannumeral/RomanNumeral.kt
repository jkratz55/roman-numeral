package io.jkratz.katas.romannumeral

class RomanNumeral(numeral: String) {

    val numeral = numeral.toUpperCase()

    val value: Int by lazy {
        var result = 0
        for (i in 0 until numeral.length) {
            var v1 = Numeral.valueOf(numeral[i].toString()).value
            result += Numeral.valueOf(numeral[i].toString()).value
        }
        result
    }

    override fun toString(): String {
        return numeral
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
}

enum class Numeral(val value: Int) {
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
        val reverseSorted = values().sortedArrayDescending()
    }
}