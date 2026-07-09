package learning;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入您的出生年份：");
        int year = sc.nextInt();
        System.out.print("请输入您的出生月份：");
        int month = sc.nextInt();
        System.out.print("请输入您的出生日期：");
        int day = sc.nextInt();

        // 1. 创建出生日期 LocalDate
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        // 2. 计算天数（ChronoUnit.DAYS.between）
        long livedays= ChronoUnit.DAYS.between(birthDate,today);
        // 3. 计算小时数（天数 × 24）
        long livehours=livedays*24;
        // 4. 计算分钟数（天数 × 24 × 60）
        long livemins=livehours*60;
        // 5. 计算周岁（Period.between 或 ChronoUnit.YEARS.between）
        long yearsnow=ChronoUnit.YEARS.between(birthDate,today);
        // 6. 计算下一个生日的倒计时
        long nextbirthday=ChronoUnit.DAYS.between(today,birthDate.plusYears(yearsnow+1));
        // 7. 输出结果
        System.out.println("您已经活了：" +'\n'+livedays+"天"+'\n'+livehours+"小时"+'\n'+livemins+"分钟"+'\n'+yearsnow+"岁"+'\n'+"距离下次生日还有"+nextbirthday+"天");
    }
}
