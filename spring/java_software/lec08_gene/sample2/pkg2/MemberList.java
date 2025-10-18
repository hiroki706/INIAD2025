package sample2.pkg2;
import java.util.Map;
import java.util.HashMap;
import sample2.pkg1.Member;

public class MemberList {
    private Map<String, Member> members;
    public MemberList() {
        this.members = new HashMap<String, Member>();
    }

    public void add(Member member) {
        this.members.put(member.getId(), member);
    }

    public Member get(String id) {
        return this.members.get(id);
    }

    public void remove(String id) {
        this.members.remove(id);
    }

    public int count() {
        return this.members.size();
    }
}
