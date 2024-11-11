# Challenge Java - "Trump Detector" : Mesurez la variété de votre vocabulaire

## Dates : du 10/11/24 au 17/11/24

## Difficulté : **Facile**  

## Technologies : **Java 17+ (ou Kotlin)**  

![Trump](./_images/trump.jpg "Trump")

### Description  
Ce challenge vous propose de créer un programme qui analyse la **variété du vocabulaire** dans un texte donné et attribue un score de 1 à 10, en fonction de la richesse lexicale. Pour le fun, nous l'avons nommé le **"Trump Detector"**, en référence à l'actualité récente qui a vu Donald Trump fraîchement réélu, un personnage qui, que l'on aime ou non (ce n'est pas le lieu pour faire de la politique 😄) est souvent critiqué pour son vocabulaire itentionnellement limité.

### Objectif  
Votre programme devra :
1. **Lire un fichier texte** fourni par l'utilisateur ou une chaîne de caractères à analyser.
2. **Analyser la diversité lexicale** du texte, c'est-à-dire le nombre de mots distincts utilisés par rapport au nombre total de mots.
3. **Attribuer un score de 1 à 10** :  
   - **1** représentant un vocabulaire très limité, avec beaucoup de répétitions,
   - **10** représentant un vocabulaire très riche et varié.
4. **Afficher un diagnostic humoristique** basé sur le score obtenu. Par exemple :  
   - _"Score : 2/10 – Ouch ! Votre vocabulaire est aussi pauvre qu'un tweet de Donald Trump !"_
   - _"Score : 9/10 – Impressionnant ! Vous avez une variété de vocabulaire digne d'un grand orateur."_

### Calcul de la variété  
Le score sera calculé en fonction du **taux de diversité lexicale**, c'est-à-dire le ratio entre le nombre de mots **distincts** et le nombre **total de mots** dans le texte :
- Un texte avec beaucoup de répétitions obtiendra un score bas (proche de 1).
- Un texte avec un vocabulaire riche et peu de répétitions obtiendra un score élevé (proche de 10).

### Détails supplémentaires  
1. **Suppression des mots courants et de la ponctuation** :  
   - Vous pouvez ignorer les **stop words** (mots très fréquents comme "le", "la", "et") pour ne pas fausser l'analyse. Cela vous forcera à manipuler des fichiers ou des listes de mots à exclure.
   - La ponctuation doit être éliminée pour ne pas être prise en compte dans le calcul de la diversité.
2. **Gestion de la casse** : Le programme doit ignorer la casse des lettres (par exemple, "Java" et "java" seront considérés comme le même mot).
3. **Bonus** : En bonus, vous pouvez intégrer une fonctionnalité qui compare le texte analysé à des discours célèbres de Donald Trump pour voir si le score est similaire ! Cela pourrait rendre le challenge encore plus amusant 😄

## Récompenses
- Vainqueur : 5 pts
- 2ème : 3 pts
- 3ème : 1 pts

Rappel: Les participants accumulent des points en fonction de leur performance dans les challenges. Ces points peuvent être convertis en cartes cadeaux Prezzy, utilisables pour des achats en ligne ou en magasin dans n'importe quelle devise.

💬 **N'oubliez pas** de poser vos questions sur le serveur Discord pour toute clarification ou aide sur ce challenge. Bonne chance à tous et amusez-vous bien ! 🎉
