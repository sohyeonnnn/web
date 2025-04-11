package com.refactoring.ilgusi.presentation.home;

import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.presentation.home.dto.CategorySlide;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class HomeController {

    // private final HttpSession httpsession;

    @GetMapping("/")
    public String index(Model model, Member user){
        if(user!= null){
            model.addAttribute("userName", user.getName());
        }


        /*loginMember	Member 객체	로그인한 사용자의 정보
        isAdmin	boolean	로그인한 사용자가 "admin" 아이디인지 여부
        isNormalUser	boolean	일반 사용자 여부 (MGrade != 0 인 경우)*/

        Map loginMember = null;//new HashMap<>();
       /* loginMember.put("MId", "id1");
        loginMember.put("MName", "홍길동");
        loginMember.put("MGrade", "0");
        loginMember.put("isLoginMember", false);
        loginMember.put("isAdmin", false);
        loginMember.put("isUser", true);*/



        if (loginMember != null) {
            model.addAttribute("loginMember", loginMember);

            // 관리자 여부 확인
            boolean isAdmin = "admin".equals(loginMember.get("MId").toString());
            model.addAttribute("isAdmin", isAdmin);

            // 일반 회원 여부 (관리자가 아닌 경우)
            boolean isNormalUser = true;
            model.addAttribute("isNormalUser", isNormalUser);
        }

        if (true) { //loginMember.getMGrade() != 0
            model.addAttribute("mypageUrl", "/userMypage.do");
            model.addAttribute("mypageLabel", "마이페이지");
        } else {
            model.addAttribute("mypageUrl", "/manageMember.do?reqPage=1&grade=all&keyword=&order=new");
            model.addAttribute("mypageLabel", "관리페이지");
        }


        // 배너 이미지 (로그인 여부와 무관하게 동일하게 사용 가능)
        List<String> bannerImages = new ArrayList<>();
        bannerImages.add("/img/index/banner/banner1.png");
        bannerImages.add("/img/index/banner/banner2.png");
        bannerImages.add("/img/index/banner/banner3.png");

        model.addAttribute("bannerImages", bannerImages);

        // 카테고리 슬라이더 데이터
        Map<String, List> sliders = new HashMap();

        List<CategorySlide> designSlides = new ArrayList<>();
        designSlides.add(new CategorySlide("로고·브랜딩", 11, "/img/index/carousel/category-11.png"));
        designSlides.add(new CategorySlide("캘리그라피·폰트", 13, "/img/index/carousel/category-13.png"));

        List<CategorySlide> itSlides = new ArrayList<>();
        itSlides.add(new CategorySlide("워드프레스", 21, "/img/index/carousel/category-21.png"));
        itSlides.add(new CategorySlide("웹사이트개발", 22, "/img/index/carousel/category-22.png"));

        List<CategorySlide> consultingSlides = new ArrayList<>();
        consultingSlides.add(new CategorySlide("사업계획서·투자제안서", 21, "/img/index/carousel/category-61.png"));
        consultingSlides.add(new CategorySlide("인사·노무", 22, "/img/index/carousel/category-62.png"));

        sliders.put("디자인 카테고리", designSlides);
        sliders.put("IT·프로그래밍 카테고리", itSlides);
        sliders.put("비즈니스컨설팅 카테고리", consultingSlides);

        model.addAttribute("categorySliders", sliders);

        // 랭킹 데이터
/*        List<RankingSection> rankings = List.of(
                new RankingSection("디자인", List.of(
                        new Rank(1, "홍길동", "150,000,000원"),
                        new Rank(2, "김디자이너", "100,000,000원"),
                        new Rank(3, "박그래픽", "80,000,000원")
                )),
                new RankingSection("IT", List.of(
                        new Rank(1, "개발짱", "200,000,000원"),
                        new Rank(2, "백엔드왕", "160,000,000원")
                ))
        );
        model.addAttribute("rankings", rankings);*/



        return "home";
    }



}
