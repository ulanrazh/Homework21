package com.company;

import java.util.StringJoiner;

public enum WeekDays {
    MONDAY("Дуйшомбу"),
    TUESDAY("Шейшенби"),
    WEDNESDAY("Шаршемби"),
    THURSDAY("Бейшенби"),
    FRIDAY("Жума"),
    SATURDAY("Ишемби"),
    SUNDAY("Жекшемби");

    private String daysInKyrgyzLang;

    WeekDays() {
    }

    WeekDays(String daysInKyrgyzLang) {
        this.daysInKyrgyzLang = daysInKyrgyzLang;
    }

    public String getDaysInKyrgyzLang() {
        return daysInKyrgyzLang;
    }

    public void setDaysInKyrgyzLang(String daysInKyrgyzLang) {
        this.daysInKyrgyzLang = daysInKyrgyzLang;
    }

    @Override
    public String toString() {
        return daysInKyrgyzLang;
    }
}
