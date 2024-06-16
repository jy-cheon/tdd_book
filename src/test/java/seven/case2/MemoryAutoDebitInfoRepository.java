package seven.case2;

import java.util.HashMap;
import java.util.Map;

/* 대역을 사용하면 DB 없이 AutoDebitRegister 를 테스트할 수 있다. */
/*
public class MemoryAutoDebitInfoRepository implements AutoDebitInfoRepository {
    private Map<String, AutoDebitInfo> infos = new HashMap<>();
    @Override
    public void save(AutoDebitInfo info) {
        infos.put(info.getUserId, info);
    }

    @Override
    public AutoDebitInfo findOne(String userId) {
        return infos.get(userId);
    }
}
*/
