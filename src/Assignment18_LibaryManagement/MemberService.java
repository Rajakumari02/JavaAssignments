package Assignment18_LibaryManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class MemberService {
    private MemberRepo memberRepo;
    private MembershipCardRepo membershipCardRepo;

    @Autowired
    public MemberService(MemberRepo memberRepo, MembershipCardRepo membershipCardRepo) {
        this.memberRepo = memberRepo;
        this.membershipCardRepo = membershipCardRepo;
    }

    public Member registerMember(Member member) throws InvalidCardException {

        if (member.getMembershipCard() == null) {
            throw new InvalidCardException("Member should have Membership Card");
        }
        if (member.getMembershipCard().getExpiryDate().isBefore(LocalDate.now())) {
            throw new InvalidCardException("Membership card Expired");
        }
        return memberRepo.save(member);
    }

    public Member findMemberAndMembershipCardById(Integer id) throws MemberNotFoundException {
        Member foundMember = memberRepo.findById(id).orElseThrow(()-> new MemberNotFoundException("Member not found"));
        return foundMember;
    }

}