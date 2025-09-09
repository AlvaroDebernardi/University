package flock;

public interface Flock {

    public void attach(Member member);
    public void detach(Member member);
    public void notifyMembers();
}
