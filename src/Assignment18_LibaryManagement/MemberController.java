package Assignment18_LibaryManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

    private MemberService memberService;
    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public Member createMember(@RequestBody Member member) throws InvalidCardException {
        return this.memberService.registerMember(member);
    }

    @GetMapping("/{id}")
    public Member getMember(@PathVariable Integer id) throws MemberNotFoundException {
        return this.memberService.findMemberAndMembershipCardById(id);
    }


}