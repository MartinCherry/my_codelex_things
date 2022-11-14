package io.codelex.dateandtime.practice.exercise3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePeriod {
    private final LocalDate periodStart;
    private final LocalDate periodEnd;

    public DatePeriod(LocalDate periodStart, LocalDate periodEnd) {
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
    }

    public DatePeriod intersection(DatePeriod period) {
        LocalDate tempStart = null;
        LocalDate tempEnd = null;
        if (period.periodStart.isAfter(this.periodStart) && period.periodEnd.isBefore(this.periodEnd)) {
            tempStart = period.periodStart;
            tempEnd = period.periodEnd;
        }
        else if (this.periodStart.isAfter(period.periodStart) && this.periodEnd.isBefore(period.periodEnd)) {
            tempStart = this.periodStart;
            tempEnd = this.periodEnd;

        }
        else if (this.periodStart.isBefore(period.periodStart)) {

            if (this.periodEnd.isAfter((period.periodStart))) {
                tempEnd = this.periodEnd;
            }
            if (period.periodStart.isBefore(this.periodEnd)) {
                tempStart = period.periodStart;
            }
        }
        else {
            if (this.periodStart.isBefore(period.periodEnd)) {
                tempStart = this.periodStart;
            }
            if (period.periodEnd.isAfter(this.periodStart)) {
                tempEnd = period.periodEnd;
            }
        }

        if (tempStart != null && tempEnd != null) {
            return new DatePeriod(tempStart, tempEnd);
        }
        else {
            return null;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "Date period is from " + periodStart.format(formatter) + " to " + periodEnd.format(formatter);
    }
}
