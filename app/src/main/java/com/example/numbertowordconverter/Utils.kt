package com.example.numbertowordconverter

object Utils {

    val UNITS = mapOf<String, String>(
        "0" to "",
        "1" to "ერთი",
        "2" to "ორი",
        "3" to "სამი",
        "4" to "ოთხი",
        "5" to "ხუთი",
        "6" to "ექვსი",
        "7" to "შვიდი",
        "8" to "რვა",
        "9" to "ცხრა",
    )

    val DOZENS = mapOf<String, String>(
        "0" to "",
        "1" to "ათი",
        "2" to "ოც",
        "3" to "ოცდა",
        "4" to "ორმოც",
        "5" to "ორმოცდა",
        "6" to "სამოც",
        "7" to "სამოცდა",
        "8" to "ოთხმოც",
        "9" to "ოთხმოცდა",
    )

    val HUNDREDS = mapOf<String, String>(
        "0" to "",
        "1" to "ას",
        "2" to "ორას",
        "3" to "სამას",
        "4" to "ოთხას",
        "5" to "ხუთას",
        "6" to "ექვსას",
        "7" to "შვიდას",
        "8" to "რვაას",
        "9" to "ცხრაას",
    )

    val STATIC = mapOf<String, String>(
        "0" to "",
        "1" to "თერთმეტი",
        "2" to "თორმეტი",
        "3" to "ცამეტი",
        "4" to "თოთხმეტი",
        "5" to "თხუთმეტი",
        "6" to "თექვსმეტი",
        "7" to "ჩვიდმეტი",
        "8" to "თვრამეტი",
        "9" to "ცხრამეტი",
    )
}