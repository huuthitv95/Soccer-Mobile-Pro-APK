package com.tiktok.appevents.edp;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class Sensig {
    public String regexList;
    public int version;

    public Sensig(int version, String regexList) {
        this.version = version;
        this.regexList = regexList;
        if (TextUtils.isEmpty(regexList)) {
            this.regexList = EDPConfig.DEFAULT_SENSIG_FILTERING_REGEX_LIST;
        }
    }

    public String getRegexList() {
        return this.regexList;
    }

    public int getVersion() {
        return this.version;
    }

    public void setRegexList(String regexList) {
        this.regexList = regexList;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
