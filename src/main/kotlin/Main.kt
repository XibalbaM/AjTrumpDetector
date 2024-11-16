package fr.xibalba.aj.trumpDetector

import java.io.File
import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.text.Regex

val commonWords = File("src/main/resources/common-words.txt").readText().lines()

fun main() {
    println("Mode : 1 - Texte, 2 - Fichier")
    val mode = readln().toInt()
    while (true) {
        if (mode == 1) {
            println("Entrez le texte à analyser :")
            val text = readln()
            val (score, wordFrequency) = analyseText(text)
            println(scoreToText(score))
            println("Mots les plus fréquents :")
            wordFrequency.toList().sortedByDescending { it.second }.take(10).forEach { println("${it.first} : ${it.second*100}%") }
        } else if (mode == 2) {
            println("Entrez le chemin du fichier contenant le texte à analyser :")
            val path = readln()
            val text = File(path).readText()
            val (score, wordFrequency) = analyseText(text)
            println(scoreToText(score))
            println("Mots les plus fréquents :")
            wordFrequency.toList().sortedByDescending { it.second }.take(10).forEach { println("${it.first} : ${it.second*100}%") }
        }
    }
}

fun analyseText(text: String) : Pair<Double, Map<String, Double>> {
    val words = text.lowercase().words().filterNot { it in commonWords }
    val uniqueWords = words.distinct()
    val wordCount = words.groupingBy { it }.eachCount()
    val wordFrequency = wordCount.mapValues { it.value.toDouble() / words.size }
    return Pair(sqrt(uniqueWords.size / words.size.toDouble()), wordFrequency)
}

fun scoreToText(score: Double) : String {
    val roundedScore = (score * 10).roundToInt()
    return when (roundedScore) {
        0 -> "Score : 0/10 – Sérieusement ? On dirait que vous n’avez utilisé qu’un seul mot. Vous êtes en mode robot ou quoi ?"
        1 -> "Score : 1/10 – Bravo, vous avez inventé le concept du copier-coller littéraire !"
        2 -> "Score : 2/10 – Ouch ! Votre vocabulaire est aussi pauvre qu'un tweet de Donald Trump !"
        3 -> "Score : 3/10 – Hum... Vous pourriez varier un peu plus. Vos phrases sont aussi originales qu’une playlist en boucle."
        4 -> "Score : 4/10 – Pas mal, mais on dirait que vous avez une liste limitée de mots favoris. Essayez d'élargir vos horizons lexicaux !"
        5 -> "Score : 5/10 – Moyen ! Vous êtes sur la bonne voie, mais il reste du travail pour atteindre le panthéon des grands écrivains."
        6 -> "Score : 6/10 – Correct ! Votre vocabulaire commence à s’étoffer, mais vous pouvez encore enrichir vos phrases."
        7 -> "Score : 7/10 – Bien joué ! Vous avez une belle variété de mots, on dirait un discours bien rédigé."
        8 -> "Score : 8/10 – Impressionnant ! Vous maîtrisez bien les subtilités de la langue. Vos textes respirent l’intelligence."
        9 -> "Score : 9/10 – Excellent ! Votre vocabulaire est aussi riche qu’un dictionnaire. Respect !"
        10 -> "Score : 10/10 – Époustouflant ! Vous êtes un véritable Shakespeare moderne. On s’incline devant tant d’éloquence !"
        else -> throw IllegalArgumentException("Score invalide")
    } + " (Score : $score)"
}

fun String.words() = Regex("[A-zÀ-ù0-9]+").findAll(this).map { it.value }.toList()