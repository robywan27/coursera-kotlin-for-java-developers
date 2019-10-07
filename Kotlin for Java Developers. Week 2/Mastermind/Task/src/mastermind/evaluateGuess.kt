package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    val numberCommonLetters = getNumberOfCommonLetters(secret, guess)
    var rightPosition = getNumberOfSameLettersInSamePosition(secret, guess)
    val wrongPosition = numberCommonLetters - rightPosition
    return Evaluation(rightPosition, wrongPosition)
}

fun getNumberOfCommonLetters(secret: String, guess: String): Int {
    var numberCommonLetters = 0
    var secretCopy = secret
    for (guessLetter in guess) {
        for ((secretIndex, secretLetter) in secretCopy.withIndex()) {
            if (guessLetter == secretLetter) {
                numberCommonLetters += 1
                secretCopy = secretCopy.substring(0, secretIndex) +
                        if (secretIndex < secretCopy.length)
                            secretCopy.substring((secretIndex + 1), secretCopy.length)
                        else
                            ""
                break
            }
        }
    }
    return numberCommonLetters
}

fun getNumberOfSameLettersInSamePosition(secret: String, guess: String): Int {
    var rightPosition = 0
    for ((guessIndex, guessLetter) in guess.withIndex()) {
        val indexedSecretLetters = secret.withIndex()
        if (indexedSecretLetters.elementAt(guessIndex).value == guessLetter) {
            rightPosition += 1
        }
    }
    return rightPosition
}

// Alternative strategy to check for common letters if secret has distinct letters
fun getNumberOfCommonLettersIfDifferentLetters(secret: String, guess: String): Int {
    val secretLetters = secret.toSet()
    val guessLetters = guess.toSet()
    val commonLetters = secretLetters intersect guessLetters
    return commonLetters.size
}
