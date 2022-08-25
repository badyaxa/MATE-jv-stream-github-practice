package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {
    private static final int MINIMUM_AGE = 35;
    private static final String NATIONALITY = "Ukrainian";
    private static final int YEARS_IN_UKR = 10;

    @Override
    public boolean test(Candidate candidate) {
        return candidate.getAge() >= MINIMUM_AGE
                && candidate.getNationality().equals(NATIONALITY)
                && Integer.parseInt(candidate.getPeriodsInUkr().split("-")[1])
                - Integer.parseInt(candidate.getPeriodsInUkr().split("-")[0]) >= YEARS_IN_UKR
                && candidate.isAllowedToVote();
    }
}
