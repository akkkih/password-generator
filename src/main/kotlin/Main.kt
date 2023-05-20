fun main() {
    println("--- PGKT ---")
    println("Welcome to the Password Generator Kotlin (PGKT).")
    
    print("How long should your password be? ")
    val length = readln().toIntOrNull() ?: 1
    
    val password = generateRandomPassword(length)
    println("Your password is $password. Enjoy!")
    println("------------")
}

private fun generateRandomPassword(length: Int): String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9') + listOf('!', '@', '#', '$', '%', '^', '&', '*')
    return (1..length + 1)
        .map { allowedChars.random() }
        .joinToString("")
}