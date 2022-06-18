package com.example.numbertowordconverter

class Converter {

    private fun endsWithZero(number: Int): Boolean {
        val convertedToString = number.toString()
        return convertedToString[convertedToString.length - 1].toString() == "0"
    }


    fun singleDigitToWord(digit: Int): String? {
        return Utils.UNITS[digit.toString()]
    }


    fun twoDigitsToWord(number: Int): String {
        val convertedToString = number.toString()
        if (arrayOf("2", "4", "6", "8").contains(convertedToString[0].toString())) {
            return if (endsWithZero(number)) {
                "${Utils.DOZENS[convertedToString[0].toString()]}ი"
            } else {
                "${Utils.DOZENS[convertedToString[0].toString()]}და" +
                        "${Utils.UNITS[convertedToString[1].toString()]}"
            }
        } else {
            return if (!endsWithZero(number)) {
                if (convertedToString[0].toString() == "1") {
                    "${Utils.STATIC[convertedToString[1].toString()]}"
                } else {
                    "${Utils.DOZENS[convertedToString[0].toString()]}" +
                            "${Utils.STATIC[convertedToString[1].toString()]}"
                }
            } else {
                "${Utils.DOZENS[convertedToString[0].toString()]}ათი"
            }
        }
    }


    fun threeDigitsToWord(number: Int): String {
        val convertedToString = number.toString()
        return if (convertedToString[1].toString() == "0" && convertedToString[2].toString() == "0") {
            "${Utils.HUNDREDS[convertedToString[0].toString()]}ი"
        } else if (convertedToString[1].toString() == "0" && convertedToString[2].toString() != "0") {
            "${Utils.HUNDREDS[convertedToString[0].toString()]}" +
                    "${Utils.UNITS[convertedToString[2].toString()]}"
        } else {
            "${Utils.HUNDREDS[convertedToString[0].toString()]}" +
                    twoDigitsToWord(convertedToString.substring(1).toInt())
        }
    }
}