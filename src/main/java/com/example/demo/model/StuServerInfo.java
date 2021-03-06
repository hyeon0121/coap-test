package com.example.demo.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("web_server_scenario")
public class StuServerInfo extends Student {
    int id;
    boolean connTest, multiThread, errorTest200, errorTest404, errorTest400, contentLengthTest, contentHtmlTest,
            contentImageTest, cookieTest;
    long elapsedTime;
    String date;

    public StuServerInfo(String sname, String sno, String sip, String sport, boolean connTest, boolean multiThread, boolean errorTest200, boolean errorTest404, boolean errorTest400, boolean contentLengthTest, boolean contentHtmlTest, boolean contentImageTest, boolean cookieTest, long elapsedTime) {
        super(sname, sno, sip, sport);
        this.connTest = connTest;
        this.multiThread = multiThread;
        this.errorTest200 = errorTest200;
        this.errorTest404 = errorTest404;
        this.errorTest400 = errorTest400;
        this.contentLengthTest = contentLengthTest;
        this.contentHtmlTest = contentHtmlTest;
        this.contentImageTest = contentImageTest;
        this.cookieTest = cookieTest;
        this.elapsedTime = elapsedTime;
    }

    public StuServerInfo(int id, String sname, String sno, String sip, String sport, boolean connTest, boolean multiThread, boolean errorTest200, boolean errorTest404, boolean errorTest400, boolean contentLengthTest, boolean contentHtmlTest, boolean contentImageTest, boolean cookieTest) {
        super(sname, sno, sip, sport);
        this.id = id;
        this.connTest = connTest;
        this.multiThread = multiThread;
        this.errorTest200 = errorTest200;
        this.errorTest404 = errorTest404;
        this.errorTest400 = errorTest400;
        this.contentLengthTest = contentLengthTest;
        this.contentHtmlTest = contentHtmlTest;
        this.contentImageTest = contentImageTest;
        this.cookieTest = cookieTest;
    }

    public boolean isConnTest() {
        return connTest;
    }

    public void setConnTest(boolean connTest) {
        this.connTest = connTest;
    }

    public boolean isMultiThread() {
        return multiThread;
    }

    public void setMultiThread(boolean multiThread) {
        this.multiThread = multiThread;
    }

    public boolean isErrorTest200() {
        return errorTest200;
    }

    public void setErrorTest200(boolean errorTest200) {
        this.errorTest200 = errorTest200;
    }

    public boolean isErrorTest404() {
        return errorTest404;
    }

    public void setErrorTest404(boolean errorTest404) {
        this.errorTest404 = errorTest404;
    }

    public boolean isErrorTest400() {
        return errorTest400;
    }

    public void setErrorTest400(boolean errorTest400) {
        this.errorTest400 = errorTest400;
    }

    public boolean isContentLengthTest() {
        return contentLengthTest;
    }

    public void setContentLengthTest(boolean contentLengthTest) {
        this.contentLengthTest = contentLengthTest;
    }

    public boolean isContentHtmlTest() {
        return contentHtmlTest;
    }

    public void setContentHtmlTest(boolean contentHtmlTest) {
        this.contentHtmlTest = contentHtmlTest;
    }

    public boolean isContentImageTest() {
        return contentImageTest;
    }

    public void setContentImageTest(boolean contentImageTest) {
        this.contentImageTest = contentImageTest;
    }

    public boolean isCookieTest() {
        return cookieTest;
    }

    public void setCookieTest(boolean cookieTest) {
        this.cookieTest = cookieTest;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                "connTest=" + connTest +
                ", multiThread=" + multiThread +
                ", errorTest200=" + errorTest200 +
                ", errorTest404=" + errorTest404 +
                ", errorTest400=" + errorTest400 +
                ", contentLengthTest=" + contentLengthTest +
                ", contentHtmlTest=" + contentHtmlTest +
                ", contentImageTest=" + contentImageTest +
                ", cookieTest=" + cookieTest +
                '}';
    }
}
