package com.example.android.androidquestions.List;

import java.io.Serializable;

/**
 * Created by AMEEN on 20/03/2018.
 */

public class Question implements Serializable {

    String myName;
    String qName;
    String qAnsr;
    int qStatus;

    public Question() {

    }

    public Question(String myName) {
        this.myName = myName;
    }

    public Question(String qName, String qAnsr) {
        this.qName = qName;
        this.qAnsr = qAnsr;
    }

    public Question(String qName, String qAnsr, int qStatus) {
        this.qName = qName;
        this.qAnsr = qAnsr;
        this.qStatus = qStatus;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getqName() {
        return qName;
    }

    public void setqName(String qName) {
        this.qName = qName;
    }

    public String getqAnsr() {
        return qAnsr;
    }

    public void setqAnsr(String qAnsr) {
        this.qAnsr = qAnsr;
    }

    public int getqStatus() {
        return qStatus;
    }

    public void setqStatus(int qStatus) {
        this.qStatus = qStatus;
    }

}
