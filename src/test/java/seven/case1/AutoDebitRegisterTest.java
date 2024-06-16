package seven.case1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*
* 테스트 대상에 의존하는 요인이 있다
* >> 대역의 필요성
* */
/*public class AutoDebitRegisterTest {
    private AutoDebitRegister register;

    @BeforeEach
    void setUp() {
        CardNumberValidator validator = new CardNumberValidator();
        AutoDebitInfoRepository repository = new JpaAutoDebitInfoRepository();
        register = new AutoDebitRegister(validator, repository);
    }

    @Test
    void validCard() {
        // 업체에서 받은 테스트용 유효한 카드번호 사용
        AutoDebitReq req = new AutoDebitReq("user1", "1234123412341234");
        RegisterResult result = this.register.register(req);
        assertEquals(CardValidity.VALID, result.getValidity());
    }

    @Test
    void stolenCard() {
        // 업체에서 받은 테스트용 도난 카드번호 사용
        AutoDebitReq req = new AutoDebitReq("user1", "1002200230034004");
        RegisterResult result = this.register.register(req);
        assertEquals(CardValidity.STOLEN, result.getValidity());
    }
}*/
