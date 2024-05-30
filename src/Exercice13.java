import java.util.Scanner;

/* Les élections législatives obéissent à la règle suivante:
* Lorsque l'un des premiers candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.
* En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5%, au premier tour
* Vous devez écrire un algorithme qui permette la saisie des scores de quatre candidats au premier tour. Cet algorithme traitera ensuite le candidat numéro 1
* ( uniquement lui ) et il dira s'il est élu, battu, s'il se trouve en ballottage favorable
* ( il participe au second tour en étant arrivé en tête à l'issu du premier tour)
* ou défavorable ( il participe au second tour sans avoir été en tête au premier tour). */

public class Exercice13 {

    static Scanner sc = new Scanner(System.in);
    static float candidateOne;
    static float candidateTwo;
    static float candidateThree;
    static float candidateFour;
    static float scoreCandidateOne;
    static float totalScore;

    public static void main(String[] args) {


        candidateOne = enterCandidateScore("One");
        candidateTwo = enterCandidateScore("Two");
        candidateThree = enterCandidateScore("Three");
        candidateFour = enterCandidateScore("Four");

        totalScore = (candidateOne + candidateTwo + candidateThree + candidateFour);

        scoreCandidateOne = candidateOne * 100 / totalScore;

        String result = resultForCandidateOne(scoreCandidateOne);

        System.out.println(result);

        /*if (scoreCandidateOne >= 50)
            System.out.println("The candidate 1 score is elected on the first ballot ");
        else if (scoreCandidateOne >= 12.5)
            System.out.println("The candidate 1 can participate in the second round by being disadvantage");
        else
            System.out.println("Eliminated");*/
    }

    private static String resultForCandidateOne(float scoreCandidateOne) {
        if (scoreCandidateOne >= 50)
            return "The candidate 1 score is elected on the first ballot";
        else if (scoreCandidateOne >= 12.5)
            return "The candidate 1 can participate in the second round by being disadvantage";
        else
            return  "Eliminated";
    }

    private static float enterCandidateScore(String name) {
        System.out.println("Quel est le score du candidat " + name + " ? ");
        return sc.nextFloat();
    }
}
