package mExample.model;

public class SourceData {
    public String file_url;
    public String visited_to_role;
    public String address;
    public String visit_time;
    public String file_name;
    public String latitude;
    public String caption;
    public String type;
    public String multipart_id;
    public String file_type;
    public String topic;
    public String distributor_name;

    @Override
    public String toString() {
        return "SourceData{" +
                "file_url='" + file_url + '\'' +
                ", visited_to_role='" + visited_to_role + '\'' +
                ", address='" + address + '\'' +
                ", visit_time='" + visit_time + '\'' +
                ", file_name='" + file_name + '\'' +
                ", latitude='" + latitude + '\'' +
                ", caption='" + caption + '\'' +
                ", type='" + type + '\'' +
                ", multipart_id='" + multipart_id + '\'' +
                ", file_type='" + file_type + '\'' +
                ", topic='" + topic + '\'' +
                ", distributor_name='" + distributor_name + '\'' +
                ", visited_by_name='" + visited_by_name + '\'' +
                ", visited_to_number='" + visited_to_number + '\'' +
                ", circle='" + circle + '\'' +
                ", visited_to_name='" + visited_to_name + '\'' +
                ", remarks='" + remarks + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }

    public String visited_by_name;
    public String visited_to_number;
    public String circle;
    public String visited_to_name;
    public String remarks;
    public String longitude;

    public String getFile_url() {
        return file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }

    public String getVisited_to_role() {
        return visited_to_role;
    }

    public void setVisited_to_role(String visited_to_role) {
        this.visited_to_role = visited_to_role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVisit_time() {
        return visit_time;
    }

    public void setVisit_time(String visit_time) {
        this.visit_time = visit_time;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMultipart_id() {
        return multipart_id;
    }

    public void setMultipart_id(String multipart_id) {
        this.multipart_id = multipart_id;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
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

    public String getVisited_by_name() {
        return visited_by_name;
    }

    public void setVisited_by_name(String visited_by_name) {
        this.visited_by_name = visited_by_name;
    }

    public String getVisited_to_number() {
        return visited_to_number;
    }

    public void setVisited_to_number(String visited_to_number) {
        this.visited_to_number = visited_to_number;
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
}
