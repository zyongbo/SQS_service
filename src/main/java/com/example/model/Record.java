package com.example.model;

/**
 * @author sanguan.tangsicheng on 2017/7/21 下午3:04
 */
public class Record {

    public Record(){ }

    private String messageBody;

    private Long visibleFrom;

    public void setVisibleFrom(Long visibleFrom) {
        this.visibleFrom = visibleFrom;
    }

    public String getReceiptHandle() {
        return receiptHandle;
    }

    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }

    private String receiptHandle;

    public String getMessageBody() {
        return messageBody;
    }

    public Long getVisibleFrom() {
        return visibleFrom;
    }

    private Record withMessageBody(String messageBody){
        this.messageBody = messageBody;
        return this;
    }

    private Record withVisibleFrom(Long visibleFrom){
        this.visibleFrom = visibleFrom;
        return this;
    }

    public static Record create(Long visibleFrom,String message){
        Record r = new Record();
        return r.withVisibleFrom(visibleFrom).withMessageBody(message);
    }



}