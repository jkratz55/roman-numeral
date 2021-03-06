package io.jkratz.katas.romannumeral

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class RomanNumeralTest {

    @Test
    @DisplayName("Test Roman Numeral I")
    fun testNumeralI() {
        val numeral = RomanNumeral("I")
        Assertions.assertEquals(1, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral II")
    fun testNumeralII() {
        val numeral = RomanNumeral("II")
        Assertions.assertEquals(2, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral III")
    fun testNumeralIII() {
        val numeral = RomanNumeral("III")
        Assertions.assertEquals(3, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral IV")
    fun testNumeralIV() {
        val numeral = RomanNumeral("IV")
        Assertions.assertEquals(4, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral V")
    fun testNumeralV() {
        val numeral = RomanNumeral("V")
        Assertions.assertEquals(5, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral VIII")
    fun testNumeralVIII() {
        val numeral = RomanNumeral("VIII")
        Assertions.assertEquals(8, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral IX")
    fun testNumeralIX() {
        val numeral = RomanNumeral("IX")
        Assertions.assertEquals(9, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral X")
    fun testNumeralX() {
        val numeral = RomanNumeral("X")
        Assertions.assertEquals(10, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral XII")
    fun testNumeralXII() {
        val numeral = RomanNumeral("XII")
        Assertions.assertEquals(12, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral L")
    fun testNumeralL() {
        val numeral = RomanNumeral("L")
        Assertions.assertEquals(50, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral C")
    fun testNumeralC() {
        val numeral = RomanNumeral("C")
        Assertions.assertEquals(100, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral D")
    fun testNumeralD() {
        val numeral = RomanNumeral("D")
        Assertions.assertEquals(500, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral M")
    fun testNumeralM() {
        val numeral = RomanNumeral("M")
        Assertions.assertEquals(1000, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Numeral MMXIII")
    fun test2013AsNumerals() {
        val numeral = RomanNumeral("MMXIII")
        Assertions.assertEquals(2013, numeral.value)
    }

    @Test
    @DisplayName("Test Roman Symbol LIV")
    fun testNumeralLIV() {
        val numeral = RomanNumeral("LIV")
        Assertions.assertEquals(54, numeral.value)
    }

    @Test
    @DisplayName("Test Equals Should Be True")
    fun testEquals_shouldBeEqual() {
        val numeral1 = RomanNumeral("III")
        val numeral2 = RomanNumeral("III")
        Assertions.assertTrue(numeral1 == numeral2)
    }

    @Test
    @DisplayName("Test Equals Should Be False")
    fun testEquals_shouldNotBeEqual() {
        val numeral1 = RomanNumeral("III")
        val numeral2 = RomanNumeral("IV")
        Assertions.assertFalse(numeral1 == numeral2)
    }

    @Test
    @DisplayName("Test Hash")
    fun testHashCode() {
        val numerals = mapOf(
            RomanNumeral("III") to 3,
            RomanNumeral("IV") to 4
        )
        Assertions.assertTrue(numerals.size == 2)
    }

    @Test
    @DisplayName("Test ToString")
    fun testToString() {
        val numeral = RomanNumeral("LIV")
        Assertions.assertEquals("LIV", numeral.toString())
    }
}

class SymbolTest {

    @Test
    @DisplayName("Test Invalid Roman Numeral Symbol A")
    fun testExistsWithInvalidSymbol() {
        Assertions.assertEquals(false, Symbol.exists("A"))
    }

    @Test
    @DisplayName("Test Valid Roman Numeral Symbol M")
    fun testExistsWithM() {
        Assertions.assertEquals(true, Symbol.exists("M"))
    }
}