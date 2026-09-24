package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FilterWord {

    /* JADX INFO: renamed from: ik */
    private boolean f7912ik;

    /* JADX INFO: renamed from: ka */
    private List<FilterWord> f7913ka;

    /* JADX INFO: renamed from: lr */
    private String f7914lr;

    /* JADX INFO: renamed from: ri */
    private String f7915ri;

    public FilterWord() {
    }

    public FilterWord(String str, String str2) {
        this.f7915ri = str;
        this.f7914lr = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.f7913ka == null) {
            this.f7913ka = new ArrayList();
        }
        this.f7913ka.add(filterWord);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.f7915ri;
    }

    public boolean getIsSelected() {
        return this.f7912ik;
    }

    public String getName() {
        return this.f7914lr;
    }

    public List<FilterWord> getOptions() {
        return this.f7913ka;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.f7913ka;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.f7915ri) || TextUtils.isEmpty(this.f7914lr)) ? false : true;
    }

    public void setId(String str) {
        this.f7915ri = str;
    }

    public void setIsSelected(boolean z) {
        this.f7912ik = z;
    }

    public void setName(String str) {
        this.f7914lr = str;
    }
}
