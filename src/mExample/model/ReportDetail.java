package mExample.model;

import java.util.ArrayList;

public class ReportDetail{
    public String type;

    public ArrayList<ReportType> reportTypes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<ReportType> getReportTypes() {
        return reportTypes;
    }

    public void setReportTypes(ArrayList<ReportType> reportTypes) {
        this.reportTypes = reportTypes;
    }
}
