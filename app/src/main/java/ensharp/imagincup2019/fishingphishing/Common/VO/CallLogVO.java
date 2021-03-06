package ensharp.imagincup2019.fishingphishing.Common.VO;

public class CallLogVO {

    private String phoneNumber;
    private String detail;  // 수신/발신/부재중 등
    private String date;
    private String time;
    private String category;
    private String period;
    private String record;
    private AnalysisVO analysis;
    private int tag;

    public CallLogVO(String phoneNumber, String detail, String date, String time, String category, String period, String record, AnalysisVO analysis) {
        this.phoneNumber = phoneNumber;
        this.detail = detail; // phoneType(수신/발신/부재중 등)
        this.date = date;
        this.time = time;
        this.category = category;   // callType(수신/발신/부재중 등)
        this.period = period;       // duration
        this.record = record;       // audio record file
        this.analysis = analysis;
    }

    public CallLogVO(CallLogVO callLogVO) {
        this.phoneNumber = callLogVO.getPhoneNumber();
        this.detail = callLogVO.getDetail();
        this.date = callLogVO.getDate();
        this.time = callLogVO.getTime();
        this.category = callLogVO.getCategory();
        this.period = callLogVO.getPeriod();
        this.record = callLogVO.getRecord();
        this.analysis = callLogVO.getAnalysis();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDetail() {
        return detail;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getCategory() {
        return category;
    }

    public String getPeriod() {
        return period;
    }

    public String getRecord() {
        return record;
    }

    public AnalysisVO getAnalysis() {
        return analysis;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}
