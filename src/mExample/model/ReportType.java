package mExample.model;

import java.util.ArrayList;

public class ReportType {
    public String visit_time;
    public String latitude;
    public String caption;
    public String multipart_id;
    public String topic;
    public String distributor_name;
    public String circle;
    public String visited_to_name;
    public String remarks;
    public String longitude;
    public ArrayList<DocumentList> documentList;

    public String getVisit_time() {
        return visit_time;
    }

    public void setVisit_time(String visit_time) {
        this.visit_time = visit_time;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getMultipart_id() {
        return multipart_id;
    }

    public void setMultipart_id(String multipart_id) {
        this.multipart_id = multipart_id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDistributor_name() {
        return distributor_name;
    }

    public void setDistributor_name(String distributor_name) {
        this.distributor_name = distributor_name;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public String getVisited_to_name() {
        return visited_to_name;
    }

    public void setVisited_to_name(String visited_to_name) {
        this.visited_to_name = visited_to_name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ArrayList<DocumentList> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(ArrayList<DocumentList> documentList) {
        this.documentList = documentList;
    }
}
