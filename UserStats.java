import java.util.Optional;

public class UserStats {

    Long visitCount;
    public UserStats(Long visitCount) {
        this.visitCount = visitCount;
    }

    public void setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
    }

    public Optional<Long> getVisitCount() {
        if (visitCount == null) return Optional.empty();
        return Optional.of(visitCount);
    }
}
