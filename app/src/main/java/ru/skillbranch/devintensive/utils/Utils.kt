package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return (when {firstName.isNullOrBlank() -> null else -> firstName}) to
                when {lastName.isNullOrBlank() -> null else -> lastName}
        }
}