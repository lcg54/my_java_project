package ch00_utility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class CalToday {

    // Calendar 방식 (구형)
    @Override
    public String toString() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // 0부터 시작하므로 +1
        int day = cal.get(Calendar.DAY_OF_MONTH);

        return "금일은 " + year + "년 " + month + "월 " + day + "일 입니다.";
    }

    // LocalDate 방식 (신형)
    public void calToday2() {
        LocalDate loc = LocalDate.now();
        int year = loc.getYear();
        int month = loc.getMonthValue();
        int day = loc.getDayOfMonth();

        System.out.println("금일은 " + year + "년 " + month + "월 " + day + "일 입니다.");
    }

    public void calDday() {
        // D-day 구하기
        LocalDate today = LocalDate.now(); // 오늘 날짜
        LocalDate targetDate = LocalDate.of(2025, 12, 25); // 목표 날짜

        long daysBetween = ChronoUnit.DAYS.between(today, targetDate); // ChronoUnit으로 계산

        if (daysBetween > 0) {
            System.out.println("D-" + daysBetween + "일 남았습니다.");
        } else if (daysBetween == 0) {
            System.out.println("오늘이 D-day 입니다!");
        } else {
            System.out.println("D+" + Math.abs(daysBetween) + "일 지났습니다."); // Math.abs - 절댓값
        }
    }
}
