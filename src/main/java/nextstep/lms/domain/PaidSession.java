package nextstep.lms.domain;

import nextstep.users.domain.NsUser;

import java.time.LocalDateTime;
import java.util.List;

public class PaidSession extends Session{
    private int capacity;
    private int tuitionFee;

    public PaidSession(String name, LocalDateTime startDate, LocalDateTime endDate, CoverImage coverImage,
                       SessionStatus sessionStatus, List<NsUser> students, int capacity, int tuitionFee) {
        super(name, startDate, endDate, coverImage, sessionStatus, students);
        this.capacity = capacity;
        this.tuitionFee = tuitionFee;
    }

    public void enrollment(NsUser nsUser) throws Exception {
        if (super.students.size() == capacity) {
            throw new Exception("강의 최대 수강 인원을 초과할 수 없습니다.");
        }
        super.students.add(nsUser);
    }
}
