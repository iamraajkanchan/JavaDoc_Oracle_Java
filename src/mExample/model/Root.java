package mExample.model;

import java.util.ArrayList;

public class Root{
    public String visited_to_number;
    public String visited_to_role;
    public String visited_by_name;
    public String address;
    public ArrayList<ReportDetail> reportDetails;

    public String getVisited_to_number() {
        return visited_to_number;
    }

    public void setVisited_to_number(String visited_to_number) {
        this.visited_to_number = visited_to_number;
    }

    public String getVisited_to_role() {
        return visited_to_role;
    }

    public void setVisited_to_role(String visited_to_role) {
        this.visited_to_role = visited_to_role;
    }

    public String getVisited_by_name() {
        return visited_by_name;
    }

    public void setVisited_by_name(String visited_by_name) {
        this.visited_by_name = visited_by_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<ReportDetail> getReportDetails() {
        return reportDetails;
    }

    public void setReportDetails(ArrayList<ReportDetail> reportDetails) {
        this.reportDetails = reportDetails;
    }
}
