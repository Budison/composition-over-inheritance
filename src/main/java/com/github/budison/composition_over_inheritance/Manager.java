package com.github.budison.composition_over_inheritance;

/**
 * @author Kevin Nowak
 */
class Manager implements Employee {
    private Employee report;

    Manager(Employee staff) {
        report = staff;
    }

    void setReport(Employee staff) {
        report = staff;
    }

    @Override
    public void work() {
        report.work();
    }
}
