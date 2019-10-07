package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    TODO()
}


/*
    Ad-hoc solution for case of secret with distinct letters
 */
/*fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPosition = 0
    var wrongPosition = 0

    // check if secret and guess have some common letters
    val secretLetters = secret.toSet()
    val guessLetters = guess.toSet()
    val commonLetters = secretLetters intersect guessLetters
    val numberCommonLetters = commonLetters.size

    // check if the same letters are in the same positions
    for ((guessIndex, guessLetter) in guessLetters.withIndex()) {
        val indexedSecretLetters = secretLetters.withIndex()
        if (indexedSecretLetters.elementAt(guessIndex).value == guessLetter) {
            rightPosition += 1
        }
    }
    wrongPosition = numberCommonLetters - rightPosition

    return Evaluation(rightPosition, wrongPosition)
}*/
