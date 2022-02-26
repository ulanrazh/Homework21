package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Кундордун атын консолго англис тилинде, чон тамга менен жазыныз: \n" +
                "Мисалы, [MONDAY, FRIDAY] ж.б.");
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();

        WeekDays weekDays = WeekDays.valueOf(dayOfWeek);

        switch (weekDays) {
            case MONDAY -> System.out.println(WeekDays.MONDAY + " куну жава окуйм");
            case TUESDAY -> System.out.println(WeekDays.TUESDAY + " куну англис тили сабагын окуйм");
            case WEDNESDAY -> System.out.println(WeekDays.WEDNESDAY + " куну жава окуйм");
            case THURSDAY -> System.out.println(WeekDays.THURSDAY + " куну практика болот");
            case FRIDAY -> System.out.println(WeekDays.FRIDAY + " куну жава окуйм");
            case SATURDAY -> System.out.println(WeekDays.SATURDAY + " java боюнча практика кылам");
            case SUNDAY -> System.out.println(WeekDays.SUNDAY + " эс алуу кун");
            }

    }
}
