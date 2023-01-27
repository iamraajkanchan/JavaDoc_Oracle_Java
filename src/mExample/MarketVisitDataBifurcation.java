package mExample;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import mExample.model.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MarketVisitDataBifurcation {

    ArrayList<Root> rootList = new ArrayList<>();

    public static void main(String[] args)
    {
        MarketVisitDataBifurcation ma = new MarketVisitDataBifurcation();
        ma.main();
    }

    public void main()
    {
        Type sourceTypeData = new TypeToken<List<SourceData>>() {}.getType();

        List<SourceData> sourceDataList = new Gson().fromJson(dataResponseString, sourceTypeData);
        for (SourceData sourceData : sourceDataList)
        {
            System.out.println("Response :: "+sourceData.toString());
            convertToRequiredJson(sourceData);
        }

        System.out.println("Converted :: "+rootList);
    }

    public void convertToRequiredJson(SourceData sourceData)
    {
        System.out.println("convertToRequiredJson :: rootList.size() :: "+rootList.size());
        if(rootList.size() == 0)
        {
            addDataToNewJson(sourceData, 0, false);
        }
        else
        {
            CheckIfDataAvailable existVisitedListPosition = checkIfVisitedToNumberExist(sourceData);
            System.out.println("convertToRequiredJson :: existVisitedListPosition :: "+existVisitedListPosition);
            addDataToNewJson(sourceData, existVisitedListPosition.getDataPosition(), existVisitedListPosition.isDataAvailable());
        }
    }

    public void addDataToNewJson(SourceData sourceData, int existVisitedListPosition, boolean isDataAvailable)
    {
        if(isDataAvailable)
        {
            ReportDetail reportDetail = new ReportDetail();
            ArrayList<ReportDetail> reportDetailList = rootList.get(existVisitedListPosition).getReportDetails();

            ReportType reportType = new ReportType();
            ArrayList<ReportType> reportTypeList = new ArrayList<>();

            DocumentList documentList = new DocumentList();
            ArrayList<DocumentList> documentLists  = new ArrayList<>();

            reportDetail.setType(sourceData.type);
            reportDetailList.add(reportDetail);

            reportType.setVisit_time(sourceData.visit_time);
            reportType.setLatitude(sourceData.latitude);
            reportType.setCaption(sourceData.caption);
            reportType.setMultipart_id(sourceData.multipart_id);
            reportType.setTopic(sourceData.topic);
            reportType.setDistributor_name(sourceData.distributor_name);
            reportType.setCircle(sourceData.circle);
            reportType.setVisited_to_name(sourceData.visited_to_name);
            reportType.setRemarks(sourceData.remarks);
            reportType.setLongitude(sourceData.longitude);
            reportTypeList.add(reportType);
            reportDetail.setReportTypes(reportTypeList);


            documentList.setFile_type(sourceData.file_type);
            documentList.setFile_url(sourceData.file_url);
            documentList.setFile_name(sourceData.file_name);
            documentLists.add(documentList);
            reportType.setDocumentList(documentLists);

            rootList.get(existVisitedListPosition).setReportDetails(reportDetailList);
        }
        else
        {
            Root root = new Root();

            ReportDetail reportDetail = new ReportDetail();
            ArrayList<ReportDetail> reportDetailList = new ArrayList<>();

            ReportType reportType = new ReportType();
            ArrayList<ReportType> reportTypeList = new ArrayList<>();

            DocumentList documentList = new DocumentList();
            ArrayList<DocumentList> documentLists  = new ArrayList<>();

            root.setVisited_to_number(sourceData.visited_to_number);
            root.setVisited_to_role(sourceData.visited_to_role);
            root.setVisited_by_name(sourceData.visited_by_name);
            root.setAddress(sourceData.address);


            reportDetail.setType(sourceData.type);
            reportDetailList.add(reportDetail);
            root.setReportDetails(reportDetailList);


            reportType.setVisit_time(sourceData.visit_time);
            reportType.setLatitude(sourceData.latitude);
            reportType.setCaption(sourceData.caption);
            reportType.setMultipart_id(sourceData.multipart_id);
            reportType.setTopic(sourceData.topic);
            reportType.setDistributor_name(sourceData.distributor_name);
            reportType.setCircle(sourceData.circle);
            reportType.setVisited_to_name(sourceData.visited_to_name);
            reportType.setRemarks(sourceData.remarks);
            reportType.setLongitude(sourceData.longitude);
            reportTypeList.add(reportType);
            reportDetail.setReportTypes(reportTypeList);


            documentList.setFile_type(sourceData.file_type);
            documentList.setFile_url(sourceData.file_url);
            documentList.setFile_name(sourceData.file_name);
            documentLists.add(documentList);
            reportType.setDocumentList(documentLists);


            rootList.add(root);
        }


    }

    public CheckIfDataAvailable checkIfVisitedToNumberExist(SourceData sourceData)
    {
        CheckIfDataAvailable checkIfDataAvailable = new CheckIfDataAvailable();

        if(rootList.size() > 0)
        {
            for(int i = 0; i < rootList.size(); i++)
            {
                System.out.println("checkIfVisitedToNumberExist :: visited_to_number 1 :: "+rootList.get(i).visited_to_number);
                System.out.println("checkIfVisitedToNumberExist :: visited_to_number 2 :: "+sourceData.visited_to_number);
                if(rootList.get(i).visited_to_number.equalsIgnoreCase(sourceData.getVisited_to_number()))
                {
                    checkIfDataAvailable.setDataPosition(i);
                    checkIfDataAvailable.setDataAvailable(true);
                    return checkIfDataAvailable;
                }
            }
            checkIfDataAvailable.setDataPosition(0);
            checkIfDataAvailable.setDataAvailable(false);
            return checkIfDataAvailable;
        }
        checkIfDataAvailable.setDataPosition(0);
        checkIfDataAvailable.setDataAvailable(false);
        return checkIfDataAvailable;
    }

    public void checkIfTypeExist()
    {

    }

    private static final String dataResponseString = "[\n" +
            "    {\n" +
            "        \"file_url\": \"\",\n" +
            "        \"visited_to_role\": \"Retailer\",\n" +
            "        \"address\": \"Esperer Nutrition - Eligere Science - 4BA ,  4th Floor ,  B Wing ,  Gundecha Onclave ,  Khairani Road ,  Sakinaka ,  Ansa Industrial Estate ,  Chandivali ,  Andheri East ,  Mumbai\",\n" +
            "        \"visit_time\": \"2023-01-04 15:39:03.811\",\n" +
            "        \"file_name\": \"img_1672826911030.jpg\",\n" +
            "        \"latitude\": \"19.1063784\",\n" +
            "        \"caption\": \"\",\n" +
            "        \"type\": \"feedback\",\n" +
            "        \"multipart_id\": \"5441\",\n" +
            "        \"file_type\": \"img\",\n" +
            "        \"topic\": \"Mpower\",\n" +
            "        \"distributor_name\": \"I M ENTERPRISES\",\n" +
            "        \"visited_by_name\": \"Rajesh Shukla\",\n" +
            "        \"visited_to_number\": \"7066710649\",\n" +
            "        \"circle\": \"MNG\",\n" +
            "        \"visited_to_name\": \"7066710649-KRISHNA COMMUNICATION\",\n" +
            "        \"remarks\": \"test\",\n" +
            "        \"longitude\": \"72.8886075\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"file_url\": \"https:\\/\\/mpoweruat.vodafoneidea.com:8080\\/market-feedback-server\\/download.htm?entity=marketfeedbackImage&id=3582\",\n" +
            "        \"visited_to_role\": \"Retailer1\",\n" +
            "        \"address\": \"Esperer Nutrition - Eligere Science - 4BA ,  4th Floor ,  B Wing ,  Gundecha Onclave ,  Khairani Road ,  Sakinaka ,  Ansa Industrial Estate ,  Chandivali ,  Andheri East ,  Mumbai\",\n" +
            "        \"visit_time\": \"2023-01-04 15:40:42.169\",\n" +
            "        \"file_name\": \"img_1672826911030.jpg\",\n" +
            "        \"latitude\": \"19.1063784\",\n" +
            "        \"caption\": \"\",\n" +
            "        \"type\": \"feedback\",\n" +
            "        \"multipart_id\": \"5442\",\n" +
            "        \"file_type\": \"img\",\n" +
            "        \"topic\": \"Mpower\",\n" +
            "        \"distributor_name\": \"I M ENTERPRISES\",\n" +
            "        \"visited_by_name\": \"Rajesh Shukla\",\n" +
            "        \"visited_to_number\": \"7066710649\",\n" +
            "        \"circle\": \"MNG\",\n" +
            "        \"visited_to_name\": \"7066710649-KRISHNA COMMUNICATION\",\n" +
            "        \"remarks\": \"test\",\n" +
            "        \"longitude\": \"72.8886075\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"file_url\": \"https:\\/\\/mpoweruat.vodafoneidea.com:8080\\/market-feedback-server\\/download.htm?entity=marketfeedbackImage&id=3586\",\n" +
            "        \"visited_to_role\": \"Retailer\",\n" +
            "        \"address\": \"Esperer Nutrition - Eligere Science - 4BA ,  4th Floor ,  B Wing ,  Gundecha Onclave ,  Khairani Road ,  Sakinaka ,  Ansa Industrial Estate ,  Chandivali ,  Andheri East ,  Mumbai\",\n" +
            "        \"visit_time\": \"2023-01-04 15:40:42.169\",\n" +
            "        \"file_name\": \"img_1672826826901.jpg\",\n" +
            "        \"latitude\": \"19.1063784\",\n" +
            "        \"caption\": \"\",\n" +
            "        \"type\": \"feedback\",\n" +
            "        \"multipart_id\": \"5442\",\n" +
            "        \"file_type\": \"img\",\n" +
            "        \"topic\": \"Mpower\",\n" +
            "        \"distributor_name\": \"I M ENTERPRISES\",\n" +
            "        \"visited_by_name\": \"Rajesh Shukla\",\n" +
            "        \"visited_to_number\": \"7066710650\",\n" +
            "        \"circle\": \"MNG\",\n" +
            "        \"visited_to_name\": \"7066710650-KRISHNA COMMUNICATION\",\n" +
            "        \"remarks\": \"test\",\n" +
            "        \"longitude\": \"72.8886075\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"file_url\": \"https:\\/\\/mpoweruat.vodafoneidea.com:8080\\/market-feedback-server\\/download.htm?entity=marketfeedbackImage&id=3584\",\n" +
            "        \"visited_to_role\": \"Retailer\",\n" +
            "        \"address\": \"Esperer Nutrition - Eligere Science - 4BA ,  4th Floor ,  B Wing ,  Gundecha Onclave ,  Khairani Road ,  Sakinaka ,  Ansa Industrial Estate ,  Chandivali ,  Andheri East ,  Mumbai\",\n" +
            "        \"visit_time\": \"2023-01-04 15:40:42.169\",\n" +
            "        \"file_name\": \"GUJDistributor139268530SO09-2022-23000069File.pdf\",\n" +
            "        \"latitude\": \"19.1063784\",\n" +
            "        \"caption\": \"\",\n" +
            "        \"type\": \"feedback\",\n" +
            "        \"multipart_id\": \"5442\",\n" +
            "        \"file_type\": \"doc\",\n" +
            "        \"topic\": \"Mpower\",\n" +
            "        \"distributor_name\": \"I M ENTERPRISES\",\n" +
            "        \"visited_by_name\": \"Rajesh Shukla\",\n" +
            "        \"visited_to_number\": \"7066710650\",\n" +
            "        \"circle\": \"MNG\",\n" +
            "        \"visited_to_name\": \"7066710650-KRISHNA COMMUNICATION\",\n" +
            "        \"remarks\": \"test\",\n" +
            "        \"longitude\": \"72.8886075\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"file_url\": \"https:\\/\\/mpoweruat.vodafoneidea.com:8080\\/market-feedback-server\\/download.htm?entity=marketfeedbackImage&id=3585\",\n" +
            "        \"visited_to_role\": \"Retailer\",\n" +
            "        \"address\": \"Esperer Nutrition - Eligere Science - 4BA ,  4th Floor ,  B Wing ,  Gundecha Onclave ,  Khairani Road ,  Sakinaka ,  Ansa Industrial Estate ,  Chandivali ,  Andheri East ,  Mumbai\",\n" +
            "        \"visit_time\": \"2023-01-04 15:40:42.169\",\n" +
            "        \"file_name\": \"img_1672826878886.jpg\",\n" +
            "        \"latitude\": \"19.1063784\",\n" +
            "        \"caption\": \"\",\n" +
            "        \"type\": \"issue\",\n" +
            "        \"multipart_id\": \"5442\",\n" +
            "        \"file_type\": \"img\",\n" +
            "        \"topic\": \"Mpower\",\n" +
            "        \"distributor_name\": \"I M ENTERPRISES\",\n" +
            "        \"visited_by_name\": \"Rajesh Shukla\",\n" +
            "        \"visited_to_number\": \"7066710651\",\n" +
            "        \"circle\": \"MNG\",\n" +
            "        \"visited_to_name\": \"7066710649-KRISHNA COMMUNICATION\",\n" +
            "        \"remarks\": \"test\",\n" +
            "        \"longitude\": \"72.8886075\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"file_url\": \"https:\\/\\/mpoweruat.vodafoneidea.com:8080\\/market-feedback-server\\/download.htm?entity=marketfeedbackImage&id=3583\",\n" +
            "        \"visited_to_role\": \"Retailer\",\n" +
            "        \"address\": \"Esperer Nutrition - Eligere Science - 4BA ,  4th Floor ,  B Wing ,  Gundecha Onclave ,  Khairani Road ,  Sakinaka ,  Ansa Industrial Estate ,  Chandivali ,  Andheri East ,  Mumbai\",\n" +
            "        \"visit_time\": \"2023-01-04 15:40:42.169\",\n" +
            "        \"file_name\": \"img_1672826867466.jpg\",\n" +
            "        \"latitude\": \"19.1063784\",\n" +
            "        \"caption\": \"\",\n" +
            "        \"type\": \"feedback\",\n" +
            "        \"multipart_id\": \"5442\",\n" +
            "        \"file_type\": \"img\",\n" +
            "        \"topic\": \"Mpower\",\n" +
            "        \"distributor_name\": \"I M ENTERPRISES\",\n" +
            "        \"visited_by_name\": \"Rajesh Shukla\",\n" +
            "        \"visited_to_number\": \"7066710649\",\n" +
            "        \"circle\": \"MNG\",\n" +
            "        \"visited_to_name\": \"7066710649-KRISHNA COMMUNICATION\",\n" +
            "        \"remarks\": \"test\",\n" +
            "        \"longitude\": \"72.8886075\"\n" +
            "    }\n" +
            "]";
}
