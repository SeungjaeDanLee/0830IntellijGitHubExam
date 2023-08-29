package com.busanit.controller;

import com.busanit.domain.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/ex01")
    public String memberEx01(Model model){
        List<MemberDTO> memberList = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            MemberDTO memberDto = new MemberDTO();
            memberDto.setUserId("test" + i);
            memberDto.setUserPw("ascd" + i);
            memberDto.setUserName("테스터" + i);
            memberDto.setUserEmail("aaa" + i + "@bbb.com");
            memberDto.setUserRegDate(LocalDateTime.now());

            memberList.add(memberDto);
        }

        model.addAttribute("memberDtoList", memberList);
        return "memberEx/memberEx01";
    }

}
